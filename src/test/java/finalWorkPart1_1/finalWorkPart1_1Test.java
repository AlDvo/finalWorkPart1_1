package finalWorkPart1_1;

import finalWorkPart1_1.pages.MainPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class finalWorkPart1_1Test extends BaseTest {
    MainPage mainPage = new MainPage();

    @ParameterizedTest
    @MethodSource("finalWorkPart1_1.DepositClass#msMP")
    public void finalWorkPart1_1(String currency ,String deposit,String period, String relenish,String calc, String replenish , String value) {

        mainPage.selectMainService("Вклады")
                .selectCurrency(currency)
                .selectDepositAmount(deposit)
                .selectPeriod(period)
                .selectRelenish(relenish)
                .selectCapitalization()
                .checkResultCalc("Начислено %:", calc)
                .checkResultReplenish("Пополнение за ",replenish)
                .checkResultValue("К снятию через ",value)
                .checkMonth("К снятию через ")
                .checkMonth("Пополнение за ");
    }
}
