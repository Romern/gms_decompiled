package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: yxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxu {

    /* renamed from: a */
    public static final double f54790a;

    /* renamed from: b */
    public static final double f54791b;

    /* renamed from: c */
    public static final double f54792c;

    /* renamed from: d */
    public static final Set f54793d = Collections.unmodifiableSet(new HashSet(Arrays.asList("altitude", "duration", "food_item", "meal_type", "repetitions", "resistance", "resistance_type")));

    /* renamed from: g */
    public static final yxu f54794g = new yxu();

    /* renamed from: h */
    private static final double f54795h;

    /* renamed from: e */
    public final Map f54796e;

    /* renamed from: f */
    public final Map f54797f;

    static {
        double nanos = (double) TimeUnit.SECONDS.toNanos(1);
        Double.isNaN(nanos);
        f54790a = 10.0d / nanos;
        double nanos2 = (double) TimeUnit.SECONDS.toNanos(1);
        Double.isNaN(nanos2);
        f54795h = 1000.0d / nanos2;
        double nanos3 = (double) TimeUnit.HOURS.toNanos(1);
        Double.isNaN(nanos3);
        f54791b = 2000.0d / nanos3;
        double nanos4 = (double) TimeUnit.SECONDS.toNanos(1);
        Double.isNaN(nanos4);
        f54792c = 100.0d / nanos4;
    }

    private yxu() {
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", new yxt(-90.0d, 90.0d));
        hashMap.put("longitude", new yxt(-180.0d, 180.0d));
        hashMap.put("accuracy", new yxt(0.0d, 10000.0d));
        hashMap.put("bpm", new yxt(0.0d, 1000.0d));
        hashMap.put("altitude", new yxt(-100000.0d, 100000.0d));
        hashMap.put("percentage", new yxt(0.0d, 100.0d));
        hashMap.put("confidence", new yxt(0.0d, 100.0d));
        hashMap.put("duration", new yxt(0.0d, 9.223372036854776E18d));
        hashMap.put("height", new yxt(0.0d, 3.0d));
        hashMap.put("weight", new yxt(0.0d, 1000.0d));
        hashMap.put("speed", new yxt(0.0d, 11000.0d));
        this.f54797f = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("com.google.step_count.delta", m44959a("steps", new yxt(0.0d, f54790a)));
        hashMap2.put("com.google.calories.consumed", m44959a("calories", new yxt(0.0d, f54795h)));
        hashMap2.put("com.google.calories.expended", m44959a("calories", new yxt(0.0d, f54791b)));
        hashMap2.put("com.google.distance.delta", m44959a("distance", new yxt(0.0d, f54792c)));
        this.f54796e = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static Map m44959a(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put(obj, obj2);
        return hashMap;
    }
}
