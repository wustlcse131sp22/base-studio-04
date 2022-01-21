package studio4;

import java.io.FileNotFoundException;

import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.ArgsProcessor;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {
	public static void readFileViaArgsProcessorAndDraw(ArgsProcessor ap) {
		// TODO: Write studio code here
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		SwingUtilities.invokeLater(()->{
			ArgsProcessor ap = DrawingFiles.createArgsProcessorFromFile(args);
			while (ap != null) {
				StdDraw.clear();
				readFileViaArgsProcessorAndDraw(ap);
				ap = DrawingFiles.createArgsProcessorFromFile(new String[] {});
			}
			System.exit(0);
		});
	}
}
