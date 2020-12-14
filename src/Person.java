import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable {
    String name;
    String sdt, cmnd;
    Address address;
    transient Scanner sc = new Scanner(System.in);

    public Person() {
        name = null;
        sdt = null;
        cmnd = null;
        address = new Address();
    }

    public Person(String name, String sdt, String cmnd, String so_nha, String duong, String phuong, String quan,
            String tinh) {
        this.name = name;
        this.sdt = sdt;
        this.cmnd = cmnd;
        address = new Address(so_nha, duong, phuong, quan, tinh);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setName() {
        System.out.print("Ho ten : ");
        this.name = sc.nextLine();
    }

    public void setSdt() {
        while (true) {
            System.out.print("sdt : ");
            String input = sc.nextLine();
            double inputValue = 0;
            try {
                inputValue = Double.parseDouble(input);
                this.sdt = Double.toString(inputValue);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ban nhap sai cu phap xin moi ban nhap lai!");
            }
        }
    }

    public void setCmnd() {
        while (true) {
            System.out.print("Cmnd : ");
            String input = sc.nextLine();
            double inputValue = 0;
            try {
                inputValue = Double.parseDouble(input);
                this.sdt = Double.toString(inputValue);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ban nhap sai cu phap xin moi ban nhap lai!");
            }
        }
    }

    public void setDiachi() {
        address.nhap_thontin();
    }

    public void nhap_thontin() {
        System.out.println("Moi ban nhap thong tin : ");
        setName();
        setSdt();
        setCmnd();
        setDiachi();
    }

    public void xuatthongtin() {
        System.out.printf("%-25s%-20s%-20s%-45s\n", name, sdt, cmnd, address);
    }
}
