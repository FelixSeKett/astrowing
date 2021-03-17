package com.astrowing.game;

public class Pilot
{
    // =====================================================
    // FIELDS
    // =====================================================

    private String firstName;
    private String lastName;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Pilot(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    // =====================================================
    // METHODS
    // =====================================================

    // Getter-Methode
    public String giveFirstName()
    {
        return firstName;
    }

    public String giveLastName()
    {
        return lastName;
    }

    public String giveFullName()
    {
        return firstName + " " + lastName;
    }
}
