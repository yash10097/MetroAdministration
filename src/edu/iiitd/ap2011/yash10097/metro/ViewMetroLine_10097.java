package edu.iiitd.ap2011.yash10097.metro;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;



public class ViewMetroLine_10097 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @throws IOException - reads text files that provide data for the metro lines and stations
	 */
	ViewMetroLine_10097() throws IOException{	 
		Newpanel n=new Newpanel();
		JPanel j=new JPanel(new GridLayout(3,1,0,20));

		//Menus

		/*
		 * Add Train
		 */
		JMenu fileMenu = new JMenu("Add Train");
		JMenuItem train=fileMenu.add(new TestAction("Rithala to Dilshad Garden"));
		train.setAccelerator(KeyStroke.getKeyStroke("R"));
		JMenuItem train1=fileMenu.add(new TestAction("Dilshad Garden to Rithala"));
		train1.setAccelerator(KeyStroke.getKeyStroke("ctrl R"));
		fileMenu.addSeparator();
		JMenuItem train2=fileMenu.add(new TestAction("Mundka to Kirti Nagar"));
		train2.setAccelerator(KeyStroke.getKeyStroke("G"));
		JMenuItem train3=fileMenu.add(new TestAction("To Mundka"));
		train3.setAccelerator(KeyStroke.getKeyStroke("ctrl G"));
		fileMenu.addSeparator();
		JMenuItem train4=fileMenu.add(new TestAction("Jahangirpuri to HUDA City Centre"));
		train4.setAccelerator(KeyStroke.getKeyStroke("Y"));
		JMenuItem train5=fileMenu.add(new TestAction("HUDA City Centre to Jahangirpuri"));
		train5.setAccelerator(KeyStroke.getKeyStroke("ctrl Y"));
		fileMenu.addSeparator();
		JMenuItem train6=fileMenu.add(new TestAction("Dwarka Sector 21 to Noida City Centre"));
		train6.setAccelerator(KeyStroke.getKeyStroke("B"));
		JMenuItem train7=fileMenu.add(new TestAction("Noida City Centre to Dwarka Sector 21"));
		train7.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));
		JMenuItem train8=fileMenu.add(new TestAction("Vaishali to Dwarka"));
		train8.setAccelerator(KeyStroke.getKeyStroke("alt B"));
		fileMenu.addSeparator();
		JMenuItem train9=fileMenu.add(new TestAction("Dwarka Sector 21 to New Delhi"));
		train9.setAccelerator(KeyStroke.getKeyStroke("O"));
		JMenuItem train10=fileMenu.add(new TestAction("New Delhi to Dwarka Sector 21"));
		train10.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		fileMenu.addSeparator();
		JMenuItem train11=fileMenu.add(new TestAction("Central Secretariat to Badarpur"));
		train11.setAccelerator(KeyStroke.getKeyStroke("V"));
		JMenuItem train12=fileMenu.add(new TestAction("Badarpur to Central Secretariat to Badarpur"));
		train12.setAccelerator(KeyStroke.getKeyStroke("ctrl V"));

		/*
		 * Emergency Menu
		 */
		JMenu fileMenu1 = new JMenu("Emergency");
		JMenuItem stoptrain=fileMenu1.add(new EmergencyAction("Stop/Resume Red Line"));
		stoptrain.setAccelerator(KeyStroke.getKeyStroke("1"));
		JMenuItem stoptrain3=fileMenu1.add(new EmergencyAction("Stop/Resume Orange Line"));
		stoptrain3.setAccelerator(KeyStroke.getKeyStroke("2"));
		JMenuItem stoptrain5=fileMenu1.add(new EmergencyAction("Stop/Resume Blue Line"));
		stoptrain5.setAccelerator(KeyStroke.getKeyStroke("3"));
		JMenuItem stoptrain7=fileMenu1.add(new EmergencyAction("Stop/Resume Green Line"));
		stoptrain7.setAccelerator(KeyStroke.getKeyStroke("4"));
		JMenuItem stoptrain9=fileMenu1.add(new EmergencyAction("Stop/Resume Yellow Line"));
		stoptrain9.setAccelerator(KeyStroke.getKeyStroke("5"));
		JMenuItem stoptrain11=fileMenu1.add(new EmergencyAction("Stop/Resume Violet Line"));
		stoptrain11.setAccelerator(KeyStroke.getKeyStroke("6"));
		JMenuItem stoptrain12=fileMenu1.add(new EmergencyAction("Stop/Resume All Metro Lines"));
		stoptrain12.setAccelerator(KeyStroke.getKeyStroke("7"));
		JMenuItem stoptrain13=fileMenu1.add(new EmergencyAction("Increase Speed"));
		stoptrain13.setAccelerator(KeyStroke.getKeyStroke("8"));
		JMenuItem stoptrain14=fileMenu1.add(new EmergencyAction("Decrease Speed"));
		stoptrain14.setAccelerator(KeyStroke.getKeyStroke("9"));

		/*
		 * View Lines and information related to metro lines
		 */
		JMenu fileMenu2 = new JMenu("View Lines");
		JMenuItem viewtrain=fileMenu2.add(new ViewAction("View Only Map"));
		viewtrain.setAccelerator(KeyStroke.getKeyStroke("alt 0"));
		JMenuItem viewtrain1=fileMenu2.add(new ViewAction("Red Line Info"));
		viewtrain1.setAccelerator(KeyStroke.getKeyStroke("alt 1"));
		JMenuItem viewtrain2=fileMenu2.add(new ViewAction("Orange Line Info"));
		viewtrain2.setAccelerator(KeyStroke.getKeyStroke("alt 2"));
		JMenuItem viewtrain3=fileMenu2.add(new ViewAction("Blue Line Info"));
		viewtrain3.setAccelerator(KeyStroke.getKeyStroke("alt 3"));
		JMenuItem viewtrain4=fileMenu2.add(new ViewAction("Green Line Info"));
		viewtrain4.setAccelerator(KeyStroke.getKeyStroke("alt 4"));
		JMenuItem viewtrain6=fileMenu2.add(new ViewAction("Yellow Line Info"));
		viewtrain6.setAccelerator(KeyStroke.getKeyStroke("alt 5"));
		JMenuItem viewtrain5=fileMenu2.add(new ViewAction("Violet Line Info"));
		viewtrain5.setAccelerator(KeyStroke.getKeyStroke("alt 6"));

		// add all top-level menus to menu bar
		JMenuBar menuBar = new JMenuBar();
		JMenuBar menuBar3 = new JMenuBar();
		JMenuBar menuBar1 = new JMenuBar();
		j.add(menuBar);
		j.add(menuBar1);
		j.add(menuBar3);
		menuBar.add(fileMenu);
		menuBar3.add(fileMenu1);
		menuBar1.add(fileMenu2);

		add(j,BorderLayout.WEST);
		// get screen dimensions
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		// set frame width, height and let platform pick screen location
		setSize(screenWidth-70, screenHeight-50 );
		setLocationByPlatform(true);
		setLocationRelativeTo(null); // Center the frame
		setTitle("Welcome to Delhi Metro");
		setResizable(false);
		Image img = kit.getImage("logo_10097.jpg");
		setIconImage(img);
		add(n);


	}
}


