package com.mycompany.agency;


public class Staff {
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 employees to the staffList

        staffList[0] = new Executive("Jack", "123 Main St", "555-0101", "111-22-3333", 2500.00);
        staffList[1] = new StaffEmployee("Alice", "456 Oak Ave", "555-0102", "222-33-4444", 1800.00);
        staffList[2] = new StaffEmployee("Bob", "789 Pine Rd", "555-0103", "333-44-5555", 1800.00);
        staffList[3] = new TempEmploee("Charlie", "321 Elm St", "555-0104", "444-55-6666", 25.00);
        staffList[4] = new Intern("Dave", "654 Birch Ln", "555-0105");
        staffList[5] = new Intern("Eve", "987 Cedar Ct", "555-0106");

        ((Executive) staffList[0]).awardBonus(500.00);

        ((TempEmploee) staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
