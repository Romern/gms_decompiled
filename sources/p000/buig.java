package p000;

/* renamed from: buig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buig extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buig f153934d;

    /* renamed from: e */
    private static volatile bxxk f153935e;

    /* renamed from: a */
    public int f153936a;

    /* renamed from: b */
    public long f153937b;

    /* renamed from: c */
    public long f153938c;

    static {
        buig buig = new buig();
        f153934d = buig;
        GeneratedMessageLite.m124024a(buig.class, buig);
    }

    private buig() {
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
            return GeneratedMessageLite.m124022a(f153934d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buig();
        } else {
            if (i2 == 4) {
                return new bxvd(f153934d);
            }
            if (i2 == 5) {
                return f153934d;
            }
            bxxk bxxk = f153935e;
            if (bxxk == null) {
                synchronized (buig.class) {
                    bxxk = f153935e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153934d);
                        f153935e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
