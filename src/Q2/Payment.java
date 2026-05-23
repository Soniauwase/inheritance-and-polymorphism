package Q2;

abstract class Payment {
    public  abstract int  calculateBonus();
    }
    class Developer extends Payment{
    private String name;

        @Override
        public int  calculateBonus() {
         return  0;
        }
    }
    class  Manager extends Payment{

        @Override
        public int calculateBonus() {
            return 0;
        }
    }
    

