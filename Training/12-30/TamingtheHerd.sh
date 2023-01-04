javac TamingtheHerd.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java TamingtheHerd <./taming_bronze_feb18/$VARIABLE.in >./test.out
    diff ./taming_bronze_feb18/$VARIABLE.out ./test.out
done
rm test.out