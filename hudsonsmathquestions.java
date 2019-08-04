public class hudsonsmathquestions {
	final int biggestNumber = 29;
	public static void main(String args[]) {
		hudsonsmathquestions q = new hudsonsmathquestions();
		q.playgame();
	}
	
	public void playgame() {
		
		
		int x=(int) Math.round(Math.random() * biggestNumber+ 1);
		int y=(int) Math.round(Math.random() * biggestNumber+ 1);
		System.out.println("What is "+ x +" x "+ y);
		
		boolean correct=false;
		int numguesses=0;
		while(!correct && numguesses<3) {
			String guessStr = JOptionPane.showInputDialog(null, "What is "+ x +" x "+ y, "");
			int guess = Integer.parseInt(guessStr);
			numguesses++;
			if(guess==x*y) {
				JOptionPane.showOptionDialog(null, null, "you did it!!!", 0, 0, null, null, null);
				System.out.println("you did it");
				correct=true;

			}
			else {
				System.out.println("oops");

			}

		}
		if(numguesses==3 && !correct) {
			System.out.println("you failed.");
		}


	}

}
