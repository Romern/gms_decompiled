package p000;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: aebh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aebh {
    EVERY_3_HOURS(TimeUnit.HOURS.toSeconds(3)),
    EVERY_4_HOURS(TimeUnit.HOURS.toSeconds(4)),
    EVERY_6_HOURS(TimeUnit.HOURS.toSeconds(6)),
    EVERY_9_HOURS(TimeUnit.HOURS.toSeconds(9)),
    EVERY_12_HOURS(TimeUnit.HOURS.toSeconds(12)),
    EVERY_15_HOURS(TimeUnit.HOURS.toSeconds(15)),
    EVERY_20_HOURS(TimeUnit.HOURS.toSeconds(20)),
    EVERY_DAY(TimeUnit.DAYS.toSeconds(1)),
    EVERY_36_HOURS(TimeUnit.HOURS.toSeconds(36)),
    EVERY_2_DAYS(TimeUnit.DAYS.toSeconds(2)),
    EVERY_3_DAYS(TimeUnit.DAYS.toSeconds(3)),
    EVERY_7_DAYS(TimeUnit.DAYS.toSeconds(7)),
    EVERY_14_DAYS(TimeUnit.DAYS.toSeconds(14)),
    EVERY_25_DAYS(TimeUnit.DAYS.toSeconds(25)),
    EVERY_30_DAYS(TimeUnit.DAYS.toSeconds(30)),
    EVERY_100_DAYS(TimeUnit.DAYS.toSeconds(100)),
    EVERY_YEAR(TimeUnit.DAYS.toSeconds(365));
    

    /* renamed from: s */
    private static final TreeMap f63063s = new TreeMap();

    /* renamed from: r */
    public final long f63065r;

    static {
        aebh[] values = values();
        for (aebh aebh : values) {
            f63063s.put(Long.valueOf(aebh.f63065r), aebh);
        }
    }

    private aebh(long j) {
        this.f63065r = j;
    }

    /* renamed from: a */
    public static aebh m51568a(long j) {
        Map.Entry ceilingEntry = f63063s.ceilingEntry(Long.valueOf(j));
        return ceilingEntry != null ? (aebh) ceilingEntry.getValue() : EVERY_YEAR;
    }
}
