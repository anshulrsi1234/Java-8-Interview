package DesignPattern.BehaviourDesignPattern.TemplateDesignPattern.SubClasses;

import DesignPattern.BehaviourDesignPattern.TemplateDesignPattern.Game;

/**
 * 
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class Cricket extends Game {

	   @Override
	   public void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	   @Override
	   public void initialize() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   @Override
	   public void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}
