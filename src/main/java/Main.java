import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 *
 */
public class Main
{
	/**
	 * @param args input
	 */
	public static void main(String[] args) throws AWTException, IOException
	{
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new FlowLayout());
		JLabel image = new JLabel();
		frame.getContentPane().add(image);
		frame.pack();
		frame.setVisible(true);
		while (true)
		{
			long mllisStart = System.currentTimeMillis();
			BufferedImage img = new Robot()
					.createScreenCapture(new Rectangle(0, 0, 500, 500));
			image.setIcon(new ImageIcon(img));
			for (int i = 0; i < 500; i++)
			{
				int red = getColorOfImage(img, i, 20).getRed();
				red = getColorOfImage(img, i, 20).getRed();
				red = getColorOfImage(img, i, 20).getRed();
				red = getColorOfImage(img, i, 20).getRed();
			}
			double millies = System.currentTimeMillis() - mllisStart;
			System.out.println(millies);
		}
	}
	
	
	private static Color getColorOfImage(BufferedImage image, int x, int y)
	{
		int clr = image.getRGB(x, y);
		int red = (clr & 0x00ff0000) >> 16;
		int green = (clr & 0x0000ff00) >> 8;
		int blue = clr & 0x000000ff;
		return new Color(red, green, blue);
	}
}
