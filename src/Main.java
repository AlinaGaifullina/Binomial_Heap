public class Main {
    public static void main(String[] args)
    {

        BinomialHeap binHeap = new BinomialHeap();
        BinomialHeap binHeap2 = new BinomialHeap();

        // Заполняем кучи
        binHeap.insert(1);
        binHeap.insert(2);
        binHeap.insert(3);
        binHeap.insert(4);
        binHeap.insert(5);
        binHeap.insert(6);
        binHeap.insert(7);

        binHeap2.insert(49);
        binHeap2.insert(48);
        binHeap2.insert(47);
        // Размер биномиальной кучи
        System.out.println("Размер биномиальной кучи: "
                + binHeap.getSize());

        // Печатаем кучу
        binHeap.displayHeap();

        // Пробуем что-то удалить
        binHeap.delete(6);
        binHeap.delete(7);

        // Опять размер кучи
        System.out.println("Size of the binomial heap is "
                + binHeap.getSize());

        // Печатаем кучу еще раз
        binHeap.displayHeap();

        //Пробуем объединить кучи
        binHeap2.merge(binHeap.Nodes);
        //Печатаем
        binHeap2.displayHeap();

        // Чистим кучу
        binHeap.makeEmpty();

        // Проверяем, очистилась ли куча
        System.out.println(binHeap.isEmpty());
    }
}