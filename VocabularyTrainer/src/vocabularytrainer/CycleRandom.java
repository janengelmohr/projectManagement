/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabularytrainer;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jan
 */
public class CycleRandom extends CardDrawing {
    
    List cycleList;
    
    private void initializeCycleList(int size) {
        cycleList = new LinkedList();
        for(int i=0; size>=i; i++) {
            cycleList.add(i);
        }
    }
    
    @Override
    public int getNextVocabId(int size) {
        if((cycleList==null)||(cycleList.isEmpty())) {
            initializeCycleList(size);
        }
        return removeRandomFromCycleList();
    }
    
    private int removeRandomFromCycleList() {
        int rand = super.random(cycleList.size());
        cycleList.remove(rand);
        return rand;
    }
}
