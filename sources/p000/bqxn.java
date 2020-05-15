package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bqxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqxn {
    NULL(0),
    REFERENCE(1),
    ATTRIBUTE(2),
    STRING(3),
    FLOAT(4),
    DIMENSION(5),
    FRACTION(6),
    DYNAMIC_REFERENCE(7),
    DYNAMIC_ATTRIBUTE(8),
    INT_DEC(16),
    INT_HEX(17),
    INT_BOOLEAN(18),
    INT_COLOR_ARGB8(28),
    INT_COLOR_RGB8(29),
    INT_COLOR_ARGB4(30),
    INT_COLOR_RGB4(31);
    

    /* renamed from: r */
    public static final Map f141904r;

    /* renamed from: q */
    public final byte f141906q;

    static {
        HashMap hashMap = new HashMap();
        bqxn[] values = values();
        for (bqxn bqxn : values) {
            hashMap.put(Byte.valueOf(bqxn.f141906q), bqxn);
        }
        f141904r = Collections.unmodifiableMap(hashMap);
    }

    private bqxn(int i) {
        this.f141906q = bqcw.m112604a((long) i);
    }
}
