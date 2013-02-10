import java.util.*;


public class Task <T extends ProjectItem> extends ProjectItem{
	
	private Set<T> projectItem;

	public Task(String name, String details, double rate) {
		
		super(name, details, rate);
		projectItem = new HashSet<T>();
	}



        @Override
	public Set<Deliverable> allDeliverables() {
		
		Set<Deliverable> deli = new HashSet<Deliverable>();
		
		for(T t : projectItem) {
                    if(t.getClass().equals(Deliverable.class)) {
			deli.add((Deliverable)t);
                    }
                    else {
                        deli.addAll(t.allDeliverables());
                        }
                    }
                 return deli;
        }
        
	@Override
	public double getTimeRequired() {
		double time=0;
		Set<Deliverable> deli = new HashSet<Deliverable>();
		for(T t : projectItem) {
                    if(t.getClass().equals(Deliverable.class)) {
			deli.add((Deliverable)t);
                    }
                    else {
                        deli.addAll(t.allDeliverables());
                    }
                    
                    for(Deliverable del : deli) {
                        time = time + del.getTimeRequired();
                    }
                }
                return time;
	}
	
	public double getMaterialsCost() {
                double costs=0;
		Set<Deliverable> deli = new HashSet<Deliverable>();
		for(T t : projectItem) {
                    if(t.getClass().equals(Deliverable.class)) {
			deli.add((Deliverable)t);
                    }
                    else {
                        deli.addAll(t.allDeliverables());
                    }
                    
                    for(Deliverable del : deli) {
                        costs = costs + del.getMaterialsCost();
                    }
                }
                return costs;
        }
	
	public void addProjectItem(T pi) {
		projectItem.add(pi);
	}
	
	public void removeProjectItem(T pi) {
		projectItem.remove(pi);
	}
}
