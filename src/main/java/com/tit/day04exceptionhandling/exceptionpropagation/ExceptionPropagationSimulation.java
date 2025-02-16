package com.tit.day04exceptionhandling.exceptionpropagation;

// Creating a class ExceptionPropagationSimulation to demonstrate exception propagation
public class ExceptionPropagationSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of ExceptionPropagation
        ExceptionPropagation ep = new ExceptionPropagation();

        try {
            // Calling method2 which calls method1 and propagates the exception
            ep.method2();
        }
        catch (ArithmeticException e)
        {
            // Catching and handling the exception in main()
            System.out.println("Handled exception in main");
        }
    }
}
