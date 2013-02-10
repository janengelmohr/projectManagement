import java.util.Set;


public abstract class ProjectItem {

	private String name;
	private String details;
	private double rate;
	
	public ProjectItem(String name, String details, double rate) {
		
		this.name=name;
		this.details=details;
		this.rate=rate;
	}
	
	public void setDetails(String newDetails) {
		
		this.details=newDetails;
	}
	
	public double getCostEstimate() {
		return getTimeRequired()*rate + getMaterialsCost();
	}
	
	public Set<Deliverable> allDeliverables() {
		return null;
	}
	
	public abstract double getTimeRequired();
	
	public abstract double getMaterialsCost();
}
