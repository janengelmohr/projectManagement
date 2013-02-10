import java.util.Calendar;


public class Deliverable extends ProjectItem{
	
	private double materialCost;
	private double productionTime;
	private Calendar date;

	public Deliverable(String name, String details, double materialCost, double productionTime, double rate, Calendar date) {
		
		super(name,details,rate);
		this.materialCost=materialCost;
		this.productionTime=productionTime;
		this.date=date;
	}

	@Override
	public double getTimeRequired() {

		return productionTime;
	}

	@Override
	public double getMaterialsCost() {

		return materialCost;
	}
	
	public Calendar getDate() {
		
		return date;
	}

}
