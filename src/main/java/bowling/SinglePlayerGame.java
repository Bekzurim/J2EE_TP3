package main.java.bowling;

import java.util.ArrayList;
import java.util.List;

public class SinglePlayerGame {
    
        int quilleDebout;
        boolean strike;
        boolean spare;
        List<Integer> score = new ArrayList<Integer>();
        int scoreFinal;
        
	public SinglePlayerGame() {
            quilleDebout=10;
            strike=false;
            spare=false;
            scoreFinal=0;
	}


	public void lancer(int nombreDeQuillesAbattues) {
            score.add(nombreDeQuillesAbattues);
            /*
            if (quilleDebout==10){
                if (!strike){
                    if(quilleDebout-nombreDeQuillesAbattues==0){
                        strike=true;
                        score+=10;
                    }
                    else{
                        score+=nombreDeQuillesAbattues;
                    }
                }
                else{
                    strike=false;
                    score+=0;
                }
            }
            else{
                if(quilleDebout-nombreDeQuillesAbattues==0){
                    spare=true;
                    score+=0;
                }
                else{
                    score+=nombreDeQuillesAbattues;
                    spare=false;
                }
            }*/
	}

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
		for (int i=0;i<score.size();i++){
                    scoreFinal+=score.get(i);
                }
                return scoreFinal;
	}
}
