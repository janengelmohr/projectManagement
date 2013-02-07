/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabularytrainer;

/**
 *
 * @author jan
 */
public class QuizProcess {
    
    State currentState;
    State askingState = new AskingState();
    State solutionState = new SolutionState();
    State startState = new SolutionState();
    QuizData data;
    
    public QuizProcess() {
        
    }
    
    public void run() {
        currentState = startState;
        data = new QuizData();
        currentState.startProcess();
        while(true) {
            currentState.updated();
            currentState.updateUI();
        }
    }
    
    private void setState(State s) {
        currentState=s;
    }
    
    private QuizData getData() {
        return data;
    }
    
    private String readUserInput() {
        
    }
    
    abstract class State {
    
        void updateUI() {
            
        }
        
        void startProcess() {
            
        }
        
        void input() {
            
        }
        
        void updated() {
            
        }
    }
    

    class SolutionState extends State {
    
    }
    
    class StartState extends State {
        
    }
    
    class AskingState extends State {
        
    }
}

