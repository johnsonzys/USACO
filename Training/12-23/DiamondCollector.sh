javac DiamondCollector.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java DiamondCollector <./diamond_bronze_open16/$VARIABLE.in >./test.out
    diff ./diamond_bronze_open16/$VARIABLE.out ./test.out
done
rm test.out