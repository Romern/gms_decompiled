package p000;

import java.util.Comparator;

/* renamed from: bqcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcv {

    /* renamed from: a */
    static final String f140490a;

    /* renamed from: b */
    public static final Comparator f140491b;

    static {
        Comparator comparator;
        String concat = String.valueOf(bqcv.class.getName()).concat("$UnsafeComparator");
        f140490a = concat;
        try {
            comparator = (Comparator) Class.forName(concat).getEnumConstants()[0];
        } catch (Throwable th) {
            comparator = bqcu.INSTANCE;
        }
        f140491b = comparator;
    }

    bqcv() {
    }
}
