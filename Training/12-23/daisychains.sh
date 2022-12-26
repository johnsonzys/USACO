javac DaisyChains.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java DaisyChains <./prob2_bronze_dec20/$VARIABLE.in >./test.out
    diff ./prob2_bronze_dec20/$VARIABLE.out ./test.out
done
rm test.out