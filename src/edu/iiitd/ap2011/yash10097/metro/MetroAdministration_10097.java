package edu.iiitd.ap2011.yash10097.metro;

/**
*
* @author yash10097
* 
*/

/**
* MetroAdministration_10097 class which keeps track of the existing
* metro lines along with the number of stations, number of junctions
* and other details
*/

public class MetroAdministration_10097 {
	
	public double totalLength;
	/**
	 * Variable to keep count of number of stations
	 */
	private int noOfStations;
	
	/**
	 * Variable to keep count of number of junctions
	 */
	public int noOfJunctions;
	public int noOfTrains;
	
	
	/**
	 * constructor
	 */
	MetroAdministration_10097()
	{   noOfStations=142;  
	    noOfJunctions=8;
	    noOfTrains=188;
	    totalLength=189.7;
	}//constructor
	
	/**
     * Changes number of stations on the line
     */
	public void setnumberOfStations(int num){
	     noOfStations=num;
    }    
	/**
     * Changes number of junctions on the line
     */
    public void setnumberOfJunctions(int num){
        noOfJunctions=num;
    }	
    
    public int getnumberOfStations(){
    	return noOfStations;
    }
    
    public int getnumberOfJunctions(){
    	return noOfJunctions;
    }
    public void setnumberOfTrains(int num){
        noOfTrains=num;
    }	
    
    public int getnumberOfTrains(){
    	return noOfTrains;
    }
    
    public double gettotalLength(){
    	return totalLength;
    }
    public void settotalLength(double num){
        totalLength=num;
    }
}//MetroAdministration_10097










