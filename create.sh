#!/bin/bash
if [[ $# -ne 2 ]]; then
    echo "Usage: $0 <problem_number> <problem_type>"
    echo "problem_type must be one of: Easy, Medium, Hard"
    exit 1
fi

PROBLEM_NUMBER=$1
CLASS_NAME="Solution"
SRC_DIR="src/main/java"
TEST_DIR="src/test/java"
PROBLEM_TYPE=$2

echo "entered values are $1 , $2"

# Create the package directory structure
mkdir -p $SRC_DIR/$PROBLEM_TYPE/$PROBLEM_NUMBER
echo $SRC_DIR/$PROBLEM_TYPE/$PROBLEM_NUMBER
echo $TEST_DIR

# Create the Java class file
cat <<EOL >$SRC_DIR/$PROBLEM_TYPE/$PROBLEM_NUMBER/${CLASS_NAME}.java
package $PROBLEM_TYPE.$PROBLEM_NUMBER;

public class $CLASS_NAME {

    // TODO: Implement class methods and properties

}
EOL

# Create the test file
cat <<EOL >$TEST_DIR/SolutionsTest/${PROBLEM_NUMBER}.java
package SolutionsTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import $PROBLEM_TYPE.$PROBLEM_NUMBER.Solution;

public class ${PROBLEM_NUMBER} {
    
    Solution solution = new Solution();

    @Test
    void testExample() {
        
        assertNotNull(instance);
    }

}
EOL

echo "Java class and test file created successfully."
