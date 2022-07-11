public class movieticket {
    int totalseats =10;

    synchronized void bookseat(int seats)     // 6,7 
    {
        if(totalseats >=seats)   // 10>n = 6,7
        {
            System.out.println(seats + "seats book succesfully");
            totalseats = totalseats - seats;          //10-5=5 seats left
            System.out.println("seats left" + totalseats); 
        }
        else
        {
            System.out.println("seats cannot be booked");
            System.out.println("seats left"+ totalseats);
        }
    }
}
    class moviebookapp extends Thread
    {
        static movieticket b;
        int seats;

        public void run()
        {
            b.bookseat(seats);     // thread 6,7
        }
        public static void main (String [] args)
        {
            b =new movieticket();
            moviebookapp reetesh = new moviebookapp();
            reetesh.seats = 7;
            reetesh.start();

            moviebookapp ayushi = new moviebookapp();
            ayushi.seats = 6;
            ayushi.start();
        }
    }

