package wooteco.subway.path.domain.fare;

import org.springframework.stereotype.Component;

@Component
public class FarePolicyFinder {
    public static final int BASIC_FARE = 1250;
    public static final int OVER_FARE = 2050;
    public static final double FARE_PER_KM = 100;
    public static final int FIRST_OVER_FARE_DISTANCE = 10;
    public static final int SECOND_OVER_FARE_DISTANCE = 50;

    public FarePolicy findFarePrincipal(Integer age) {
        if (age == null) {
            return new NoneLoginFarePolicy();
        }

        if (age < 6) {
            return new ToddlerFarePolicy();
        }

        if (age < 13) {
            return new KidFarePolicy();
        }

        if (age < 19) {
            return new TeenagerFarePolicy();
        }

        return new AdultFarePolicy();
    }
}