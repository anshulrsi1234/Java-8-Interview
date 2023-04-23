package DesignPattern.BehaviourDesignPattern.TemplateDesignPattern;

import DesignPattern.BehaviourDesignPattern.TemplateDesignPattern.SubClasses.Cricket;
import DesignPattern.BehaviourDesignPattern.TemplateDesignPattern.SubClasses.Football;

/**
 * 
 * @author Anshul
 *
 * @date  Apr 23, 2023
 */
public class TemplatePatternDemo {
	
	   public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();		
	   }
	}
