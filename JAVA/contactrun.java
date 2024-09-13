import java.util.*;
public class contactrun 
{
public static void main(String[] args)
{
    System.out.println("==============================================================");
    System.out.println("==============================================================");
    System.out.println("===========WELCOME TO THE CONTACT MANAGEMENT SYSTEM===========");
    System.out.println("==============================================================");
    System.out.println("==============================================================");
    System.out.println();
    
    Scanner sin=new Scanner(System.in);
    System.out.println("Enter How Many Entries Of contact You Want To Enter In Database");
    int n=sin.nextInt();
    contact c[]=new contact[n];
    for(int i=0;i<c.length;i++)
    {
        c[i]=new contact();
    }

    boolean bc=true;
    while(bc)
    {
        System.out.println("1 for display all contact");
        System.out.println("2 for search contact by mobile number");
        System.out.println("3 for search by first name");
        System.out.println("4 sor search by last name");
        System.out.println("5 for edit in exicting contact");
        System.out.println("6 for display all contact of simcard");
        System.out.println("7 for display all contact of phone");
        System.out.println("8 for exit");
        int sw=sin.nextInt();
        switch(sw)
        {
          
            case 1:
            {
                for(int i=0;i<c.length;i++)
                {
                    c[i].display();
                }
                break;
            }

            case 2:
            {
              
                c[0].search_contact(c);
                break;
            }

            case 3:
            {
              
                c[0].search_firstname(c);
                break;
            }

            case 4:
            {
              
                c[0].search_lastname(c);
                break;
            }

            case 5:
            {
              
                c[0].editdetails(c);
                break;
            }

            case 6:
            {
              
                c[0].displaysim(c);
                break;
            }

            case 7:
            {
              
                c[0].displayphone(c);
                break;
            }
            case 8:
            {
                bc=false;
                break;
            }
            

            default:
            {
                System.out.println("enter valid value");
            }

        }
    }

    System.out.println("==============================================================");
    System.out.println("==============================================================");
    System.out.println("====================THANKS FOR VISITING US====================");
    System.out.println("==============================================================");
    System.out.println("==============================================================");


}
    
}

class contact
{
    Scanner sin=new Scanner(System.in);String contact_type;
    String firstname,lastname,address;long mobile_no;String dob,email_id;
   contact()
   {
    System.out.println("enter where can you save the number(sim or phone)");
    boolean gg=true;
    while(gg)
    {
      String type=sin.nextLine();
      if(type.equalsIgnoreCase("sim") || type.equalsIgnoreCase("phone"))
        {
             contact_type=type;
             gg=false;
        }
        else{
            System.out.println("invalid data entered");
        }
    }

     System.err.println("enter first name ");
     firstname=sin.nextLine();
     System.out.println("enter last name ");
     lastname=sin.nextLine();
     System.out.println("enter your address ");
     address=sin.nextLine();
     System.out.println("enter your email id ");
     email_id=sin.nextLine();
     System.out.println("enter your date of birth in dd/mm/yyyy ");
     dob=sin.nextLine();
     System.out.println("enter mobile number ");
     boolean chek=true;
     while(chek)
     {
     long tamp=sin.nextLong();
     long camp=tamp;
     long rem=0;long rev=0;int count=0;
     while(tamp!=0)
     {
        rem=tamp%10;
        count++;
        rev=rev+rem*10;
        tamp=tamp/10;
     }
     
     if(count==10)
     {
        mobile_no=camp;
        chek=false;
     }
     else{
        System.out.println("*enter valid mobile number*");
     }
    }
   }
     
    void display()
    {
        System.out.println("saved in :- "+contact_type);
        System.out.println("contact name :-"+firstname+"  "+lastname);
        System.out.println("contact number :-"+mobile_no);
        System.out.println("contact address :-"+address);
        System.out.println("email id :-"+email_id);
        System.out.println("date of birth :-"+dob);
    }


    void search_contact(contact c[])
    {
        System.out.println("enter contact number you want to search ");
        long tamp=sin.nextLong();
        int co=0;
    for(int i=0;i<c.length;i++)
    {
        if(c[i].mobile_no==tamp)
        {
            System.out.println("saved in :- "+c[i].contact_type);
            System.out.println("contact name :-"+c[i].firstname+"  "+c[i].lastname);
        System.out.println("contact number :-"+c[i].mobile_no);
        System.out.println("contact address :-"+c[i].address);
        System.out.println("email id :-"+c[i].email_id);
        System.out.println("date of birth :-"+c[i].dob);
        }
        else{co++;}
        if(c.length==co)
        {
            System.out.println("no result found ");
        }
    }
   }


    void search_firstname(contact c[])
    {
        System.out.println("enter first name you want to search ");
        String amp=sin.nextLine();
        String tamp=sin.nextLine();
        
        int co=0;
    for(int i=0;i<c.length;i++)
    {
        if(c[i].firstname.equals(tamp))
        {
            System.out.println("saved in :- "+c[i].contact_type);
            System.out.println("contact name :-"+c[i].firstname+"  "+c[i].lastname);
        System.out.println("contact number :-"+c[i].mobile_no);
        System.out.println("contact address :-"+c[i].address);
        System.out.println("email id :-"+c[i].email_id);
        System.out.println("date of birth :-"+c[i].dob);
        }
        else{co++;}
        if(c.length==co)
        {
            System.out.println("no result found ");
        }
    }

    }

