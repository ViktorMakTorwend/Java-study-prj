package src.packet1;

import src.packet2.AccessLevels;

public class testAccessOtherPackege extends AccessLevels{
    public  static  void main(String[] args) {
        AccessLevels obj = new AccessLevels();

        System.out.println(obj.publicVar);
    }

    public void testProtect() {
        System.out.println(protectedVar);
    }
}
