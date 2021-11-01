package io.github.nimbo1999.utils;

import java.time.Instant;
import java.time.ZoneId;

public class InstantUtils {
    public static ZoneId ZONE_ID = ZoneId.of("America/Sao_Paulo");

    public static Instant intantNow() {
        return Instant
            .now()
            .atZone(ZONE_ID)
            .toInstant();
    }

}
