import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Operation{
    int conut = 0;
    public static ArrayList<Contact> list = new ArrayList<Contact>();
    public static ArrayList<Adminstratore> list1 = new ArrayList<Adminstratore>();
    public static ArrayList<Vistore> list2 = new ArrayList<Vistore>();
    static menuofchosse m = new menuofchosse();
    static Scanner scanner = new Scanner(System.in);

    public static void addlogic() {
        int ax = scanner.nextInt();
        while (true) {
            if (ax == 1 || ax == 2 || ax == 3) {
                switch (ax) {
                    case 1:
                        addnew();
                        menuofchosse.menu();
                        break;
                    case 2:
                        showall();
                        menuofchosse.menu();
                        break;
                    case 3:
                        updtcontact();
                        menuofchosse.menu();
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("plese chose number 1 to 3");
            }
        }
    }

    public static void addnew() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter your after-name");
        String aftrname = scanner.nextLine();
        System.out.println(".................");
        System.out.println("enter you city");
        String city = scanner.nextLine();
        System.out.println("Enter you street");
        String street = scanner.nextLine();
        System.out.println("Enter your number-phone");
        int numberphone = scanner.nextInt();
        System.out.println("enter you number-phone2");
        int numberphone1 = scanner.nextInt();
        System.out.println("enter you zipcode");
        int zipcode = scanner.nextInt();
        System.out.println("enter you apt-number");
        int aptnumber = scanner.nextInt();
        Contact admn1 = new Contact(name, city, aftrname, street, numberphone, numberphone1, zipcode, aptnumber);
        list.add(admn1);
        System.out.println("contact add sucssfule");
        menuofchosse.menu();

    }

    public static void searchlogic() {
while (true) {
    int search = scanner.nextInt();
    if (search == 1 || search == 2 || search == 3 || search == 4 || search == 5) {
        switch (search) {

            case 1 -> Operation.searchByaftrname();
            case 2 -> searchBystreat();
            case 3 -> searchByname();
            case 4 -> searchBynumberPhone();
            case 5 -> menuofchosse.menu();
            default -> {
            }

        }
    } else {
        System.out.println("plase chose numbers 1 to 5 ");
    }
}
    }

    public static void searchByaftrname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter after-name search");
        System.out.println("..............................");
        String aftrnam = scanner.next();
        int flag = 1;
        Iterator<Contact> itadm = list.iterator();
        while (itadm.hasNext()) {
            Contact admn1 = itadm.next();
            if (aftrnam.equals(admn1.getAftername())) ;
            System.out.println("name is " + admn1.getName() + " \n after-name " + admn1.aftername + "\n city" + admn1.getCity() +
                    " \n number-phone " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                    + " \n aprtnumber " + admn1.getAptnumber());
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("name isnt existe");
        }
        menuofchosse.searchMeue();
    }

    public static void searchByname() {
        System.out.println("plz enter name search");
        System.out.println("..............................");
        String aftrnam = scanner.next();
        int flag = 1;
        Iterator<Contact> itadm = list.iterator();
        while (itadm.hasNext()) {
            Contact admn1 = itadm.next();
            if (aftrnam.equals(admn1.getName())) ;
            System.out.println("name is " + admn1.getName() + " \n after-name " + admn1.aftername + "\n city" + admn1.getCity() +
                    " \n number-phone " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcod " + admn1.getZipcode()
                    + " \n aprtnumber " + admn1.getAptnumber());
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("after-name isnt exist");
        }
        menuofchosse.searchMeue();

    }

    public static void searchBystreat() {
        System.out.println("plais enter after-name search");
        System.out.println("..............................");
        String aftrnam = scanner.next();
        int flag = 1;
        Iterator<Contact> itadm = list.iterator();
        while (itadm.hasNext()) {
            Contact admn1 = itadm.next();
            if (aftrnam.equals(admn1.getStreet())) ;
            System.out.println("name is " + admn1.getName() + " \n after-name " + admn1.aftername + "\n city" + admn1.getCity() +
                    " \n number-phone " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                    + " \n aprtnumber " + admn1.getAptnumber());
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("name isn't exist");
        }
        menuofchosse.searchMeue();
    }

    public static void searchBynumberPhone() {
        System.out.println("plaes enter number-phone search");
        System.out.println("..............................");
        int numberphone = scanner.nextInt();
        int flag = 1;
        Iterator<Contact> itadm = list.iterator();
        while (itadm.hasNext()) {
            Contact admn1 = itadm.next();
            if (numberphone == (admn1.getNumberphone())) ;
            System.out.println("name is " + admn1.getName() + " \n after-name " + admn1.aftername + "\n city" + admn1.getCity() +
                    " \n number-phone " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                    + " \n aprtnumber " + admn1.getAptnumber());
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("name isn't exist");
        }
        menuofchosse.searchMeue();

    }

    public static void showall() {

        Iterator<Contact> itadm = list.iterator();
        for (Iterator<Contact> it = itadm; it.hasNext(); ) {
            Contact admin1 = it.next();
            System.out.println(admin1);



        }
       menuofchosse.menu();
    }


    public static void updtcontact() {
        while (true) {
            int opd = scanner.nextInt();
            if (opd==1||opd==2||opd==3||opd==4||opd==5) {
                switch (opd) {
                    case 1 -> nameUpdatera();
                    case 2 -> cityUpdatera();
                    case 3 -> numberPhoneUppdater();
                    case 4 -> afterNameUpdatera();
                    case 5 -> menuofchosse.menu();
                }
            }else {
                System.out.println("plese chose 1 to 5 ");
            }
        }
    }

    public static void nameUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()){
            System.out.println("list is empty");
        }else {
            System.out.println("enter id of manger");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                System.out.println("pleas enter name do you want updater");
                String nameupd = scanner.nextLine();
                System.out.println("entr new name");
                String newname = scanner.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (nameupd.equals(admin1.getName())) {
                        admin1.setName(newname);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your name isn't exist");
                }
            } else {
                System.out.println(" :( you are not manger :( ");
            }
        }
        menuofchosse.updatera();
    }

    public static void cityUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()){
            System.out.println("list is Empty");
        }else {
            System.out.println("enter id manger");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                System.out.println("pleas enter city do you want updater");
                String cityupd = scanner.nextLine();
                System.out.println("entr new name");
                String newcity = scanner.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (cityupd.equals(admin1.getCity())) {
                        admin1.setCity(newcity);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your city isn't exist");
                }
            } else {
                System.out.println(" :( you are not manger :(");
            }
        }
        menuofchosse.updatera();

    }

    public static void numberPhoneUppdater() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()){
            System.out.println("list is empty");
        }else {
            System.out.println("enter id manger");
            int id=scanner.nextInt();
            if (Operation.check_manager(id)) {
                System.out.println("pleas enter number phone do you want updater");
                int numberphoneupd = scanner.nextInt();
                System.out.println("entr new name");
                int newnumberphon = scanner.nextInt();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (numberphoneupd == (admin1.getNumberphone())) {
                        admin1.setNumberphone(newnumberphon);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your number phone isn't exist");
                }
            }else {
                System.out.println(" :( you are not manger :(");
            }
        }
        menuofchosse.updatera();

    }

    public static void afterNameUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()){
            System.out.println("list is empty");
        }else {
            System.out.println("enter id manger");
            int id=scanner.nextInt();
            if (Operation.check_manager(id)) {
                System.out.println("pleas enter after-name do you want updater");
                String aftrnameupd = scanner.nextLine();
                System.out.println(" entr new name");
                String newaftrname = scanner.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (aftrnameupd.equals(admin1.getAftername())) {
                        admin1.setAftername(newaftrname);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your after-name isn't exist");
                }
            }else {
                System.out.println(" :( you are not manger :( ");
            }
        }
        menuofchosse.updatera();

    }

    public static void deletMenu() {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            int del = scanner.nextInt();
            if(del==1||del==2||del==3||del==4) {
                switch (del) {
                    case 1:
                        showall();
                        break;
                    case 2:
                        deltedContact();
                        break;
                    case 3:
                        deletedAll();
                        break;
                    case 4:
                        menuofchosse.menu();
                        break;

                }
            }else {
                System.out.println("pleas chose number 1 to 4");
            }
        }
    }

    public static void deltedContact() {
        if (list.isEmpty()) {
            System.out.println("<<<list is Empty>>>");
        }else {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter id of manger");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {

                Scanner scanner1 = new Scanner(System.in);
                System.out.println("entr name contact do you want delete");
                System.out.println(".....................................");
                String name = scanner1.nextLine();
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (name.equals(admin1.getName())) {
                        itadm.remove();
                        System.out.println(" :) deleted is successful :)");
                    } else {
                        System.out.println("this name isn't exist");
                    }
                }


            } else {
                System.out.println(" :( you are not manger :(");
            }
        }
        menuofchosse.deletcontact();

    }
    public static void deletedAll(){
       // Scanner scanner=new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("<<<list is empty >>>");

        }else {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("enter your id ");
        int id =scanner1.nextInt();
        if (Operation.check_manager(id)) {
            list.removeAll(list);
            System.out.println("is empty");
        }else { System.out.println(" :( you are not manger :(");}
        }
        menuofchosse.deletcontact();
    }
    public static void addaAdminster(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter name of administer");
         String namadmins=scanner.nextLine();
        System.out.println("enter name of administer");
        String aftrdmins=scanner.nextLine();
        System.out.println("enter name of number phone");
        int phondmins=scanner.nextInt();
        System.out.println("enter name of id");
        int id=scanner.nextInt();
        System.out.println("enter type of usera");
        System.out.print("is vistor a manager ?  (1:yes) , (2:no)? ");
        int x = scanner.nextInt();
        String type;
        if (x == 1) {
            type = "Manager";
        } else {
            type= null;
        }
         Adminstratore admin= new Adminstratore(namadmins,aftrdmins,phondmins,type,id);
         list1.add(admin);

    }
    public static boolean check_manager(int id){

        boolean stat=false;
        for (int i = 0; i < list1.size(); i++) {
            if(id==list1.get(i).getId()){
                if (list1.get(i).isManager()){
                    stat=true;
                }
            }
        }
        return stat;
    }
    public static void listaOfadminster(){
        if (list1.isEmpty()){
            System.out.println("list of manger is empty");

        }else {
            for (Adminstratore ad : list1
            ) {
                System.out.println(ad);
            }
        }

        }
    public static void listaOfvistore(){
        if (list2.isEmpty()){
            System.out.println("list of visitor is empty");
        }else {
            for (Adminstratore ad : list1
            ) {
                System.out.println(ad);
            }
        }

    }
        public static void addVistore(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter name of visitor");
            String namadmins1=scanner.nextLine();
            System.out.println("enter name of administer");
            String aftrdmins1=scanner.nextLine();
            System.out.println("enter name of number phone");
            int phondmins1=scanner.nextInt();

            Vistore vist= new Vistore(namadmins1,aftrdmins1,phondmins1);
            list2.add(vist);
            System.out.println("add visitor is suffuse");
        }

    }
