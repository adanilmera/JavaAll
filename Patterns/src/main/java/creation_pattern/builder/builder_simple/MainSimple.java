package creation_pattern.builder.builder_simple;

/**
 * <b>Пример:</b> Пошаговое производство автомобилей
 * В этом примере Строитель позволяет пошагово конструировать различные конфигурации автомобилей.
 *
 * Кроме того, здесь показано как с помощью Строителя может создавать другой продукт
 * на основе тех же шагов строительства. Для этого мы имеем два конкретных строителя
 * — CarBuilder и CarManualBuilder.
 *
 * Порядок строительства продуктов заключён в Директоре. Он знает какие шаги
 * строителей нужно вызвать, чтобы получить ту или иную конфигурацию продукта.
 * Он работает со строителями только через общий интерфейс, что позволяет взаимозаменять
 * объекты строителей для получения разных продуктов.
 */

public class MainSimple {

    public static void main(String[] args) {

    }

}
