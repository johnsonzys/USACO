javac AngryCows.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java AngryCows <./angry_bronze_jan16/$VARIABLE.in >./test.out
    diff ./angry_bronze_jan16/$VARIABLE.out ./test.out
done
rm test.out