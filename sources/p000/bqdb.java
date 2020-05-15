package p000;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

/* renamed from: bqdb */
public final /* synthetic */ class bqdb {
    /* renamed from: a */
    public static LocalDate m112614a(ZoneId zoneId) {
        return Instant.now().atZone(zoneId).toLocalDate();
    }
}
