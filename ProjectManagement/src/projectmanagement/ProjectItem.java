/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagement;

/**
 *
 * @author jan
 */
abstract class ProjectItem {
    private String name,  details;
    private double rate;
    
    public ProjectItem(String name, String details, double rate) {
        this.name=name;
        this.details=details;
        this.rate=rate;
    }
    
    public void setDetails(String newDetails) {
        details=newDetails;
    }
    
    public double getCostEstimate() {
        
    }
    
    public Set<Deliverable> allDeliverables() {
        
    }
    
    abstract double getTimeRequired() {
        
    }
    
    abstract double getMaterialCost() {
        
    }
}
