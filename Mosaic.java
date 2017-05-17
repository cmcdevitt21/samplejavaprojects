//Colby McDevitt
//CPSC 245 spring 2017
//Week 4 Assignment

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



import java.lang.*;
import java.text.*;



	
public class Mosaic {  //includes main method to make JFrame

	public gridPanel g = new gridPanel();
	
	public static void main(String[] args) {
		
System.out.println("CP 245 Spring 2017\nColby McDevitt\nProgramming assignment week 4");
//prints heading with my name 
		JFrame frame = new JFrame("Mosaic Creator!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//creates new applet window
		
		frame.getContentPane().add(new gridPanel());//creates a JPanel with the mosaic shapes
		
		frame.pack();
		frame.setVisible(true);//sets frame to appear
		
	}
}

 class gridPanel extends JPanel{//creates JPanel
		private Graphics p;
		private JButton randomize;
		private JPanel randButPanel;//initialze objects
	public gridPanel(){//makes instance of gridPanel
		setPreferredSize(new Dimension(600, 640));
		setLayout(new BorderLayout());
		
		
		
		randomize = new JButton("Randomize!");//adds button for user to press
		 randomize.addMouseListener(new RandomListener());//adds mouse listener for input
		 
		 
		 randButPanel = new JPanel();
			randButPanel.setPreferredSize(new Dimension(600, 40));
			randButPanel.setBackground(Color.DARK_GRAY);//creates panel for random button
			
		randButPanel.add(randomize);
		add(randButPanel, BorderLayout.SOUTH);//adds button to the screen at bottom
		
		
	
	}
	public void paintComponent(Graphics p){
		int startX=0,startY=0, rand1, randCh;
		float randRed, randBl, randGr ;
		Random gen = new Random();
		String[] letters ={"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		//initialize objects and make string array of letters
		
		super.paintComponent(p);//adds graphics to screen
		
		
		for(int j = 0; j <=9; j++){//loop through ten shapes
			
		for(int i=0; i<= 9; i++){//loop through ten shapes
			rand1 = -1 + gen.nextInt(2);//random to allow for shape choice
			randRed = gen.nextFloat();//random for color
			randBl = gen.nextFloat();//random for color
			randGr = gen.nextFloat();//random for color
			randCh = gen.nextInt(26);//random for letter
			
			if (rand1 < 0){//checks random integer for circle
			p.fillOval(startX + (j*60), startY +(i*60), 60, 60);
			p.setColor(new Color(randRed, randBl, randGr));
			p.drawString(letters[randCh],startX + (j*60)+30 ,startY +(i*60)+30 );
			System.out.println("Circle at (x, y: " + startX + (j*60)+ "," + startY +(i*60)+ "Color(R,G,B)" + randRed+ "," + randBl+ "," + randGr+ "Letter:" + letters[randCh]);
		}//makes circle, print attributes to console
			else if (rand1 >= 0){//checks random for square
				p.fillRect(startX + (j*60), startY +(i*60), 60, 60);
				p.setColor(new Color(randRed, randBl, randGr));
				p.drawString(letters[randCh],startX + (j*60)+30 ,startY +(i*60)+30 );
				System.out.println("Square at (x, y: " + startX + (j*60)+ "," + startY +(i*60)+ "Color(R,G,B)" + randRed+ "," + randBl+ "," + randGr+ "Letter:" + letters[randCh]);
			}//makes square, prints attributes to console
			}
			}
		
		
	}
	
	private class RandomListener implements MouseListener{ 
	public void mousePressed (MouseEvent e){//if mouse clicked on randomize button, repaints masaic shapes
		repaint();
	}
	public void mouseClicked(MouseEvent e){}

	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}//mouse events not use, remain empty
	}

}





