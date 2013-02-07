/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabularytrainer;

/**
 *
 * @author jan
 */
public class CompletelyRandom extends CardDrawing {
    
    @Override
    public int getNextVocabId(int size) {
       return super.random(size);
    }
}
