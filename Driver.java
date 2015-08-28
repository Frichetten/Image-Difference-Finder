import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Process Beginning");
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("Image1.jpg")); //Insert proper file name here
		} catch (IOException e) {
			System.out.println("Cannot find file");
		}
	    BufferedImage test = image;
	    Graphics2D t = (Graphics2D) test.getGraphics();
		int barrier = 0;
		barrier = image.getWidth()/2;
		barrier += 3; //This line needs to be fine tuned based on the image barrier barrier.
		
		int pixel1;
		int red1;
		int green1;
		int blue1;
		int pixel2;
		int red2;
		int green2;
		int blue2;
		
		t.setColor(Color.black); //Color can be changed based on preference
		
		for (int k = 0; k < image.getHeight(); k++){
			for (int i = 0; i < image.getWidth()-(barrier); i++){
				/**
				 * The following chunk of code I cannot even begin to take credit
				 * for. I had to do some research into how to select individual 
				 * pixels in an image. The folowing code was something I got from
				 * Alvin Alexanders blog. More can be found at 
				 * http://alvinalexander.com/blog/post/java/getting-rgb-values-for
				 * -each-pixel-in-image-using-java-bufferedi
				 */
				pixel1 = image.getRGB(i,k);
				red1 = (pixel1 >> 16) & 0xff;
				green1 = (pixel1 >> 8) & 0xff;
				blue1 = (pixel1) & 0xff;
				
				pixel2 = image.getRGB(i+(barrier),k);
				red2 = (pixel2 >> 16) & 0xff;
				green2 = (pixel2 >> 8) & 0xff;
				blue2 = (pixel2) & 0xff;
				///////////////////////////////////////////////////////////////////
				
				//Because not all pixels are the same in the two images, you have to 
				//set up a "range" of values that it will approve.
				if (red1 <= red2 && red1 + 35 >= red2){ //Playing with the range can produce interesting images
						t.fillRect(i, k, 1, 1);
				}
				else if (red1 >= red2 && red2 + 35 >= red1){
						t.fillRect(i, k, 1, 1);
				}
				//
				if (green1 <= green2 && green1 + 35 >= green2){
						t.fillRect(i, k, 1, 1);
				}
				else if (green1 >= green2 && green2 + 35 >= green1){
						t.fillRect(i, k, 1, 1);
				}
				//
				if (blue1 <= blue2 && blue1 + 35 >= blue2){
						t.fillRect(i, k, 1, 1);
				}
				else if (blue1 >= blue2 && blue2 + 35 >= blue1){
						t.fillRect(i, k, 1, 1);
				}
			}
		}
	    try {
	    	File output = new File("Image1-output.jpg"); //Needs to be fine tuned
	    	ImageIO.write(test, "png", output);          //based on what you want
		} catch (IOException e) {
			System.out.println("Cannot write image");
		}
	    System.out.println("Process Complete");
	}
}
