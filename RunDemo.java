package designPattern_Pactory;

public class RunDemo {

     public static void main(String[] args) {
          PhoneFactory phoneFactory = new PhoneFactory();
          PhoneInterface phone1 = phoneFactory.getPhone(PhoneType.SAMSUNG);
          PhoneInterface phone2 = phoneFactory.getPhone(PhoneType.NOKIA);
          PhoneInterface phone3 = phoneFactory.getPhone(PhoneType.APPLE);
          phone1.showInfo();
          phone2.showInfo();
          phone3.showInfo();
     }
}
