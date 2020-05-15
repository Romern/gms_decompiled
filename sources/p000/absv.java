package p000;

/* renamed from: absv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final absv f58170d;

    /* renamed from: e */
    private static volatile bxxk f58171e;

    /* renamed from: a */
    public int f58172a;

    /* renamed from: b */
    public long f58173b;

    /* renamed from: c */
    public long f58174c;

    static {
        absv absv = new absv();
        f58170d = absv;
        bxvk.m124024a(absv.class, absv);
    }

    private absv() {
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
            return bxvk.m124022a(f58170d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new absv();
        } else {
            if (i2 == 4) {
                return new bxvd(f58170d);
            }
            if (i2 == 5) {
                return f58170d;
            }
            bxxk bxxk = f58171e;
            if (bxxk == null) {
                synchronized (absv.class) {
                    bxxk = f58171e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58170d);
                        f58171e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
