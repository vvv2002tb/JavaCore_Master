package OOP.DaHinh_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Adventure("Star wars");
        theMovie.watchMovie();

        NhanVien anhA = new NhanVienChinhThuc();
        NhanVien anhB = new ThucTapSinh();

        keToan(anhA);
        keToan(anhB);


    }

    public static void keToan(NhanVien nhanVien) {
        nhanVien.tinhLuong();
    }
}
