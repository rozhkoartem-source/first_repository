void main (String[] args) {}
public class Customer {

    private String orderName;
    private String orderLocation;
    private int orderDateSend;
    private int orderId;
    private double orderCost;
    private boolean orderRecieved;
    private boolean orderSended;
    private boolean orderCanceled;
    private String orderCanceledReason;

    public Customer(String orderName, String orderLocation, int orderDateSend,
                    int orderId, boolean orderRecieved, boolean orderSended,
                    boolean orderCanceled,
                    double orderCost, String orderCanceledReason) throws Exception {
    }

    public int getOrderId() {
        return orderId;
    }

    public int getOrderDateSend() {
        return orderDateSend;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderStatus() {
        if (orderCanceled) {
            orderSended = true;
        }
    }

    protected void setOrderId(int orderId) {
        this.orderId = orderId;
    }

//    public void OrderCommisison() {} //метод OrderCommisison позволяет заказать сам заказ
//
//    public void wthOrderStatus() {
//        if (orderRecieved) { //проверка на доставку заказа к покупателю
//            //хз что ставить
//        } else {
//            orderCanceled = true;
//            //если нет, то ставится галочка в буле orderCanceled
//        }
//
//        if (orderCanceled) { //проверка на отмену (от покупателя, тех. причины или типо того
//            orderCanceledReason = "причина";
//            // будет указана причина отмены в orderCanceledReason
//        } else {
//            //ничего не трогаем
//        }
//
//    }
}












