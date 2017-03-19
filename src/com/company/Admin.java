package com.company;

/**
 * Created by edouardtopin on 19/03/2017.
 */
public class Admin extends User {

   public Admin() {
       super();
   }

   public Admin(String pseudo, String firstName, String lastName, String address, String email)
   {
       super(pseudo, firstName, lastName, address, email);
   }

    @Override
    public String toString() {
        return super.toString();
    }
}
