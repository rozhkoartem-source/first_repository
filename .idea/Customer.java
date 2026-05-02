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
    private String orderCategory;

    public Customer(String orderName, String orderLocation, int orderDateSend,
                    int orderId, boolean orderRecieved, boolean orderSended,
                    boolean orderCanceled,
                    double orderCost, String orderCanceledReason, String orderCategory)
                    throws Exception {
    }

    public int getOrderId() {
        return orderId;
        //возвращаем айди заказа
    }

    public int void OrderDateSendMethod() {
        Customer(orderDateSend);
        //вызов метода тела
    }

    public String getOrderName() {
        return orderName;
        //возвращаем "имя" заказа
    }

    public void setOrderStatus() {
        if (orderCanceled) {
            //определаяемое статус заказа
            orderSended = true;
        }
    }

    private void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
    } // задаємо захищене значення категорії товару
    //також схожа ситуація і з айди товару, воно може бути
    //Визначальним значенням у пошуку товару на маркетплейсі у зв'язку з пошуком по айді товару


    protected void setOrderId(int orderId) {
        this.orderId = orderId;
        //задаємо захищений значення айді замовлення
        //так як зазвичай його використовують для пошуку товарів у маркетплейсі у випадках коли
        //ім'я не відповідає дійсності (якщо посередник змінив його)
        // Його можна використовувати для подання скарги або на повернення конкретного товару використовуючи
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












