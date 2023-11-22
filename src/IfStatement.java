public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSent = 3;

        if (isBluetoothEnabled) {
            //Send file
            fileSent++;
            System.out.println("Archivo enviado");
            int i = 0;
            i++;
        } else {
            fileSent--;
            System.out.println("Por favor, enciende tu Bluethooth para inciar transferencia");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSent);
    }
}
