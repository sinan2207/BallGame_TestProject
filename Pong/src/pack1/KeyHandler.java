package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			Properties.move_up = true;
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			Properties.move_down = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			Properties.move_up = false;
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			Properties.move_down = false;
		}

	}

}
