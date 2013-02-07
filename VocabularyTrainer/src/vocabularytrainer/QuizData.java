/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabularytrainer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jan
 */
public class QuizData {
    
    private int current;
    private CardDrawing cardDrawing;
    private Map<Integer, VocabCard> vocabMap;
    
    public QuizData() {
        vocabMap = new HashMap<Integer, VocabCard>();
        cardDrawing = new CycleRandom();
    }
    
    public int sizeVocab() {
        return vocabMap.size();
    }
    
    public void drawNext() {
        current = cardDrawing.getNextVocabId(current);
    }
    
    public VocabCard getCurrentVocabCard(int current) {
        return vocabMap.get(current);
    }
}
