package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public static double convert(int value, ConversionType conversionType) {
        return conversionType.convert(value);

    }
}
