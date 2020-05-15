package p000;

/* renamed from: buij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buij extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final buij f153940b;

    /* renamed from: d */
    private static volatile bxxk f153941d;

    /* renamed from: a */
    public int f153942a;

    /* renamed from: c */
    private int f153943c;

    static {
        buij buij = new buij();
        f153940b = buij;
        GeneratedMessageLite.m124024a(buij.class, buij);
    }

    private buij() {
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
            return GeneratedMessageLite.m124022a(f153940b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", buih.f153939a});
        } else if (i2 == 3) {
            return new buij();
        } else {
            if (i2 == 4) {
                return new bxvd(f153940b);
            }
            if (i2 == 5) {
                return f153940b;
            }
            bxxk bxxk = f153941d;
            if (bxxk == null) {
                synchronized (buij.class) {
                    bxxk = f153941d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153940b);
                        f153941d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
