package designPattern_Pactory;

public class RunDemo {

     public static void main(String[] args) {
          PhoneFactory phoneFactory = new PhoneFactory();
          PhoneInterface phone = phoneFactory.getPhone(PhoneType.SAMSUNG);
          phone.showInfo();
     }
}