    void search_lastname(contact c[])
    {
        System.out.println("saved in :- "+c[i].contact_type);
        System.out.println("enter last name you want to search ");
        String amp=sin.nextLine();
        String tamp=sin.nextLine();
        int co=0;
    for(int i=0;i<c.length;i++)
    {
        if(c[i].lastname.equals(tamp))
        {
            System.out.println("saved in :- "+c[i].contact_type);
            System.out.println("contact name :-"+c[i].firstname+"  "+c[i].lastname);
        System.out.println("contact number :-"+c[i].mobile_no);
        System.out.println("contact address :-"+c[i].address);
        System.out.println("email id :-"+c[i].email_id);
        System.out.println("date of birth :-"+c[i].dob);
        }
        else{co++;}
        if(c.length==co)
        {
            System.out.println("no result found ");
        }
    }

    }

    void editdetails(contact c[])
    {
      boolean bb=true;
      
      System.out.println("enter mobile number you want to edit");
      long tamp=sin.nextLong();
        while(bb)
        {
            System.out.println("1 for edit in first name ");
            System.out.println("2 for edit in last name ");
            System.out.println("3 for edit in email id ");
            System.out.println("4 for edit in address ");
            System.out.println("5 for edit in birth date ");
            System.out.println("6 for edit in mobile number ");
            System.out.println("7 for go to exit ");
            
            int xn=sin.nextInt();
            switch(xn)
            {
                case 1:
                {
                    boolean cc=true;
                    for(int i=0;i<c.length;i++)
                    {
                     if(c[i].mobile_no==tamp)
                      {
                      System.out.println("enter new first name");
                      String sk=sin.nextLine();
                      String sc=sin.nextLine();
                      c[i].firstname=sc;
                      System.out.println("+++your detail updated sucessfully+++");
                      cc=false;
                      }
                    }

                    if(cc)
                    {
                        System.out.println("XXXXX  no result found   XXXXX");
                    }
                    break;

                }

                case 2:
                {
                    boolean cc=true;
                    for(int i=0;i<c.length;i++)
                    {
                     if(c[i].mobile_no==tamp)
                      {
                      System.out.println("enter new last name");
                      String sk=sin.nextLine();
                      String sc=sin.nextLine();
                      c[i].lastname=sc;
                      System.out.println("+++your detail updated sucessfully+++");
                      
                      }
                    }
                    if(cc)
                    {
                        System.out.println("XXXXX  no result found   XXXXX");
                    }

                    break;

                }

                case 3:
                {
                    boolean cc=true;
                    for(int i=0;i<c.length;i++)
                    {
                     if(c[i].mobile_no==tamp)
                      {
                      System.out.println("enter new email id");
                      String sk=sin.nextLine();
                      String sc=sin.nextLine();
                      c[i].email_id=sc;
                      System.out.println("+++your detail updated sucessfully+++");
                      
                      }
                    }
                    if(cc)
                    {
                        System.out.println("XXXXX  no result found   XXXXX");
                    }
                    break;


                }


                case 4:
                {
                    boolean cc=true;
                    for(int i=0;i<c.length;i++)
                    {
                     if(c[i].mobile_no==tamp)
                      {
                      System.out.println("enter new address");
                      String sk=sin.nextLine();
                      String sc=sin.nextLine();
                      c[i].address=sc;
                      System.out.println("+++your detail new sucessfully+++");
                      
                      }
                    }
                    if(cc)
                    {
                        System.out.println("XXXXX  no result found   XXXXX");
                    }
                    break;


                }

                case 5:
                {
                    boolean cc=true;
                    for(int i=0;i<c.length;i++)
                    {
                     if(c[i].mobile_no==tamp)
                      {
                      System.out.println("enter new birth date");
                      String sk=sin.nextLine();
                      String sc=sin.nextLine();
                      c[i].dob=sc;
                      System.out.println("+++your detail new sucessfully+++");
                      
                      }
                    }
                    if(cc)
                    {
                        System.out.println("XXXXX  no result found   XXXXX");
                    }
                    break;


                }


                case 6:
                {
                    boolean cc=true;
                    for(int i=0;i<c.length;i++)
                    {
                     if(c[i].mobile_no==tamp)
                      {
                      System.out.println("enter new mobile number");
                      long sc=sin.nextLong();
                      c[i].mobile_no=sc;
                      System.out.println("+++your detail updated sucessfully+++");
                     
                      }
                    }
                    if(cc)
                    {
                        System.out.println("XXXXX  no result found   XXXXX");
                    }
                     break;


                }

                case 7:
                {
                    bb=false;
                    break;
                }
                
                default:
                {
                    System.out.println("plese enter valid value ");
                    break;
                }




            }

        }

    }
  


    void displaysim(contact c[])
    {
         for(int i=0;i<c.length;i++)
         {
           if(c[i].contact_type.equalsIgnoreCase("sim"))
           {
            System.out.println("saved in :- "+c[i].contact_type);
            System.out.println("contact name :-"+c[i].firstname+"  "+c[i].lastname);
        System.out.println("contact number :-"+c[i].mobile_no);
        System.out.println("contact address :-"+c[i].address);
        System.out.println("email id :-"+c[i].email_id);
        System.out.println("date of birth :-"+c[i].dob);
           }
         }
    }
  

    void displayphone(contact c[])
    {
         for(int i=0;i<c.length;i++)
         {
           if(c[i].contact_type.equalsIgnoreCase("phone"))
           {
            System.out.println("saved in :- "+c[i].contact_type);
            System.out.println("contact name :-"+c[i].firstname+"  "+c[i].lastname);
        System.out.println("contact number :-"+c[i].mobile_no);
        System.out.println("contact address :-"+c[i].address);
        System.out.println("email id :-"+c[i].email_id);
        System.out.println("date of birth :-"+c[i].dob);
           }
         }
    }

}