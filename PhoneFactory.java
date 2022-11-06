package designPattern_Pactory;

public class PhoneFactory {
     public PhoneInterface getPhone(PhoneType phoneType) {
          PhoneInterface phoneCreated = null;
          switch (phoneType) {
               case SAMSUNG:
                    phoneCreated = new SamsungPhone();
                    break;
               case APPLE:
                    phoneCreated = new ApplePhone();
                    break;
               case NOKIA:
                    phoneCreated = new NokiaPhone();
                    break;
          }
          return phoneCreated;
     }
}
