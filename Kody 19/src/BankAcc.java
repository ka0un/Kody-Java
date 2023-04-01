import javax.swing.plaf.PanelUI;
import java.security.PublicKey;

public record BankAcc(String owner, double balance) {

    public void report(){
        System.out.println("Owner : " + this.owner() + "Balance : " + this.balance());
    }
    public BankAcc{
        if (balance < 0){
            throw new IllegalArgumentException();
        }
    }

}
