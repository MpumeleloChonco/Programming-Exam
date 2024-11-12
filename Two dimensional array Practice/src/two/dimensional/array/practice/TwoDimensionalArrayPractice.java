/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package two.dimensional.array.practice;

/**
 *
 * @author lab_services_student
 */
public class PropertySales {
    public static void main(String[] args) {
        // Two-dimensional array to store property sales for two estate agents
        double[][] sales = {
            {800000, 1500000, 2000000}, // Sales for Joe Bloggs
            {700000, 1200000, 1600000}  // Sales for Jane Doe
        };

        // Names of estate agents
        String[] agents = {"Joe Bloggs", "Jane Doe"};

        // Variables to store total sales and commissions
        double[] totalSales = new double[2];
        double[] commissions = new double[2];

        // Calculate total sales and commissions for each estate agent
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                totalSales[i] += sales[i][j];
            }
            commissions[i] = totalSales[i] * 0.02;
        }

        // Print the total sales and commissions for each estate agent
        for (int i = 0; i < agents.length; i++) {
            System.out.println("Total sales for " + agents[i] + ": " + totalSales[i]);
            System.out.println("2% commission for " + agents[i] + ": " + commissions[i]);
        }

        // Determine the top-selling estate agent
        int topAgentIndex = (totalSales[0] > totalSales[1]) ? 0 : 1;
        System.out.println("Top-selling estate agent: " + agents[topAgentIndex]);
    }
}

       
    }
    
}
