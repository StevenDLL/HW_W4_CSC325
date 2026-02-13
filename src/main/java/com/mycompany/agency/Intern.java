package com.mycompany.agency;


// TODO 1: Make Intern a child of StaffEmploee -- DONE

public class Intern extends StaffEmployee {
    //-----------------------------------------------------------------
    //  TODO 2: Constructor: Sets up this intern using the specified -- DONE
    //  information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone, "000-00-0000", 0.0);
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern. -- DONE
    //-----------------------------------------------------------------
    @Override
    public double pay() {
            return 0.0;
    }
}
