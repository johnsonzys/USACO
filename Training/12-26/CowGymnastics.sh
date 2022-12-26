javac CowGymnastics.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java CowGymnastics <./gymnastics_bronze_dec19/$VARIABLE.in >./test.out
    diff ./gymnastics_bronze_dec19/$VARIABLE.out ./test.out
done
rm test.out