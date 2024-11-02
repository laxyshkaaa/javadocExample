/**
 * Класс продукции со свойствами <b>maker</b> и <b>price</b>.
 * @author PAVEL
 * @version 2.1
 */
public class Product {
    /** Поле производитель */
    private String maker;

    /** Поле цена */
    public double price;

    /**
     * Конструктор - создание нового объекта без параметров.
     */
    Product() {
        setMaker("");
        price = 0;
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями.
     * @param maker производитель
     * @param price цена
     */
    Product(String maker, double price) {
        this.setMaker(maker);
        this.price = price;
    }

    /**
     * Функция получения значения поля maker.
     * @return возвращает название производителя
     */
    public String getMaker() {
        return maker;
    }

    /**
     * Процедура определения производителя.
     * @param maker производитель
     */
    public void setMaker(String maker) {
        this.maker = maker;
    }


}
class Main{
    /**
     * Основной метод программы, создающий объект Product и выводящий его свойства.
     * @param args аргументы командной строки
     */

    public static void main(String[] args) {
        // Создаем новый объект Product
        Product product = new Product("Samsung", 499.99);

        // Выводим информацию о продукте
        System.out.println("Производитель: " + product.getMaker());
        System.out.println("Цена: " + product.price);

        // Пример вызова метода, находящегося вне класса
        displayProductInfo(product);
    }

    /**
     * Метод для отображения информации о продукте.
     * @param product объект класса Product, информацию о котором нужно отобразить
     */
    public static void displayProductInfo(Product product) {
        System.out.println("Информация о продукте:");
        System.out.println("Производитель: " + product.getMaker());
        System.out.println("Цена: " + product.price);
    }
}
/**
 * Класс продукции со свойствами <b>maker</b> и <b>price</b>.
 * @author PAVEL
 * @version 2.1
 */
 class ProductUtils {

    /**
     * Метод для отображения информации о продукте.
     * @param product объект класса Product, информацию о котором нужно отобразить
     */
    public static void displayProductInfo(Product product) {
        System.out.println("Информация о продукте:");
        System.out.println("Производитель: " + product.getMaker());
        System.out.println("Цена: " + product.price);
    }
}


