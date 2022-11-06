
import java.util.Scanner;

public class menuofchosse {
   static Scanner sc =new Scanner(System.in);
   //here is klart bror
    //Okej
    //bror du kan fixa operation
   static Operation op = new Operation();

    public static void menu() {


        System.out.println(".............................");
        System.out.println("..<<<menu of green book>>....");
        System.out.println(".............................");
        System.out.println(".......0 entr with manger.....");
        System.out.println(".............................");
        System.out.println(" .....1 add new contact......");
        System.out.println(".............................");
        System.out.println("..... 2 check for lista......");
        System.out.println("..............................");
        System.out.println("......3 show lista............");
        System.out.println("..............................");
        System.out.println("......4 updateracontact  .....");
        System.out.println("..............................");
        System.out.println("......5 deletemenu............");
        System.out.println("..............................");
        System.out.println("...... 6 quite................");
        System.out.println(".............................");
        System.out.println(".............................");
        //this chosse first menu.............................................
        while (true) {
            int selk = sc.nextInt();
            if (selk==0||selk == 1 || selk == 2 || selk == 3 || selk == 4 || selk == 5 || selk == 6) {
                switch (selk) {
                    case 0 : addcistor_adminstor();
                    break;
                    case 1 : addcontact();
                    break;
                    case 2 : searchMeue();
                    break;
                    case 3 : showlista();
                    break;
                    case 4 : updatera();
                    break;
                    case 5 : deletcontact();
                    break;
                    case 6 :System.out.println("Good bay see you soon");
                        System.exit(0);
                        default:



                }
            }else {System.out.println("pleas chose number 1 to 6 ");}
        }
    }
    public static void addcistor_adminstor(){
        System.out.println(".............................");
        System.out.println("... 1 addmanger>>....");
        System.out.println(".............................");
        System.out.println("... 2 listaOfadminst ..");
        System.out.println("..............................");
        System.out.println("..... 3 lista of vistore......");
        System.out.println("...............................");
        System.out.println("..... 4 add vistore............");
        System.out.println(".............................");
        System.out.println("..... 5 backmenu...............");
        System.out.println(".............................");
        while (true) {
            int lis = sc.nextInt();
            if (lis==1||lis==2||lis==3||lis==4||lis==5) {
                switch (lis) {
                    case 1 -> Operation.addaAdminster();
                    case 2 -> Operation.listaOfadminster();
                    case 3 -> Operation.listaOfvistore();
                    case 4 -> Operation.addVistore();
                    case 5 -> menu();

                }
            }else {
                System.out.println("plas chose number 1 to 5");
            }
            menu();
        }
    }
// .........1 addnew contct.................................
    public static void addcontact() {
        System.out.println("...........................");
        System.out.println("...<<.menuAddcontact.>>....");
        System.out.println("...........................");
        System.out.println("...1 add new contact.........");
        System.out.println("...........................");
        System.out.println("...2 showlista.............");
        System.out.println(".............................");
        System.out.println("...4 back to menu............");
        System.out.println("...........................");
        System.out.println("...........................");

       op.addlogic();
    }
//............2 menusearch
    public static void searchMeue() {
        System.out.println("...............................");
        System.out.println("...............................");
        System.out.println("....<<..searchmenu..>>.........");
        System.out.println("...............................");
        System.out.println("....1 search by name...........");
        System.out.println("...............................");
        System.out.println("....2 search by city............");
        System.out.println("...............................");
        System.out.println(".....3 search by numberphone.....");
        System.out.println("...............................");
        System.out.println(".....4 showlista................");
        System.out.println("...............................");
        System.out.println("......5 back to menu................");
        System.out.println("..................................");
        System.out.println("...................................");

        Operation.searchlogic();
    }
//,,,,,3 of menu
    public static void showlista() {
        System.out.println("lista is ");
        Operation.showall();

    }
//...........4 menu
    public static void updatera() {
        System.out.println("...............................");
        System.out.println("....<<..uppdaterameu..>>........");
        System.out.println("...............................");
        System.out.println("....1 uppdatera name...........");
        System.out.println("...............................");
        System.out.println("....2 uppdatera city............");
        System.out.println("...............................");
        System.out.println(".....3 uppdatera numberphone.....");
        System.out.println("...............................");
        System.out.println(".....4  uppdatera aftername.....");
        System.out.println("...............................");
        System.out.println("......,5 back to menu................");
        System.out.println("..................................");
        System.out.println("...................................");
        Operation.updtcontact();
    }

//....... 5 menu.......................................................
    public static void deletcontact() {
        System.out.println("...........................");
        System.out.println("...<<.deletedmenu.>>....");
        System.out.println("...........................");
        System.out.println("...1 showlista.........");
        System.out.println("...........................");
        System.out.println("...2  delted contact.............");
        System.out.println(".............................");
        System.out.println("...3  deleted all............");
        System.out.println("...........................");
        System.out.println("....4 back to menu.........");
        System.out.println("...........................");
        Operation.deletMenu();

    }

}
