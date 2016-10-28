package edu.iiitd.ap2011.yash10097.metro;


import java.awt.EventQueue;
import java.io.IOException;
import javax.swing.JFrame;



/**
*
* @author yash10097
* 
*/

public class MetroAdministrationTest_10097 {

	/**
	 * Main method containing menu to the Metro_10097 Program
	 * providing a menu to view the operational lines as of now
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
        {
           public void run()
           {
        	  ViewMetroLine_10097 map;
			try {
				map = new ViewMetroLine_10097();
				map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	              map.setVisible(true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			}
              
           }
        });
		
	}//main

}//MetroAdministrationTest_10097

 

 
 