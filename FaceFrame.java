import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Graphics;

public class FaceFrame extends JFrame{

	public FaceFrame(ArrayList<Face> listIn){

		// Creates the basic Frame
		setTitle("Face Draw");
		setBounds(200, 200, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Adds the faces to the Frame
		FacePanel myFacePanel = new FacePanel(listIn);
		Container contentPane = getContentPane();
		contentPane.add(myFacePanel);

	}
	
}

class FacePanel extends JPanel{

	private ArrayList<Face> myList;

	public FacePanel(ArrayList<Face> listIn){

		myList = listIn;

	}

	public void paintComponent(Graphics g){

		super.paintComponent(g);

		// Runs through all the faces in the ArrayList and paints them and outputs information on them
		for(Face face: myList){

			face.toGraphic(g);
			System.out.println(face);

		}

	}

}