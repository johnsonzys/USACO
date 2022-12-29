javac BovineGenomics.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    echo Test $VARIABLE:
    java BovineGenomics <./cownomics_bronze_open17/$VARIABLE.in >./test.out
    diff ./cownomics_bronze_open17/$VARIABLE.out ./test.out
done
rm test.out