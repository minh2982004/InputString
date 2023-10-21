package controller;


 


import common.Algorithm;
import view.Menu;


public class AnalysisString extends Menu<String>{
    static String[] options = {"Input", "Result", "Exit"};
    Algorithm ar;

    public AnalysisString() {
        super("==== ANALYSIS STRING PROGRAM =====", options);
        ar = new Algorithm();
    }
    @Override
    public void execute(int n) {
        switch(n) {
            case 1: ar.getInput();
            break;
            case 2: ar.getResult();
            break;
            case 3: System.exit(0);
            break;
        }
    }
}