/**
 * Panel implementing Runnable, containing map and metro
 */

class Newpanel extends JPanel implements Runnable{	  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Metro_10097 metro;
	private Thread animator;
	static ArrayList<Metro_10097> items=new ArrayList<Metro_10097>();
	OrangeLine_10097 Line3;
	YellowLine_10097 Line6;
	GreenLine_10097 Line2;
	VioletLine_10097 Line5;
	RedLine_10097 Line4;
	BlueLine_10097 Line1;

	Newpanel() throws IOException{
		//Reading data from files
		Line3=new OrangeLine_10097();
		Line6=new YellowLine_10097();
		Line2=new GreenLine_10097();
		Line5=new VioletLine_10097();
		Line4=new RedLine_10097();
		Line1=new BlueLine_10097();    

		//adding metros
		metro=new Metro_10097(1,20,310,5,440,124,false,1);//red
		items.add(metro);
		metro=new Metro_10097(1,20,850,124,432,124,true,1);//red
		items.add(metro);
		metro=new Metro_10097(2,20,560,280,580,330,false,1);//violet
		items.add(metro);
		metro=new Metro_10097(2,20,972,592,580,310,true,1);//violet
		items.add(metro);
		metro=new Metro_10097(3,20,480,-30,556,70,false,1);//yellow
		items.add(metro);
		metro=new Metro_10097(3,20,338,639,338,626,true,1);//yellow
		items.add(metro);
		metro=new Metro_10097(4,20,558,184,236,488,false,1);//orange
		items.add(metro);
		metro=new Metro_10097(4,20,236,488,558,184,true,1);//orange
		items.add(metro);
		metro=new Metro_10097(5,20,370,160,400,126,false,1);//green
		items.add(metro);
		metro=new Metro_10097(5,20,26,126,22,126,true,1);//green
		items.add(metro);
		metro=new Metro_10097(6,20,215,490,76,354,false,1);//blue
		items.add(metro);
		metro=new Metro_10097(6,20,1010,402,960,402,true,1);//blue
		items.add(metro);
		metro=new Metro_10097(7,20,840,184,810,184,true,1);//blue
		items.add(metro);	    

		/**
		 * Mouse Listener for displaying station names on clicking
		 */
		addMouseListener(new MouseAdapter()
		{   public void mouseClicked(MouseEvent e)
		{      int count=0; 
		for(int i=0;i<Line4.redline.size();i++){
			if(e.getX()>=Line4.redline.get(i).x && e.getX()<=Line4.redline.get(i).x+10 && e.getY()>=Line4.redline.get(i).y && e.getY()<=Line4.redline.get(i).y+10){
				count=1;
				String msg=null;
				msg="1) No of MetroLines served = "+Line4.redline.get(i).getnoOfMetrolines()+"\n\n";
				int[] arr=new int[Line4.redline.get(i).getnoOfMetrolines()];
				arr=Line4.redline.get(i).getStoppagePerLine();
				for(int j=0;j<arr.length;j++)
					if(arr.length==1){
						msg+="2) Stoppage Time = "+arr[j]+" seconds\n\n";
					}
					else if(arr.length==2){
						msg+="2) Stoppage time for Red Line = "+arr[j]+" seconds\n";
						msg+="     Stoppage time for Green Line = "+arr[j+1]+" seconds\n\n";
						break;
					}
				msg+="3) No of Platforms = "+Line4.redline.get(i).getnoOfPlatforms()+"\n\n";
				arr=Line4.redline.get(i).getplatformCapacity();
				for(int j=0;j<arr.length;j++)
					if(arr.length==1){
						msg+="4) Platform Capacity = "+arr[j]+" coach trains\n\n";
					}
					else if(arr.length==2){
						msg+="4) Platform Capacity for Red Line = "+arr[j]+" coach trains\n";
						msg+="     Platform Capacity for Green Line = "+arr[j+1]+" coach trains\n\n";
						break;
					}
				arr=Line4.redline.get(i).getnumberOfCoaches();
				for(int j=0;j<arr.length;j++)
					if(arr.length==1){
						if(arr[j]==10)
							msg+="5) Number of coaches in a train = 4, 6\n\n";
						else
							msg+="5) Number of coaches in a train = "+arr[j]+"\n\n";
					}
					else if(arr.length==2){
						msg+="5) Number of coaches in trains on Red Line = 4, 6\n";
						msg+="     Number of coaches in trains on Green Line = "+arr[j+1]+"\n\n";
						break;

					}
				if(Line4.redline.get(i).isUnderground())
					msg+=" The Station is an Underground Station          \n\n";
				else
					msg+=" The Station is elevated\n\n";
				msg+=" Station mobile number is "+Line4.redline.get(i).number+"\n\n";

				JOptionPane.showMessageDialog(getParent(),msg,Line4.redline.get(i).getStationName()+ " Station",JOptionPane.INFORMATION_MESSAGE);
				break;                	       
			}

		}
		if(count!=1){
			for(int i=0;i<Line5.violetline.size();i++){
				if(e.getX()>=Line5.violetline.get(i).x && e.getX()<=Line5.violetline.get(i).x+10 && e.getY()>=Line5.violetline.get(i).y && e.getY()<=Line5.violetline.get(i).y+10){
					count=1;
					String msg=null;
					msg="1) No of MetroLines served = "+Line5.violetline.get(i).getnoOfMetrolines()+"\n\n";
					int[] arr=new int[Line5.violetline.get(i).getnoOfMetrolines()];
					arr=Line5.violetline.get(i).getStoppagePerLine();
					for(int j=0;j<arr.length;j++)
						if(arr.length==1){
							msg+="2) Stoppage Time = "+arr[j]+" seconds\n\n";
						}
					msg+="3) No of Platforms = "+Line5.violetline.get(i).getnoOfPlatforms()+"\n\n";
					arr=Line5.violetline.get(i).getplatformCapacity();
					for(int j=0;j<arr.length;j++)
						if(arr.length==1){
							msg+="4) Platform Capacity = "+arr[j]+" coach trains\n\n";
						}
					arr=Line5.violetline.get(i).getnumberOfCoaches();
					for(int j=0;j<arr.length;j++)
						if(arr.length==1){
							if(arr[j]==10)
								msg+="5) Number of coaches in a train = 4, 6\n\n";
							else
								msg+="5) Number of coaches in a train = "+arr[j]+"\n\n";
						}
					if(Line5.violetline.get(i).isUnderground())
						msg+=" The Station is an Underground Station          \n\n";
					else
						msg+=" The Station is elevated\n\n";
					msg+=" Station mobile number is "+Line5.violetline.get(i).number+"\n\n";

					JOptionPane.showMessageDialog(getParent(),msg,Line5.violetline.get(i).getStationName()+ " Station",JOptionPane.INFORMATION_MESSAGE);
					break;                	       
				}

			}
			if(count!=1){
				for(int i=0;i<Line1.blueline.size();i++){
					if(e.getX()>=Line1.blueline.get(i).x && e.getX()<=Line1.blueline.get(i).x+10 && e.getY()>=Line1.blueline.get(i).y && e.getY()<=Line1.blueline.get(i).y+10){
						count=1;
						String msg=null;
						msg="1) No of MetroLines served = "+Line1.blueline.get(i).getnoOfMetrolines()+"\n\n";
						int[] arr=new int[Line1.blueline.get(i).getnoOfMetrolines()];
						arr=Line1.blueline.get(i).getStoppagePerLine();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								msg+="2) Stoppage Time = "+arr[j]+" seconds\n\n";
							}
							else if(arr.length==2){
								msg+="2) Stoppage time for Blue Line = "+arr[j]+" seconds\n";
								msg+="     Stoppage time for Green Line = "+arr[j+1]+" seconds\n\n";
								break;
							}
						msg+="3) No of Platforms = "+Line1.blueline.get(i).getnoOfPlatforms()+"\n\n";
						arr=Line1.blueline.get(i).getplatformCapacity();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								msg+="4) Platform Capacity = "+arr[j]+" coach trains\n\n";
							}
							else if(arr.length==2){
								msg+="4) Platform Capacity for Blue Line = "+arr[j]+" coach trains\n";
								msg+="     Platform Capacity for Green Line = "+arr[j+1]+" coach trains\n\n";
								break;
							}
						arr=Line1.blueline.get(i).getnumberOfCoaches();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								if(arr[j]==10)
									msg+="5) Number of coaches in a train = 4, 6\n\n";
								else
									msg+="5) Number of coaches in a train = "+arr[j]+"\n\n";
							}
							else if(arr.length==2){
								msg+="5) Number of coaches in trains on Red Line = 4, 6\n";
								msg+="     Number of coaches in trains on Green Line = "+arr[j+1]+"\n\n";
								break;

							}
						if(Line1.blueline.get(i).isUnderground())
							msg+=" The Station is an Underground Station          \n\n";
						else
							msg+=" The Station is elevated\n\n";
						msg+=" Station mobile number is "+Line1.blueline.get(i).number+"\n\n";

						JOptionPane.showMessageDialog(getParent(),msg,Line1.blueline.get(i).getStationName()+ " Station",JOptionPane.INFORMATION_MESSAGE);
						break;                	       
					}
				}   


			}
			if(count!=1){
				for(int i=0;i<Line2.greenline.size();i++){
					if(e.getX()>=Line2.greenline.get(i).x && e.getX()<=Line2.greenline.get(i).x+10 && e.getY()>=Line2.greenline.get(i).y && e.getY()<=Line2.greenline.get(i).y+10){
						count=1;
						String msg=null;
						msg="1) No of MetroLines served = "+Line2.greenline.get(i).getnoOfMetrolines()+"\n\n";
						int[] arr=new int[Line2.greenline.get(i).getnoOfMetrolines()];
						arr=Line2.greenline.get(i).getStoppagePerLine();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								msg+="2) Stoppage Time = "+arr[j]+" seconds\n\n";
							}
						msg+="3) No of Platforms = "+Line2.greenline.get(i).getnoOfPlatforms()+"\n\n";
						arr=Line2.greenline.get(i).getplatformCapacity();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								msg+="4) Platform Capacity = "+arr[j]+" coach trains\n\n";
							}
						arr=Line2.greenline.get(i).getnumberOfCoaches();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								if(arr[j]==10)
									msg+="5) Number of coaches in a train = 4, 6\n\n";
								else
									msg+="5) Number of coaches in a train = "+arr[j]+"\n\n";
							}
						if(Line2.greenline.get(i).isUnderground())
							msg+=" The Station is an Underground Station          \n\n";
						else
							msg+=" The Station is elevated\n\n";
						msg+=" Station mobile number is "+Line2.greenline.get(i).number+"\n\n";

						JOptionPane.showMessageDialog(getParent(),msg,Line2.greenline.get(i).getStationName()+ " Station",JOptionPane.INFORMATION_MESSAGE);
						break;                	       
					}

				}

			}

			if(count!=1){
				for(int i=0;i<Line3.orangeline.size();i++){
					if(e.getX()>=Line3.orangeline.get(i).x && e.getX()<=Line3.orangeline.get(i).x+10 && e.getY()>=Line3.orangeline.get(i).y && e.getY()<=Line3.orangeline.get(i).y+10){
						count=1;
						String msg=null;
						msg="1) No of MetroLines served = "+Line3.orangeline.get(i).getnoOfMetrolines()+"\n\n";
						int[] arr=new int[Line3.orangeline.get(i).getnoOfMetrolines()];
						arr=Line3.orangeline.get(i).getStoppagePerLine();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								msg+="2) Stoppage Time = "+arr[j]+" minutes\n\n";
							}
							else if(arr.length==2){
								msg+="2) Stoppage time for Orange Line = "+arr[j]+" seconds\n";
								if(Line3.orangeline.get(i).getStationName().equals("New Delhi"))
									msg+="     Stoppage time for Yellow Line = "+arr[j+1]+" seconds\n\n";
								else
									msg+="     Stoppage time for Blue Line = "+arr[j+1]+" seconds\n\n";
								break;
							}
						msg+="3) No of Platforms = "+Line3.orangeline.get(i).getnoOfPlatforms()+"\n\n";
						arr=Line3.orangeline.get(i).getplatformCapacity();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								msg+="4) Platform Capacity = "+arr[j]+" coach trains\n\n";
							}
							else if(arr.length==2){
								msg+="4) Platform Capacity for Orange Line = "+arr[j]+" coach trains\n";
								if(Line3.orangeline.get(i).getStationName().equals("New Delhi"))
									msg+="     Platform Capacity for Yellow Line = "+arr[j+1]+" coach trains\n\n";
								else
									msg+="     Platform Capacity for Blue Line = "+arr[j+1]+" coach trains\n\n";
								break;
							}
						arr=Line3.orangeline.get(i).getnumberOfCoaches();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								if(arr[j]==10)
									msg+="5) Number of coaches in a train = 4, 6\n\n";
								else
									msg+="5) Number of coaches in a train = "+arr[j]+"\n\n";
							}
							else if(arr.length==2){
								msg+="5) Number of coaches in trains on Orange Line = "+arr[j]+"\n";
								if(Line3.orangeline.get(i).getStationName().equals("New Delhi"))
									msg+="5) Number of coaches in trains on Yellow Line = 4, 6\n";
								else
									msg+="     Number of coaches in trains on Blue Line = 4, 6\n\n";
								break;

							}
						if(Line3.orangeline.get(i).isUnderground())
							msg+=" The Station is an Underground Station          \n\n";
						else
							msg+=" The Station is elevated\n\n";
						msg+=" Station mobile number is "+Line3.orangeline.get(i).number+"\n\n";

						JOptionPane.showMessageDialog(getParent(),msg,Line3.orangeline.get(i).getStationName()+ " Station",JOptionPane.INFORMATION_MESSAGE);
						break;                	       
					}
				}   


			}

			if(count!=1){
				for(int i=0;i<Line6.yellowline.size();i++){
					if(e.getX()>=Line6.yellowline.get(i).x && e.getX()<=Line6.yellowline.get(i).x+10 && e.getY()>=Line6.yellowline.get(i).y && e.getY()<=Line6.yellowline.get(i).y+10){
						count=1;
						String msg=null;
						msg="1) No of MetroLines served = "+Line6.yellowline.get(i).getnoOfMetrolines()+"\n\n";
						int[] arr=new int[Line6.yellowline.get(i).getnoOfMetrolines()];
						arr=Line6.yellowline.get(i).getStoppagePerLine();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								msg+="2) Stoppage Time = "+arr[j]+" seconds\n\n";
							}
							else if(arr.length==2){
								msg+="2) Stoppage time for Yellow Line = "+arr[j]+" seconds\n";
								if(Line6.yellowline.get(i).getStationName().equals("Kashmere Gate"))
									msg+="     Stoppage time for Red Line = "+arr[j+1]+" seconds\n\n";
								else if(Line6.yellowline.get(i).getStationName().equals("Rajiv Chawk"))
									msg+="     Stoppage time for Blue Line = "+arr[j+1]+" seconds\n\n";
								else
									msg+="     Stoppage time for Violet Line = "+arr[j+1]+" seconds\n\n";
								break;
							}
						msg+="3) No of Platforms = "+Line6.yellowline.get(i).getnoOfPlatforms()+"\n\n";
						arr=Line6.yellowline.get(i).getplatformCapacity();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								msg+="4) Platform Capacity = "+arr[j]+" coach trains\n\n";
							}
							else if(arr.length==2){
								msg+="4) Platform Capacity for Yellow Line = "+arr[j]+" coach trains\n";
								if(Line6.yellowline.get(i).getStationName().equals("Kashmere Gate"))
									msg+="     Platform Capacity for Red Line = "+arr[j+1]+" coach trains\n\n";
								else if(Line6.yellowline.get(i).getStationName().equals("Rajiv Chawk"))
									msg+="     Platform Capacity for Blue Line = "+arr[j+1]+" coach trains\n\n";
								else
									msg+="     Platform Capacity for Violet Line = "+arr[j+1]+" coach trains\n\n";
								break;
							}
						arr=Line6.yellowline.get(i).getnumberOfCoaches();
						for(int j=0;j<arr.length;j++)
							if(arr.length==1){
								if(arr[j]==10)
									msg+="5) Number of coaches in a train = 4, 6\n\n";
								else
									msg+="5) Number of coaches in a train = "+arr[j]+"\n\n";
							}
							else if(arr.length==2){
								msg+="5) Number of coaches in trains on Yellow Line = 4, 6\n";
								if(Line6.yellowline.get(i).getStationName().equals("Kashmere Gate"))
									msg+="5) Number of coaches in trains on Red Line = 4, 6\n";
								else if(Line6.yellowline.get(i).getStationName().equals("Rajiv Chawk"))
									msg+="     Number of coaches in trains on Blue Line = 4, 6\n\n";
								else
									msg+="     Number of coaches in trains on Violet Line = "+arr[j+1]+"\n\n";	
								break;

							}
						if(Line6.yellowline.get(i).isUnderground())
							msg+=" The Station is an Underground Station          \n\n";
						else
							msg+=" The Station is elevated\n\n";
						msg+=" Station mobile number is "+Line6.yellowline.get(i).number+"\n\n";

						JOptionPane.showMessageDialog(getParent(),msg,Line6.yellowline.get(i).getStationName()+ " Station",JOptionPane.INFORMATION_MESSAGE);
						break;                	       
					}
				}   
			}
		}

		}

		});
	}


	//Notify 		 
	public void addNotify() {
		super.addNotify();
		animator = new Thread(this);
		animator.start();
	}

	//Paint component
	protected void paintComponent(Graphics g) { 
		super.paintComponent(g);  

		Graphics2D g2D = (Graphics2D) g; 
		setBackground(new Color(250,210,250));
		//for antialising geometric shapes
		g2D.addRenderingHints( new RenderingHints( RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON ));
		g2D.setStroke(new BasicStroke(6));  
		Image image,image1;
		//Red Line Construction
		g2D.setColor(Color.red);
		g2D.drawLine(340, 35, 460, 160);
		g2D.drawLine(460,160,880,160);
		g2D.setColor(Color.yellow);
		g2D.drawLine(520,5, 600, 90);
		g2D.drawLine(600,90, 600, 560);
		g2D.drawLine(600,560, 505, 660);
		g2D.drawLine(385,660, 505, 660);
		g2D.drawLine(385,660, 385, 680);
		g2D.setColor(Color.green);
		g2D.drawLine(64,165,454,163);
		g2D.drawLine(400,200,440,165);
		g2D.setColor(Color.blue);
		g2D.drawLine(385,194,430,240);//5
		g2D.drawLine(138,360,200,360);//3
		g2D.drawLine(138,360,100,395);//2
		g2D.drawLine(100,395,265,520);//1
		g2D.drawLine(385,194,200,360);//4
		g2D.drawLine(430,240,562,240);//6
		g2D.drawLine(562,240,630,310);//7
		g2D.drawLine(630,310,780,310);//8
		g2D.drawLine(775,310,779,292);
		g2D.drawLine(781,290,879,220);
		g2D.drawLine(879,220,995,220);
		g2D.drawLine(783,310,995,437);//9
		g2D.drawLine(995,437,1040,437);
		g2D.setColor(Color.orange);
		g2D.drawLine(270,520,590,244);
		g2D.drawLine(593,242,598,228);
		Color c=new Color(160,0,250);
		g2D.setColor(c);//violet colour
		g2D.drawLine(605,315,630,340);
		g2D.drawLine(630,340,630,362);
		g2D.drawLine(630,362,995,630);

		// making stations
		try { 
			image = ImageIO.read(new File("image_10097.jpg"));
			image1 = ImageIO.read(new File("image1_10097.jpg"));

			g2D.drawImage(image, 480, 155, null);//Shastri Nagar
			g2D.drawImage(image, 520, 296, null);//Shivaji Stadium
			g2D.drawImage(image, 625, 342, null);//Khan Market
			g2D.drawImage(image, 408, 185, null);//Satguru Ram Singh Marg
			for(int i=0;i<8;i++){
				g2D.drawImage(image, 263-(21*i), 518-(16*i), null); //Blue Line Dwarka Sector 21
				g2D.drawImage(image, 358-(20*i), 210+(18*i), null); //Blue Line Moti Nagar
				g2D.drawImage(image, 334+(15*i), 31+(15*i), null);  //Red Line Rithala
				g2D.drawImage(image, 790+(26*i), 312+(16*i), null); //Blue Line Akshardham
			}       
			for(int i=0;i<12;i++)//Green Line
				g2D.drawImage(image, 60+(30*i), 160, null);
			for(int i=0;i<7;i++)//Red Line Dilshad Garden       
				g2D.drawImage(image, 876-(38*i), 155, null);
			for(int i=0;i<5;i++)//Jahangirpuri
				g2D.drawImage(image, 516+(17*i), 3+(18*i), null);
			for(int i=0;i<3;i++){
				g2D.drawImage(image, 293+(50*i), 490-(43*i), null);//I.G.I Airport
				g2D.drawImage(image, 143+(20*i), 355, null);//Uttam Nagar
				g2D.drawImage(image, 520+(25*i), 155, null);//Tis Hazari
				g2D.drawImage(image, 595,103+(16*i), null);//Vishwavidyalaya
				g2D.drawImage(image, 632+(40*i), 306, null);//Pragati Maidan
				g2D.drawImage(image, 460+(36*i), 236, null);//Karol Bagh
				g2D.drawImage(image, 789+(30*i), 276-(21*i), null);// Laxmi Naagar
			}
			for(int i=0;i<2;i++){
				g2D.drawImage(image, 122-(16*i), 366+(15*i), null);//Dwarka Mor
				g2D.drawImage(image, 595, 177+(20*i), null);//Chandni Chawk
				g2D.drawImage(image, 407+(17*i), 217+(19*i), null);//Shadipur
				g2D.drawImage(image,566+(46*i) ,244+(46*i) , null);//Barakhamba
				g2D.drawImage(image,1002+(35*i) ,433 , null);//Golf course
			}       
			g2D.drawImage(image, 595, 290, null);//Patel Chawk
			for(int i=0;i<10;i++)
				g2D.drawImage(image, 595, 324+(24*i), null);//yellow line Saket
			for(int i=0;i<4;i++){//yellow line
				g2D.drawImage(image, 517+(20*i), 640-(22*i), null);//Chhatarpur
				g2D.drawImage(image, 398+(24*i), 656, null);//IFFCO Chawk
				g2D.drawImage(image, 890+(33*i), 215, null);//AnandVihar
			}
			for(int i=0;i<14;i++)//Violet Line
				g2D.drawImage(image, 641+(27*i), 368+(20*i), null);
			g2D.drawImage(image, 382, 676, null);//HUDA city centre
			//interchange junctions
			g2D.drawImage(image1, 458, 155, null);//Inderlok
			g2D.drawImage(image1, 432, 160, null);//Ashok Park Main
			g2D.drawImage(image1, 390, 195, null);//Kirti Nagar
			g2D.drawImage(image1, 595, 154, null);//Kashmere Gate
			g2D.drawImage(image1, 758, 305, null);//Yamuna Bank
			g2D.drawImage(image1, 596, 307, null);//CSec
			g2D.drawImage(image1, 594, 268, null);//Rajiv Chawk
			g2D.drawImage(image1, 594, 220, null);//New Delhi
			g2D.setPaint(Color.BLACK);
			Font f = new Font("Arial", Font.BOLD, 9);
			Font f1 = new Font("Arial",Font.PLAIN, 9);
			g2D.setFont(f);
			// Station names
			
			BufferedReader br = new BufferedReader(new FileReader(Station_10097.stations));
			String details = br.readLine();
			while(details!=null){
				String arguments[] = details.split(",");
				g2D.drawString(arguments[0], Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2]));
				details = br.readLine();
			}
			br.close();
			
			g2D.setFont(f1);
			g2D.drawString("Inderlok", 457, 152);
			g2D.drawString("Pratap Nagar", 496, 152);
			g2D.drawString("Tis Hazari", 556, 152);
			g2D.drawString("Kashmere Gate", 606, 152);
			g2D.drawString("Central Secretariat", 516, 314);
			
			
			// Drawing train
			for (Metro_10097 s : items) {
				g2D.drawImage(Metro_10097.MetroImage, s.x, s.y, this);
			}
			Image image2 = ImageIO.read(new File("fare_10097.jpeg"));
			g2D.drawImage(image2, 1100, 0, null);
			Image image3 = ImageIO.read(new File("metro_10097.jpg"));
			g2D.drawImage(image3, 1100, 490, null);


			Toolkit.getDefaultToolkit().sync();
			g.dispose();

		} catch (IOException f) {

		}

	}
	public void run() {
		while(true){
			try {
				for (Metro_10097 s : items) {
					s.move();
				}
				repaint();
				Thread.sleep(metro.delay);
			} catch (InterruptedException ex) {
				Logger.getLogger(Newpanel.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

}

/**
 * 
 * @author Yash
 * Menu for displaying station info
 */
class ViewAction extends AbstractAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int num=0;
	public ViewAction(String name){
		super(name);
		if(name.equals("View Only Map"))
			num=0;
		else if(name.equals("Red Line Info"))
			num=1;
		else if(name.equals("Orange Line Info"))
			num=4;
		else if(name.equals("Blue Line Info"))
			num=6;
		else if(name.equals("Green Line Info"))
			num=5;
		else if(name.equals("Yellow Line Info"))
			num=3;
		else 
			num=2;		
	}

	public void actionPerformed(ActionEvent arg0) {
		boolean perform = false;
		String lineName[] = {"Red Line","Violet Line", "Yellow Line","Orange Line/Airport Express Line","Green Line","Blue Line"};
		MetroLine_10097 Line= null;
		if(num==0)
			if(Metro_10097.MetroImage==null)
				Metro_10097.MetroImage=Metro_10097.ii.getImage();
			else 
				Metro_10097.MetroImage=null;
		else if(num==1){
			try {
				Line=new RedLine_10097();
				perform = true;
			} catch (IOException e) {

			}

		}
		else if(num==2){
			try {
				Line=new VioletLine_10097();
				perform = true;
			} catch (IOException e) {

			}
		}
		else if(num==3){
			try {
				Line=new YellowLine_10097();
				perform = true;
			} catch (IOException e) {

			}
		}
		else if(num==4){
			try {
				Line=new OrangeLine_10097();
				perform = true;
			} catch (IOException e) {

			}
		}
		else if(num==5){
			try {
				Line=new GreenLine_10097();
				perform = true;
			} catch (IOException e) {

			}
		}
		else if(num==6){
			try {
				Line=new BlueLine_10097();
				perform = true;
			} catch (IOException e) {

			}
		}
		if(perform == true){
			String msg="";
			msg+=" No of Stations = "+ Line.getnumberOfStations();
			msg+="\n\n Frequency of trains = "+ Line.getfrequency()+" minutes";
			msg+="\n\n Number of Junctions = "+ Line.getnumberOfJunctions();
			msg+="\n\n Junctions :- ";
			String arr[] =new String[Line.getnumberOfJunctions()];
			arr=Line.getJunctions();
			for(int i=0;i<arr.length;i++){
				msg+=(i+1)+") "+arr[i]+"    ";
			}
			msg+="\n\n Maximum speed on this line = "+Line.gettopspeed()+" km/h";
			msg+="\n\n Distance covered on this line = "+Line.getLength()+" km";
			msg+="\n\n No of trains running on the line = "+Line.getNoOfTrains();
			JOptionPane.showMessageDialog(null, msg, " "+ lineName[num-1], JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

/**
 * 
 * @author Yash
 *Class for emergency actions
 */
class EmergencyAction extends AbstractAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int stopLine;

	public EmergencyAction(String name){
		super(name);
		if(name.equals("Stop/Resume Red Line"))
			stopLine=1;
		else if(name.equals("Stop/Resume Violet Line"))
			stopLine=2;
		else if(name.equals("Stop/Resume Yellow Line"))
			stopLine=3;
		else if(name.equals("Stop/Resume Green Line"))
			stopLine=5;
		else if(name.equals("Stop/Resume Blue Line"))
			stopLine=6;
		else if(name.equals("Stop/Resume Orange Line"))
			stopLine=4;
		else if(name.equals("Increase Speed"))
			stopLine=8;
		else if(name.equals("Decrease Speed"))
			stopLine=9;  
		else	  
			stopLine=7;
	} 


	public void actionPerformed(ActionEvent arg0) {
		if(stopLine==6){
			for(int i=0;i<Newpanel.items.size();i++){
				if(Newpanel.items.get(i).line==stopLine || Newpanel.items.get(i).line==stopLine+1){
					if(Newpanel.items.get(i).stop==0)
						Newpanel.items.get(i).stop=1;
					else
						Newpanel.items.get(i).stop=0;
				}
			}
		}
		else if(stopLine==7){
			int[] counter=new int[6];
			int sum=0;
			for(int i=0;i<Newpanel.items.size();i++){
				if(Newpanel.items.get(i).line==1 && Newpanel.items.get(i).stop==1)
					counter[0]=1;
				else if(Newpanel.items.get(i).line==2 && Newpanel.items.get(i).stop==1)
					counter[1]=1;
				else if(Newpanel.items.get(i).line==3 && Newpanel.items.get(i).stop==1)
					counter[2]=1;
				else if(Newpanel.items.get(i).line==4 && Newpanel.items.get(i).stop==1)
					counter[3]=1;
				else if(Newpanel.items.get(i).line==5 && Newpanel.items.get(i).stop==1)
					counter[4]=1;
				else if(Newpanel.items.get(i).line==6 && Newpanel.items.get(i).stop==1)
					counter[5]=1;
			}
			for(int a:counter)
				if(a==1)
					sum+=1;
			if(sum>3){
				for(int i=0;i<Newpanel.items.size();i++){
					if(Newpanel.items.get(i).stop==1)
						Newpanel.items.get(i).stop=0;
				}

			}
			else{
				for(int i=0;i<Newpanel.items.size();i++){
					if(Newpanel.items.get(i).stop==0)
						Newpanel.items.get(i).stop=1;
				}
			}
		}
		else if(stopLine==8)
			if(Newpanel.items.get(Newpanel.items.size()-1).delay>10)
				Newpanel.items.get(Newpanel.items.size()-1).delay-=2;
			else 
				JOptionPane.showMessageDialog(null, "Speed is Maximum..."," Danger", JOptionPane.WARNING_MESSAGE);
		else if(stopLine==9)
			if(Newpanel.items.get(Newpanel.items.size()-1).delay<40)
				Newpanel.items.get(Newpanel.items.size()-1).delay+=2;
			else 
				JOptionPane.showMessageDialog(null, "Speed is Minimum..."," Danger", JOptionPane.WARNING_MESSAGE);
		else{
			for(int i=0;i<Newpanel.items.size();i++){
				if(Newpanel.items.get(i).line==stopLine){
					if(Newpanel.items.get(i).stop==0)
						Newpanel.items.get(i).stop=1;
					else
						Newpanel.items.get(i).stop=0;
				}
			}
		}
	}

}

/**
 * 
 * @author Yash
 *Class for adding metros
 */
class TestAction extends AbstractAction{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MetroLine_10097 a;
	Metro_10097 metro;

	public TestAction(String name){
		super(name);
	}



	public boolean addedToLine(int line, int numTrains, boolean dir) throws IOException{
		boolean add = false;
		if(line==1){
			a=new RedLine_10097();
			if(numTrains<a.getNoOfTrains()){
				if(dir==false)
					metro=new Metro_10097(1,20,310,5,440,124,dir,1);
				else
					metro=new Metro_10097(1,20,850,124,432,124,dir,1);
				add=true;
			}
		}
		else if(line == 5){
			a=new GreenLine_10097();
			if(numTrains<a.getNoOfTrains()){
				if(dir==true)
					metro=new Metro_10097(5,20,26,126,22,126,dir,1);
				else
					metro=new Metro_10097(5,20,370,160,400,126,dir,1);
				add=true;
			}
		}
		else if(line == 6){
			a=new BlueLine_10097();
			if(numTrains<a.getNoOfTrains()){
				if(dir == false)
					metro=new Metro_10097(6,20,215,490,76,354,dir,1);
				else
					metro=new Metro_10097(6,20,1010,402,960,402,dir,1);
				add=true;
			}
		}
		else if(line == 7){
			a=new BlueLine_10097();
			if(numTrains<a.getNoOfTrains()){
				metro=new Metro_10097(7,20,840,184,810,184,true,1);
				add=true;
			}	
		}
		else if(line == 3){
			a=new YellowLine_10097();
			if(numTrains<a.getNoOfTrains()){
				if(dir==false)
					metro=new Metro_10097(3,20,480,-30,556,70,dir,1);
				else 
					metro=new Metro_10097(3,20,338,639,338,626,dir,1);
				add=true;
			}
		}
		else if(line == 4){
			a=new OrangeLine_10097();
			if(numTrains<a.getNoOfTrains()){
				if(dir==false)
				metro=new Metro_10097(4,20,558,184,236,488,dir,1);
				else
					metro=new Metro_10097(4,20,236,488,558,184,dir,1);
				add=true;
			}

		}
		else if(line == 2){
			a=new VioletLine_10097();
			if(numTrains<a.getNoOfTrains()){
				if(dir==false)
					metro=new Metro_10097(2,20,560,280,580,330,dir,1);
				else
					metro=new Metro_10097(2,20,972,592,580,310,dir,1);
				add = true;
			}
		}
		if(add==true){
			Newpanel.items.add(metro);
			return true;
		}
		else
			return false;
	}



	public void addTrain(int line, int numTrains, boolean dir){
		for(int i=0;i<Newpanel.items.size();i++){
			int lineNum = Newpanel.items.get(i).line;
			if(lineNum==line){
				if(Newpanel.items.get(i).stop==0)
					JOptionPane.showMessageDialog(null, "Cannot add train in an emergency situation!"," Sorry", JOptionPane.ERROR_MESSAGE);
				else{
					try {
						if(!addedToLine(line, numTrains,dir))
							JOptionPane.showMessageDialog(null, "Maximum number of metros already running..."," Sorry", JOptionPane.ERROR_MESSAGE);
					} catch (IOException e) {

					}

				}
				break;
			}
		}

	}


	public void actionPerformed(ActionEvent event){ 
		int line[]=new int[6];
		for(Metro_10097 m:Newpanel.items){
			if(m.line<6)
				line[m.line-1]++;
			else
				line[5]++;
		}

		if(getValue(Action.NAME)=="Rithala to Dilshad Garden")
			addTrain(1, line[0], false);
		else if(getValue(Action.NAME)=="Dilshad Garden to Rithala")
			addTrain(1, line[0], true);
		else if(getValue(Action.NAME)=="Mundka to Kirti Nagar")
			addTrain(5, line[4], true);
		else if(getValue(Action.NAME)=="To Mundka")
			addTrain(5, line[4], false);
		else if(getValue(Action.NAME)=="Jahangirpuri to HUDA City Centre")
			addTrain(3, line[2], false);
		else if(getValue(Action.NAME)=="HUDA City Centre to Jahangirpuri")	
			addTrain(3, line[2], true);
		else if(getValue(Action.NAME)=="Dwarka Sector 21 to Noida City Centre")
			addTrain(6, line[5], false);
		else if(getValue(Action.NAME)=="Noida City Centre to Dwarka Sector 21")
			addTrain(6, line[5], true);
		else if(getValue(Action.NAME)=="Vaishali to Dwarka")
			addTrain(7, line[5], true);
		else if(getValue(Action.NAME)=="Dwarka Sector 21 to New Delhi")
			addTrain(4, line[3], false);
		else if(getValue(Action.NAME)=="New Delhi to Dwarka Sector 21")
			addTrain(4, line[3], true);
		else if(getValue(Action.NAME)=="Central Secretariat to Badarpur")
			addTrain(2, line[1], false);
		else if(getValue(Action.NAME)=="Badarpur to Central Secretariat to Badarpur")
			addTrain(2, line[1], true);
	}
}





