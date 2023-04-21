package products;

import products.models.Product;
import products.models.base.*;

public class Program {
    public static void main(String[] args) {
        Product[] products = {new Bread("Бородинский",32.50,2, "шт.",4.23,"ржаной"),
                new Milk("Простоквашино",59.60,2,"бутылки",0.9,1,04.23),
                new Lemonade("Тетя Груша",29.50,1,"бутылка",1.5),
                new Eggs("Крестьянские",96.50,10, "шт", 05.23),
                new Diapers("Huggies",325.0,30,"шт", 2,"гипоаллергенные",0,10),
                new Masks("медицинские",59.5,1,"упаковка",50),
                new ToiletPaper("Zewa",168.35,1,"упаковка",4,3),
                new Nipple("Ромашка",200.0,1,"шт",0,"гипоаллергенная")};
        for (Product product :products) {
            getInfo(product);
        }
    }
    public static void getInfo(Product product){
        System.out.println(product.toString());
    }
}
