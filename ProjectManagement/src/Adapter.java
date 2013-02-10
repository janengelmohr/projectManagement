
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jan
 */
public class Adapter implements IProject {
    
    Project target;
    
    public Adapter(String name, String description, double rate) {
        this.target = new Project(name, description, rate);
    }
    

    @Override
    public double getDuration() {
        return target.getDuration();
    }

    @Override
    public double getTotalCost() {
        return target.getTotalCost();
    }

    @Override
    public List<Deliverable> getDeliverables() {
        Set<Calendar> dates = target.allDeliverables().keySet();
                List<Deliverable> resultList = new ArrayList<Deliverable>(); 
                
                for(Calendar key : dates)
                {
                        resultList.addAll(target.allDeliverables().get(key));
                }
                return resultList;
    }

    @Override
    public void setTask(Task task) {
        target.setTask(task);
    }
}
