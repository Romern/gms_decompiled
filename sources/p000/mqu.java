package p000;

/* renamed from: mqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mqu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mqu f34353d;

    /* renamed from: e */
    private static volatile bxxk f34354e;

    /* renamed from: a */
    public int f34355a;

    /* renamed from: b */
    public boolean f34356b;

    /* renamed from: c */
    public boolean f34357c;

    static {
        mqu mqu = new mqu();
        f34353d = mqu;
        GeneratedMessageLite.m124024a(mqu.class, mqu);
    }

    private mqu() {
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
            return GeneratedMessageLite.m124022a(f34353d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f34353d);
            }
            if (i2 == 5) {
                return f34353d;
            }
            bxxk bxxk = f34354e;
            if (bxxk == null) {
                synchronized (mqu.class) {
                    bxxk = f34354e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34353d);
                        f34354e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
