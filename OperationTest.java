//src
└── Operation
    ├── Addition.java
    └── Maximum.java 
    
//Addition.java
package Operation;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }
}

//Maximum.java
package Operation;

public class Maximum {
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }
}

//OperationTest.java

import Operation.Addition;
import Operation.Maximum;

public class OperationTest {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Maximum maximum = new Maximum();

        int sum = addition.add(5, 10);
        float difference = addition.subtract(5.5f, 2.5f);
        int max = maximum.max(20, 30);

        System.out.println("Sum of 5 and 10: " + sum);
        System.out.println("Difference of 5.5 and 2.5: " + difference);
        System.out.println("Maximum of 20 and 30: " + max);
    }
}
