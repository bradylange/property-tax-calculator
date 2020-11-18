/*
 * Developer: Brady Lange
 * Course: CSIS 161 - Programming I
 * Institution: University of Wisconsin-River Falls
 * Class: PropertyTaxCalculator
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.propertytaxcalculator.calculators;

// Import swing library - message box
import javax.swing.JOptionPane;

/**
 * <p>
 * 		Calculates property tax based upon the taxable amount and the property's
 *      assessed value. Contains the {@link #main} method which instantiates 
 *      and sets up the program.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/08/2019
 * @since  1.0, 10/16/2016
 */
public class PropertyTaxCalculator 
{
	// ========================================================================
	// Main Method
	// ========================================================================
	/**
	 * Instantiates and sets up the program.
	 * 
	 * @param args  the array of command line arguments to be passed
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 10/16/2016
	 */
	public static void main(String[] args) 
	{ 
		// Identification name
		String name;			
		// Tax rate of 1.05
		final double TAX_RATE = 1.05;			
		// Property tax
		double propTax;			
		// Taxable percentage of 0.92
		final double TAXABLE_PERC = 0.92;
		// Taxable total
		double taxAmount;			
		// Assess value
		double assValue;	
		// Assess value String for dialog box
		String assValStr; 	
		// Currency sign 
		String sign = "$";											
		
		System.out.println("************************************************");
		System.out.println("Property Tax Calculator:");
		System.out.println("************************************************");
		// Ask for and retrieve name
		name = JOptionPane.showInputDialog("What is your name? ");	
		// Ask for and retrieve property's assessed value
		assValStr = JOptionPane.showInputDialog("What is your property's "
		                                        + "assessed value? ");	
		// Convert property's assessed value from String to Double
		assValue = Double.parseDouble(assValStr); 	
		
		// --------------------------------------------------------------------
		// Calculations
		// --------------------------------------------------------------------
		// taxable amount = assessed property value x taxable percentage
		// property tax = taxable amount / 100 x tax rate
		// --------------------------------------------------------------------
		taxAmount = assValue * TAXABLE_PERC;	
		propTax = taxAmount / 100 * TAX_RATE;						
		
		System.out.println("Property Tax:");
		System.out.println("************************************************");
		// Print name
		System.out.println("Name: " + name);	
		// Format: 20 spaces (String), 15 spaces & two decimal places (Double) 
		System.out.printf("Assessed Value:%20s%15.2f%n", sign, assValue);	
		// Format: 20 spaces (String), 15 spaces & two decimal places (Double) 
		System.out.printf("Taxable Amount:%20s%15.2f%n", sign, taxAmount);		
		// Format: 12 spaces (String), 15 spaces & two decimal places (Double) 
		System.out.printf("Tax Rate for each $100:%12s%15.2f%n", sign, 
						  TAX_RATE);	
		// Format: 22 spaces (String), 15 spaces & two decimal places (Double) 
		System.out.printf("Property Tax:%22s%15.2f%n", sign, propTax);				
	} 
}