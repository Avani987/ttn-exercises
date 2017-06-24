public class Q10 {
    enum House{
        house1(12000),house2(14000),house3(16000);
        private int price;
        House(int p){
            price=p;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        System.out.println("Price of houses: ");
        for(House h:House.values()){
            System.out.println(h+" costs "+h.getPrice());
        }
    }
}
