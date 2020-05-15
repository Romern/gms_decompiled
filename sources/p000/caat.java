package p000;

/* renamed from: caat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caat extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final caat f172373c;

    /* renamed from: e */
    private static volatile bxxk f172374e;

    /* renamed from: a */
    public caas f172375a;

    /* renamed from: b */
    public caas f172376b;

    /* renamed from: d */
    private int f172377d;

    static {
        caat caat = new caat();
        f172373c = caat;
        GeneratedMessageLite.m124024a(caat.class, caat);
    }

    private caat() {
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
            return GeneratedMessageLite.m124022a(f172373c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new caat();
        } else {
            if (i2 == 4) {
                return new bxvd(f172373c);
            }
            if (i2 == 5) {
                return f172373c;
            }
            bxxk bxxk = f172374e;
            if (bxxk == null) {
                synchronized (caat.class) {
                    bxxk = f172374e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172373c);
                        f172374e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
