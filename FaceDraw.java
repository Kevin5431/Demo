import java.util.Random;
import java.util.ArrayList;

/**
* FaceDraw draws a random number, between 3 to 10, of randomized faces to a Frame.
* These faces are of varying sizes, expressions, and colors.
*
*@author Aiden Fifer
*/

public class FaceDraw{

	public static void main(String[] args){

		// Creates a random number of faces between 3 to 10
		Random rand = new Random();
		ArrayList<Face> faceList = new ArrayList<Face>();
		int count = rand.nextInt(8) + 3;

		for(int i = 1; i <= count; i++){

			faceList.add(new Face(384, 460));
			
		}

		// Creates the Frame and gives it the faces to add to the Frame.
		FaceFrame myFrame = new FaceFrame(faceList);
		myFrame.setVisible(true);

	}

}