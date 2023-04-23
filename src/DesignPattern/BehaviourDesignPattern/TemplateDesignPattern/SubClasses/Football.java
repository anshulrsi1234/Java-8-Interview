package DesignPattern.BehaviourDesignPattern.TemplateDesignPattern.SubClasses;

import DesignPattern.BehaviourDesignPattern.TemplateDesignPattern.Game;

/**
 * 
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class Football extends Game {

	   @Override
	   public void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	   @Override
	   public void initialize() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   @Override
	   public void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}
