package com.tit.day03javastreams.readinputfromconsole;

// Creating a class UserInfoSimulation to demonstrate reading user input and saving to a file
public class UserInfoSimulation
{
    public static void main(String[] args)
    {
        // Creating an object of UserInfo
        UserInfo userInfo = new UserInfo();

        // File name to save the user information
        String fileName = "src/main/java/com/tit/day03javastreams/readinputfromconsole";

        // Read and save user information
        userInfo.readAndSaveUserInfo(fileName);
    }
}
