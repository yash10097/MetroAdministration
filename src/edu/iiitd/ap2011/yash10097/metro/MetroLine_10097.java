package edu.iiitd.ap2011.yash10097.metro;

import java.util.ArrayList;

/**
*
* @author yash10097
* 
* An abstract MetroLine class which contains functions to be used
* by the child classes 
* 
*/


public abstract class MetroLine_10097 {
    /**
     * @return int- maximum speed of metro on line
     */
	abstract public int gettopspeed();
	
	/**
	 * 
	 * @return double - Distance covered by line
	 */
	abstract public double getLength();
	
	/**
	 * 
	 * @return int - number of trains on line
	 */
	abstract public int getNoOfTrains();
	
	/**
     * @return int - frequency of trains running on the line
     */
	abstract public int getfrequency();
	
	/**
     * @return int - number of stations on the line
     */
	abstract public int getnumberOfStations();
	
	/**
     * @return int - number of junctions on the line
     */
	abstract public int getnumberOfJunctions();
	
	/**
	 * @return String - Junction name
	 */
	abstract public String[] getJunctions();
	
	/**
	 * 
	 * @return ArrayList - List of stations
	 */
	abstract public ArrayList<Station_10097> getstation();
	
	/**
	 * @param num- maximum speed on line
	 */
	abstract public void settopspeed(int num);
	
	/**
	 * @param num- distance covered by line
	 */
	abstract public void setLength(double num);
	
	/**
	 * @param num- number of trains on line
	 */
	abstract public void setNoOfTrains(int num);
	
	/**
	 * @param num- frequency of trains on line
	 */
	abstract public void setfrequency(int num);
	
	/**
	 * @param num- number of stations
	 */
	abstract public void setnumberOfStations(int num);
	
	/**
	 * @param Station_10097 - station
	 */
	abstract public void setstation(Station_10097 a);
	
	/**
	 * @param num- number of junctions
	 */
	abstract public void setnumberOfJunctions(int num);
}