package org.example.lambdas_and_functional_interfaces;

public class CodingFunctionalInterfaces {

    public interface Sprint {
        public void print(int speed);
    }

    public class Tiger implements Sprint{
        public void print(int speed) {
            System.out.println("Animal sprinting fast " + speed);
        }
    }


}
