public class Main {
    public static void main(String[] args)
    {

        BinomialHeap binHeap = new BinomialHeap();

        // Заполняем кучу
        binHeap.insert(12);
        binHeap.insert(8);
        binHeap.insert(5);
        binHeap.insert(15);
        binHeap.insert(7);
        binHeap.insert(2);
        binHeap.insert(9);

        // Размер биномиальной кучи
        System.out.println("Размер биномиальной кучи: "
                + binHeap.getSize());

        // Печатаем кучу
        binHeap.displayHeap();


        // Пробуем что-то удалить
        binHeap.delete(15);
        binHeap.delete(8);

        // Опять размер кучи
        System.out.println("Size of the binomial heap is "
                + binHeap.getSize());

        // Печатаем кучу еще раз
        binHeap.displayHeap();

        // Чистим кучу
        binHeap.makeEmpty();

        // Проверяем, очистилась ли куча
        System.out.println(binHeap.isEmpty());
    }
}