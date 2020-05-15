package p000;

/* renamed from: abun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abun extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abun f58432c;

    /* renamed from: e */
    private static volatile bxxk f58433e;

    /* renamed from: a */
    public bxwc f58434a = bxxn.f165040b;

    /* renamed from: b */
    public abtn f58435b;

    /* renamed from: d */
    private int f58436d;

    static {
        abun abun = new abun();
        f58432c = abun;
        GeneratedMessageLite.m124024a(abun.class, abun);
    }

    private abun() {
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
            return GeneratedMessageLite.m124022a(f58432c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0000", new Object[]{"d", "a", abum.class, "b"});
        } else if (i2 == 3) {
            return new abun();
        } else {
            if (i2 == 4) {
                return new bxvd(f58432c);
            }
            if (i2 == 5) {
                return f58432c;
            }
            bxxk bxxk = f58433e;
            if (bxxk == null) {
                synchronized (abun.class) {
                    bxxk = f58433e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58432c);
                        f58433e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
