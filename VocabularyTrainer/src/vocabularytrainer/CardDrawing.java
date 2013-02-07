/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabularytrainer;

/**
 *
 * @author jan
 */
abstract class CardDrawing {
    
    
    abstract int getNextVocabId(int vocabSize);
    
    public int random(int max) {
        return (int)Math.floor(Math.random() * max) + 1;
    }
}
