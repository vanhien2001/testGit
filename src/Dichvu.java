import java.util.Scanner;

public class Dichvu {
    String tendichvu;
    int gia,solan;
    boolean booked = false;
    Scanner sc = new Scanner(System.in);

    public Dichvu() {
        tendichvu = null;
        gia = 0;
    }

    public Dichvu(String tendichvu, int gia) {
        this.tendichvu = tendichvu;
        this.gia = gia;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String gettendichvu() {
        return tendichvu;
    }

    public void settendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public void settendichvu() {
        System.out.println("Ten dich vu :");
        this.tendichvu = sc.nextLine();
    }

    public void setGia() {
        System.out.println("Gia :");
        this.gia = sc.nextInt();
    }

    public void nhap_thontin() {
        settendichvu();
        setGia();
    }

    public void xuatthongtin() {
        System.out.printf("%-15s%-14s%d%\n", tendichvu, gia);
    }

}