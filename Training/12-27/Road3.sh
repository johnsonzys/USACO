javac Road3.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java Road3 <./cowqueue_bronze_feb17/$VARIABLE.in >./test.out
    diff ./cowqueue_bronze_feb17/$VARIABLE.out ./test.out
done
rm test.out