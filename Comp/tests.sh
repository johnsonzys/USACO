javac abc.java
for VARIABLE in 1 2 3 4 5 6 7 8 9 10
do
    cp prob1_bronze_dec20/$VARIABLE.in ./abc.in
    java abc
    F='diff abc.out prob1_bronze_dec20/$VARIABLE.out'
    if [[ -z "$F" ]]
    then 
        echo "PASS Test $VARIABLE"
    else
        echo "FAIL Test $VARIABLE"
    fi
done
rm abc.in
rm abc.out