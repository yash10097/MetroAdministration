package edu.iiitd.ap2011.yash10097.metro;


public class Station_10097 implements Platform_10097, Comparable<Object>{
	static String stations = "stations.txt";
	private int noOfMetrolines;
    private int[] stoppagePerLine;
    private int noOfPlatforms;
    private int[] platformCapacity;
    private String stationName;
    private int[] noOfCoaches;
    private boolean underground;
    String number;
     int x=0,y=0;
    
    /**
     *  @param number of metrolines
     *  Method to set number of metrolines served
     */
    public void setnoOfMetrolines(int num){
 	      noOfMetrolines=num;
 	      OrangeLine_10097.arr=new int[num];
 	      RedLine_10097.arr=new int[num];
 	      BlueLine_10097.arr=new int[num];
 	      GreenLine_10097.arr=new int[num];
 	      YellowLine_10097.arr=new int[num];
 	      VioletLine_10097.arr=new int[num];
 	      stoppagePerLine=new int[num];
 	      platformCapacity=new int[num];
 	     noOfCoaches=new int[num];
 	}
    
    /**
     *  @return number of metro lines served by station
     */
    public int getnoOfMetrolines(){
 	      return noOfMetrolines;
    }
    
    public int[] getStoppagePerLine() {
		return stoppagePerLine;
	}

	public void setStoppagePerLine(int[] stoppagePerLine) {
		for(int i=0;i<stoppagePerLine.length;i++)
	    	   this.stoppagePerLine[i] = stoppagePerLine[i];
		
	}
    /**
     *  @return number of platforms on station
     */
    
     /**
     *  @param capacity of platforms
     */
    public void setplatformCapacity(int[] num){
    	for(int i=0;i<num.length;i++)
    	   platformCapacity[i]=num[i];
    }
    
    /**
     *  @return capacity of platforms 
     */
    
    
    public int stationCapacity(){
    	int sum=0;
    	for(int i:platformCapacity)
           sum+=i;
    	return sum;		
    }
    
    /**
	 * compareTo function to compare two stations on the basis of capacity
	 */
	public int compareTo(Object arg0) {
		Station_10097 other=(Station_10097)arg0;
		if (stationCapacity() < other.stationCapacity())
			return -1;
		else if (stationCapacity() > other.stationCapacity())
			return 1;
		return 0;
	}

	/**
	 * @return stationName-the stationName
	 */
	public String getStationName() {
		return stationName;
	}

	/**
	 * @param stationName the stationName to set
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	/**
	 * @return noOfPlatforms-the number of platforms
	 */
	public int getnoOfPlatforms() {
		noOfPlatforms=noOfMetrolines*2;
		return noOfPlatforms;
	}

	
   /*
    * (non-Javadoc)
    * @see edu.iiitd.ap2011.yash10097.metro.Platform_10097#getplatformCapacity()
    */
	public int[] getplatformCapacity() {
		// TODO Auto-generated method stub
		return platformCapacity;
	}
    
	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.Platform_10097#getnumberOfCoaches()
	 */
	public int[] getnumberOfCoaches() {
		// TODO Auto-generated method stub
		return noOfCoaches;
	}

	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.Platform_10097#setnumberOfCoaches(int[])
	 */
	public void setnumberOfCoaches(int[] num) {
		// TODO Auto-generated method stub
		for(int i=0;i<num.length;i++)
			noOfCoaches[i]=num[i];
	}

	/** 
	 * @return underground- indicates whether station is underground or not
	 */
	public boolean isUnderground() {
		return underground;
	}

	/**
	 * 
	 * @param underground-setting the elevation of station
	 */
	public void setUnderground(String underground) {
		if(underground.equals("true"))
			this.underground = true;	
		else
			this.underground = true;
	}
}	
