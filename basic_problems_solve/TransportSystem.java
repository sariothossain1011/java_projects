class Transport {
    public void issueTicket() {
        System.out.println("Issuing a Generic Transport Ticket");
    }
}

class Bus extends Transport {
    @Override
    public void issueTicket() {
        System.out.println("Issuing a Bus Ticket");
    }
}

class Train extends Transport {
    @Override
    public void issueTicket() {
        System.out.println("Issuing a Train Ticket");
    }
}

class Airplane extends Transport {
    @Override
    public void issueTicket() {
        System.out.println("Issuing a Airplane Ticket");
    }
}

public class TransportSystem {

    public static void main(String[] args) {

        Transport[] transport = new Transport[3];
        
        transport[0] = new Bus();
        transport[1] = new Train();
        transport[2] = new Airplane();

        for(Transport t :transport ){
            t.issueTicket();
            System.out.println();
        }



    }

}
