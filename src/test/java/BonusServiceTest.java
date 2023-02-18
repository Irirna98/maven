import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        System.out.println(actual + "зарегистрированная сумма");

        // производим проверку (сравниваем ожидаемый и фактический):
        service.equals("expected, actual");
        System.out.println(service.equals + "сравнение ожидаемый и фактический результат");
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        System.out.println(actual + "зарегистрированная сумма");

        // производим проверку (сравниваем ожидаемый и фактический):
        service.equals("expected,actual");
        System.out.println(service.equals + "сравнение фактического и ожидаемого результата" );
    }
}
