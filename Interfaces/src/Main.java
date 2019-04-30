public class Main {
    public static void main(String[] args) {
        ITelephone petarPhone;
        petarPhone = new DeskPhone(3567, true);
        petarPhone.powerOn();
        petarPhone.callPhone(3567);
        petarPhone.answer();

        petarPhone = new MobilePhone(123);
        petarPhone.powerOn();
        petarPhone.callPhone(123);
        petarPhone.answer();
    }
}
