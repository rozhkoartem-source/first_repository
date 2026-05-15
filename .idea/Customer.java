public class Customer {

    private String orderName;
    private String orderLocation;
    private int orderDateSend;
    private int orderId;
    private double orderCost;
    private boolean orderRecieved;
    private boolean orderSended;
    private boolean orderInTransit;
    private boolean orderCanceled;
    private String orderCanceledReason;
    private String orderCategory;

    public Customer(String orderName, String orderLocation, int orderDateSend,
                    int orderId, boolean orderRecieved, boolean orderSended,
                    boolean orderCanceled, boolean orderInTransit,
                    double orderCost, String orderCanceledReason, String orderCategory)
                    throws Exception {
    }
    public Customer() {} //конструктор без параметрів

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

    public void setOrderStatus(boolean canceled) {
        //визначаємо статус замовлення
        this.orderCanceled = canceled;
        if (!orderCanceled) {
            this.orderInTransit = true;
            System.out.println("Статус: ОК");
            return orderDateSend;
            //Якщо замовлення не скасовано (false), то статус "в дорозі" буде true
        } else {
            this.orderInTransit = false;
            System.out.println("Статус: Скасовано");
            return orderId;
            return orderCategory;
            return orderName;
            //Якщо замовлення скасовано (true), то статус "в дорозі" буде false, незалежно від статусу orderSended.
        }
    }

    private void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
        // задаємо захищене значення категорії товару
        //також схожа ситуація і з айди товару, воно може бути
        //Визначальним значенням у пошуку товару на маркетплейсі у зв'язку з пошуком по айді товару
    }

    protected void setOrderId(int orderId) {
        this.orderId = orderId;
        //задаємо захищений значення айді замовлення
        //так як зазвичай його використовують для пошуку товарів у маркетплейсі у випадках коли
        //ім'я не відповідає дійсності (якщо посередник змінив його)
        // Його можна використовувати для подання скарги або на повернення конкретного товару використовуючи
    }
}

//void main (String[] args) {
//    Customer methodCallCustomer = new Customer();
//    Customer methodCallsetOrderStatus = new Customer();
//    Customer methodCallsetOrderId = new Customer();
//    methodCallCustomer.setOrderStatus(false); //Перевірка статусу замовлення
//}










