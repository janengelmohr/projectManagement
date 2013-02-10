import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Project {

	private ProjectItem myTask;
	private String name;
	private String description;
	
	public Project(String name, String description, double rate) {
		this.name=name;
		this.description=description;
                myTask = new Task(name, description, rate);
	}
	
	public String getName() {
		return name;
	}
        
        public String getDescription() {
            return description;
        }
	
	public double getDuration() {
		
		return myTask.getTimeRequired();
	}
	
	public double getTotalCost() {
		
		return myTask.getMaterialsCost();
	}
	
  public Map<Calendar, List<Deliverable>> allDeliverables(){
                Map<Calendar, List<Deliverable>> resultMap = new HashMap<Calendar,List<Deliverable>>();
                Set<Deliverable> allDeliverables = myTask.allDeliverables();
                
                /* Put all Deliverables in the List, if a Deliverable has the
                 * same key (date) then put it in the list of the existing one
                 * ortherwise make a new list
                 */
                for(Deliverable item: allDeliverables) {
                        List<Deliverable> list = resultMap.get(item.getDate());
                        
                        /* list is empty, that means that there is no entry in the map*/
                        if(list == null)
                                resultMap.put(item.getDate(), list = new ArrayList<Deliverable>());
                        
                        /* list is a actual "pointer" to the list*/
                        list.add(item);
                }
                return resultMap;
    }
        
	public void setTask(Task newTask) {
		
		myTask=newTask;
	}
}
