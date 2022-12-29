javac BlockGame.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java BlockGame <./blocks_bronze_dec16/$VARIABLE.in >./test.out
    diff ./blocks_bronze_dec16/$VARIABLE.out ./test.out
done
rm test.out