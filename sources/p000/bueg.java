package p000;

/* renamed from: bueg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bueg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bueg f153582a;

    /* renamed from: b */
    private static volatile bxxk f153583b;

    static {
        bueg bueg = new bueg();
        f153582a = bueg;
        GeneratedMessageLite.m124024a(bueg.class, bueg);
    }

    private bueg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f153582a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bueg();
        }
        if (i2 == 4) {
            return new bxvd(f153582a);
        }
        if (i2 == 5) {
            return f153582a;
        }
        bxxk bxxk = f153583b;
        if (bxxk == null) {
            synchronized (bueg.class) {
                bxxk = f153583b;
                if (bxxk == null) {
                    bxxk = new bxve(f153582a);
                    f153583b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
