javac Road2.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java Road2 <./circlecross_bronze_feb17/$VARIABLE.in >./test.out
    diff ./circlecross_bronze_feb17/$VARIABLE.out ./test.out
done
rm test.out