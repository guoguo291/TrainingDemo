package com.landi.trainingdemo.pattern.factory;

/**
 * 工厂模式（Factory Pattern）属于创建型模式，它提供了一种创建对象的最佳方式。
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 * 优点： 1、一个调用者想创建一个对象，只要知道其名称就可以了。
 *        2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 *        3、屏蔽产品的具体实现，调用者只关心产品的接口。
 * 缺点：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，
 *      在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 * 注意事项：作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。
 *          有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成
 *          创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 * Created by guoj on 2019/8/23.
 */

public class FactoryPatternTest {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
