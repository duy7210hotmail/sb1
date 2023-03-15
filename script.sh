#!/usr/bin/bash
echo $1

#When trouble with {new line} delimeter
#change line endcoding
#sed -i -e 's/\r$//'
#dos2unix -k -o filename.sh 
#cat script.sh | sed -i -e 's/\r$//' >> _script.sh
#sed -i -e 's/^M$//'
#EOL conversion

vi src/main/java/com/diduy/Application/$1.java
