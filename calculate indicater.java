import org.ta4j.core.BarSeries;
import org.ta4j.core.indicators.RSIIndicator;
import org.ta4j.core.indicators.MACDIndicator;
import org.ta4j.core.indicators.BollingerBandsIndicator;
import org.ta4j.core.indicators.SimpleMovingAverageIndicator;

import java.util.ArrayList;
import java.util.List;

public class TechnicalIndicators {
    public static void main(String[] args) {
        BarSeries series = new BarSeries("Example Stock");
        List<Double> closes = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            closes.add((double) (i * 2 + Math.random() * 10));
        }

        series.setClosePriceSeries(closes);

        RSIIndicator rsi = new RSIIndicator(series, 14);
        MACDIndicator macd = new MACDIndicator(series, 12, 26, 9);
        BollingerBandsIndicator bollingerBands = new BollingerBandsIndicator(series, 20);
        SimpleMovingAverageIndicator sma = new SimpleMovingAverageIndicator(series, 50);

        for (int i = 0; i < series.getEndIndex(); i++) {
            System.out.println("Index: " + i +
                    ", RSI: " + rsi.getValue(i) +
                    ", MACD: " + macd.getValue(i) +
                    ", Bollinger Bands: " + bollingerBands.getUpperBandValue(i) + ", " +
                    bollingerBands.getLowerBandValue(i) +
                    ", SMA: " + sma.getValue(i));
        }
    }
}