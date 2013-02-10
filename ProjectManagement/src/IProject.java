
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jan
 */
public interface IProject {
    
    public double getDuration();
    
    public double getTotalCost();
    
    public List<Deliverable> getDeliverables();
    
    public void setTask(Task task);
    
}
