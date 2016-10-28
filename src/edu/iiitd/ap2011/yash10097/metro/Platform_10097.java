/**
 * 
 */
package edu.iiitd.ap2011.yash10097.metro;

/**
 * @author Yash
 *
 */
public interface Platform_10097 extends Comparable<Object> {
    /**
     * 
     * @return int- number of platforms
     */
	public int getnoOfPlatforms();
	
	/**
	 * 
	 * @param num -number of platforms
	 */
    public void setplatformCapacity(int[] num);
    
    /**
     * 
     * @return integer array with platform capacity
     */
    public int[] getplatformCapacity();
    
    /**
     * 
     * @return number of coaches in trains
     */
    public int[] getnumberOfCoaches();
    
    /**
     * 
     * @param num-array containing number of coaches in a train coming at that platform
     */
    public void setnumberOfCoaches(int[] num);
}
