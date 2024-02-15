package OOP.DaHinh_Polymorphism;

public class NhanVien {
    public void tinhLuong() {
        System.out.println("Tinh luong cho nhan vien...");
    }
}

class NhanVienChinhThuc extends NhanVien {
    @Override
    public void tinhLuong() {
        System.out.println("Tinh luong cho nhan vien chinh thuc");
    }
}

class ThucTapSinh extends NhanVien {
    @Override
    public void tinhLuong() {
        System.out.println("Thanh toan tien ho tro cho thuc tap sinh");
    }
}


