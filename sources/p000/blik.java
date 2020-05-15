package p000;

/* renamed from: blik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blik extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blik f126620d;

    /* renamed from: e */
    private static volatile bxxk f126621e;

    /* renamed from: a */
    public int f126622a;

    /* renamed from: b */
    public long f126623b;

    /* renamed from: c */
    public int f126624c;

    static {
        blik blik = new blik();
        f126620d = blik;
        GeneratedMessageLite.m124024a(blik.class, blik);
    }

    private blik() {
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
            return GeneratedMessageLite.m124022a(f126620d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blik();
        } else {
            if (i2 == 4) {
                return new bxvd(f126620d);
            }
            if (i2 == 5) {
                return f126620d;
            }
            bxxk bxxk = f126621e;
            if (bxxk == null) {
                synchronized (blik.class) {
                    bxxk = f126621e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126620d);
                        f126621e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
