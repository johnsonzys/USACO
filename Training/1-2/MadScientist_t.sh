javac MadScientist_t.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java MadScientist_t <./breedflip_bronze_feb20/$VARIABLE.in >./test.out
    diff ./breedflip_bronze_feb20/$VARIABLE.out ./test.out
done
rm test.out