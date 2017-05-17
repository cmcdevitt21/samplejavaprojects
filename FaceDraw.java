//Colby McDevitt
//Face Draw Assignment CPSC 245 Spring 2017
import java.awt.*;
import java.util.*;
import javax.swing.*;
//import libraries



public class FaceDraw {
	public int width, heigth;
	public Graphics c1;
	public int startX;
	public int startY;
	public int setSmile;
	public int smile;
	public int[] FaceList;
	public String printCir;
	public static RandFacePanel f;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame frame = new JFrame("Drawing Faces");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		int smile = 0;
		
		
		FaceDraw circles1 = new FaceDraw(3);
		circles1.printFaceList();
		
		frame.getContentPane().add(f);
		frame.pack();
		frame.setVisible(true);
	



		
		
	}
	
public FaceDraw(int setSmile) {
		smile = setSmile;
		f = new RandFacePanel();
}
	


public void printFaceList(){
	
		System.out.println(printCir);
}

  class RandFacePanel extends JPanel {
	public int startX;
	public int startY;
	public int mouthAngle;
	public int heigth;
	public int width;
	public int smile;
	public int Dim;
	public String printCir;
	
	public RandFacePanel(){
		
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.blue);
	}
	public void paintComponent(Graphics page){
		String[] FaceList = new String[5];
	
	
		Random gen = new Random();
		int genfacenum = 3 + gen.nextInt(7);
		
		for(int i = 0; i <= genfacenum; i++){
			
			int mouthAngle = -1 + gen.nextInt(3);
						
			
			if (mouthAngle > 0){
				int startX = 100 + gen.nextInt(200);
				int startY = 100 + gen.nextInt(150);
				int width = 100 + gen.nextInt(10);
				int heigth = 100 + gen.nextInt(10);
			page.drawOval(startX, startY, width, heigth);
			page.fillOval(startX + 40, startY + 20, 10, 10);
			page.fillOval(startX + 80, startY + 20, 10, 10);
			page.drawArc(startX + 40, startY + 30, 50, 50, 210, 120);
			FaceList[0]= "x-starting position: " + Integer.toString(startX);
			FaceList[1]= "y-strating positon: " + Integer.toString(startY);
			FaceList[2]= "width of circle: " + Integer.toString(width);
			FaceList[3]= "height of circle: " + Integer.toString(heigth);
			FaceList[4]= "and it's Smiling!";
			String printCir = Arrays.toString(FaceList);
			System.out.println(printCir);
			}
			else if (mouthAngle == 0){
				int startX = 50 + gen.nextInt(200);
				int startY = 50 + gen.nextInt(150);
				int width = 100 + gen.nextInt(10);
				int heigth = 100 + gen.nextInt(10);
				page.drawOval(startX , startY , width, heigth);
				page.fillOval(startX + 40, startY + 20, 10, 10);
				page.fillOval(startX + 80, startY + 20, 10, 10);
				page.drawArc(startX + 40, startY + 60, 50, 0, 180, -180);
				FaceList[0]= "x-starting position: " + Integer.toString(startX);
				FaceList[1]= "y-strating positon: " + Integer.toString(startY);
				FaceList[2]= "width of circle: " + Integer.toString(width);
				FaceList[3]= "height of circle: " + Integer.toString(heigth);
				FaceList[4]= "and it's has no Emotion";	
				String printCir = Arrays.toString(FaceList);
				System.out.println(printCir);
			}
			else {
				int startX = 150 + gen.nextInt(200);
				int startY = 150 + gen.nextInt(150);
				int width = 100 + gen.nextInt(10);
				int heigth = 100 + gen.nextInt(10);
				page.drawOval(startX , startY , width, heigth);
				page.fillOval(startX + 40, startY + 20, 10, 10);
				page.fillOval(startX + 80, startY + 20, 10, 10);
				page.drawArc(startX + 40, startY + 40, 40, 30, 180, -180);
				FaceList[0]= "x-starting position: " + Integer.toString(startX);
				FaceList[1]= "y-strating positon: " + Integer.toString(startY);
				FaceList[2]= "width of circle: " + Integer.toString(width);
				FaceList[3]= "height of circle: " + Integer.toString(heigth);
				FaceList[4]= "and it's Frowning";
				String printCir = Arrays.toString(FaceList);
				System.out.println(printCir);
			}
			
					
			
			}
	}
}

}


	 
	


