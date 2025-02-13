package com.tit.day02javacollections.extra.votingsystem;

// Creating a class VotingSystemSimulation to demonstrate the VotingSystem
public class VotingSystemSimulation
{
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting some votes
        votingSystem.vote("Alice");
        votingSystem.vote("Bob");
        votingSystem.vote("Alice");
        votingSystem.vote("Carol");
        votingSystem.vote("Bob");

        // Displaying the results in sorted order
        System.out.println("Results in sorted order: " + votingSystem.getResults());

        // Displaying the order of votes
        System.out.println("Order of votes: " + votingSystem.getVoteOrder());
    }
}

