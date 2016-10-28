
package edu.iiitd.ap2011.yash10097.metro;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Yash
 *
 */
public class YellowLine_10097 extends MetroLine_10097 {

	public int numberOfStations;
    public int frequency;
    public int numberOfJunctions;
    public String[] Junctions;
    public int topspeed;
    public double length;
    public int noOftrains;
    
    
	/* (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#getnumberOfTrains()
	 */
	ArrayList<Station_10097> yellowline=new ArrayList<Station_10097>();
	Station_10097 a=new Station_10097();
	static int[] arr;
	YellowLine_10097() throws IOException{
		try {
			FileInputStream fstream = new FileInputStream("yellowline_10097.txt");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			   String strLine;
			  //Read File Line By Line
			  int count=0;
			  int n=1;
			  int n1=0;
			  while ((strLine = br.readLine()) != null)   {
				  if(count==0){
					  setnumberOfStations(Integer.parseInt(strLine));
					  count++;
				  }
				  else if(count==1){
					  setfrequency(Integer.parseInt(strLine));
					  count++;
				  }
				  else if(count==2){
					  setnumberOfJunctions(Integer.parseInt(strLine));
					  count++;
				  }
				  else if(count==3){
					  int flag=0;
					  if(n+1>getnumberOfJunctions()){
						  count++;
						  flag=1;
					  }
					  Junctions[n-1]=strLine;
					  n++;
					  if(flag==1)
						  n=1;
					  
				  }
				  else if(count==4){
					  count++;
					  settopspeed(Integer.parseInt(strLine));
				 }
				  else if(count==5){
					  count++;
					  setLength(Double.parseDouble(strLine));
				  }
				  else if(count==6){
					  count++;
					  setNoOfTrains(Integer.parseInt(strLine));
				  }
				  else if(n1==0){
					  a=new Station_10097();
					  a.setnoOfMetrolines(Integer.parseInt(strLine));
					  n1++;
					  n=0;
				  }
				  else if(n1==1){
					  int flag=0;
					  arr[n]=Integer.parseInt(strLine);
					  n++;
					  if(n==a.getnoOfMetrolines()){
						  n1++;
					      a.setStoppagePerLine(arr);
					      flag=1;
					  }
					  if(flag==1){
						n=0;
					  }
				      
				  }
				  else if(n1==2){
					  int flag=0;
					  arr[n]=Integer.parseInt(strLine);
					  n++;
					  if(n==a.getnoOfMetrolines()){
						  n1++;
						  a.setplatformCapacity(arr);
					      flag=1;
					  }   
					  if(flag==1){
                          n=0;
					  }
				  }
				  else if(n1==3){
					  a.setStationName(strLine);
					  n1++;
				  }
				  else if(n1==4){
					  int flag=0;
					  arr[n]=Integer.parseInt(strLine);
					  n++;
					  if(n==a.getnoOfMetrolines()){
						  n1++;
					      a.setnumberOfCoaches(arr);
					      flag=1;
					  }    
					  if(flag==1)
						  n=0;
				  }
				  else if(n1==5){
					  a.setUnderground(strLine);     
					  n1++;
				  }
				  else if(n1==6){
					  a.number=strLine; 
					  n1++;
				  }
				  else if(n1==7){
					  a.x=Integer.parseInt(strLine); 
					  n1++;
				  }
				  else if(n1==8){
					  a.y=Integer.parseInt(strLine); 
					  n1=0;
					  setstation(a);
					  
				  }
				  
			  }
			  //Close the input stream
			  in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		}
	}
	
	public int getfrequency() {
		return frequency;
	}
	
	public void setfrequency(int num) {
		frequency=num;
	}

	/* (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#getnumberOfStations()
	 */
	@Override
	public int getnumberOfStations() {
		// TODO Auto-generated method stub
		return numberOfStations;
	}

	/* (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#getnumberOfJunctions()
	 */
	@Override
	public int getnumberOfJunctions() {
		// TODO Auto-generated method stub
		return numberOfJunctions;
	}


	/* (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#getstations()
	 */
	@Override
	public ArrayList<Station_10097> getstation() {
		// TODO Auto-generated method stub
		return yellowline;

	}
    /*
     * (non-Javadoc)
     * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#getJunctions()
     */
	@Override
	public String[] getJunctions() {
		// TODO Auto-generated method stub
		return Junctions;
	}
    /*
     * (non-Javadoc)
     * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#gettopspeed()
     */
	@Override
	public int gettopspeed() {
		// TODO Auto-generated method stub
		return topspeed;
	}
    
	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#settopspeed(int)
	 */
	@Override
	public void settopspeed(int num) {
		// TODO Auto-generated method stub
		topspeed=num;
	}
    
	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#setLength(double)
	 */
	@Override
	public void setLength(double num) {
		// TODO Auto-generated method stub
		length=num;
	}
    
	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#getLength()
	 */
	@Override
	public double getLength() {
		// TODO Auto-generated method stub
	    return length;	
	}
    
	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#setNoOfTrains(int)
	 */
	@Override
	public void setNoOfTrains(int num) {
		// TODO Auto-generated method stub
		noOftrains=num;
	}
 
	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#getNoOfTrains()
	 */
	@Override
	public int getNoOfTrains() {
		// TODO Auto-generated method stub
		return noOftrains;
	}
    
	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#setnumberOfStations(int)
	 */
	@Override
	public void setnumberOfStations(int num) {
		// TODO Auto-generated method stub
		numberOfStations=num;
		
	}
    
	/*
	 * (non-Javadoc)
	 * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#setnumberOfJunctions(int)
	 */
	@Override
	public void setnumberOfJunctions(int num) {
		// TODO Auto-generated method stub
		numberOfJunctions=num;
		Junctions=new String[numberOfJunctions];
	}

    /*
     * (non-Javadoc)
     * @see edu.iiitd.ap2011.yash10097.metro.MetroLine_10097#setstation(edu.iiitd.ap2011.yash10097.metro.Station_10097)
     */
	@Override
	public void setstation(Station_10097 a) {
 		// TODO Auto-generated method stub
		yellowline.add(a);
	}

}
