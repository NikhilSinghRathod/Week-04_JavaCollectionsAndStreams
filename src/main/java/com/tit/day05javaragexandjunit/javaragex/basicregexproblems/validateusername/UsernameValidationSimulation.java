package com.tit.day05javaragexandjunit.javaragex.basicregexproblems.validateusername;

// Creating a class UsernameValidationSimulation to demonstrate username validation
public class UsernameValidationSimulation
{
    public static void main(String[] args)
    {
        // Example usernames for testing
        String[] usernames = {"user_123", "123user", "use", "Valid_User123"};

        // Validate each username and print whether it is valid or invalid
        for (String username : usernames)
        {
            if (UsernameValidator.isValidUsername(username))
            {
                System.out.println(username + " → Valid");
            }
            else
            {
                System.out.println(username + " → Invalid");
            }
        }
    }
}