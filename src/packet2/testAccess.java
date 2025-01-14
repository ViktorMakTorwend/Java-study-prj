package src.packet2;

public class testAccess {
    public  static  void main(String[] args) {
        AccessLevels obj = new AccessLevels();

        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
    }
}
