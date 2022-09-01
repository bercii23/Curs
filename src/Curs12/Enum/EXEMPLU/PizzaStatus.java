package Curs12.Enum.EXEMPLU;

public enum PizzaStatus {

    ORDER(40){
        @Override
        public boolean isDelivered() {
            return false;
        }
    },
    READY(20){
        @Override
        public boolean isDelivered() {
            return false;
        }
    },
    DELIVERED(0){
        @Override
        public boolean isDelivered() {
            return true;
        }
    };

    int timeToDeliver;

    PizzaStatus(int timeToDeliver) {
        this.timeToDeliver = timeToDeliver;
    }

    public abstract boolean isDelivered();

    public int getTimeToDeliver() {
        return timeToDeliver;
    }
}
