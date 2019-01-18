/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CowTimer {
	static /*
	 * This is an advanced recipe. There may be more than one line of code for each
	 * instruction. Work in seconds when testing, then change to minutes
	 */
	CowTimer timer = new CowTimer();
	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
String m = JOptionPane.showInputDialog("How many minutes are you setting your alarm for?");
int min = Integer.parseInt(m);
timer.setTime(min);
timer.start();
	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60 seconds
		 * using Thread.sleep(int milliseconds).
		 */
		for(int i=minutes; i>1; i--) {
			System.out.println(i);
			Thread.sleep(60000);
			if(i==1) {
				System.out.println(1);
				Thread.sleep(6000);
				timer.playSound("moo.wav");
			}
		}
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can use the .wav file in the default package, or you can download one
		 * from freesound.org, then drag it intothe default package.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
