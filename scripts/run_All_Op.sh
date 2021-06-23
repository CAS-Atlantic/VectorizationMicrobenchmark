#!/bin/bash

echo "Running All Op SIMD script."

echo "Starting compilation."
time /local_scratch/openj9omr/openj9-openjdk-jdk11/build/linux-aarch64-normal-server-release/jdk/bin/javac *.java

TIMEFORMAT='%3R'

echo "Warmup_time, Measured_time" |& tee -a AllOp.csv

x=1
while [ $x -le 10 ]
do
	#time /local_scratch/openj9omr/openj9-openjdk-jdk11/build/linux-aarch64-normal-server-release/jdk/bin/javac VectorizationMicroBenchmark.java
	sleep 1
	{ /local_scratch/openj9omr/openj9-openjdk-jdk11/build/linux-aarch64-normal-server-release/jdk/bin/java -Xms4G -Xmx4G VectorizationMicroBenchmark All Op ; } |& tee -a AllOp.csv
	sleep 1

	x=$(( $x + 1 ))
done

unset TIMEFORMAT
mv AllOp.csv "$(date +"%FT%H_%M_%S")_AllOp.csv"

time ./run_master_All_Op.sh
