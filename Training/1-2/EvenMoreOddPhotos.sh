javac EvenMoreOddPhotos.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java EvenMoreOddPhotos <./prob2_bronze_jan21/$VARIABLE.in >./test.out
    diff ./prob2_bronze_jan21/$VARIABLE.out ./test.out
done
rm test.out