package finalWorkPart1_1;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DepositClass {
    public static Stream<Arguments> msMP() {
        return Stream.of(
                Arguments.of("RUB", "300000","6", "50000","12 243,26","250 000","562 243,26"),
                Arguments.of("USD", "500000","12", "20000", "920,60", "220 000", "720 920,60"),
                Arguments.of("RUB", "40000","3", "5000","478,38","10 000","50 478,38"));
    }
}
