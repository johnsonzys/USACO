javac MilkMeasurement_t.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java MilkMeasurement_t <./measurement_bronze_dec17/$VARIABLE.in >./test.out
    diff ./measurement_bronze_dec17/$VARIABLE.out ./test.out
done
rm test.out