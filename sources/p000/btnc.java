package p000;

/* renamed from: btnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btnc f149591d;

    /* renamed from: e */
    private static volatile bxxk f149592e;

    /* renamed from: a */
    public double f149593a;

    /* renamed from: b */
    public double f149594b;

    /* renamed from: c */
    public float f149595c;

    static {
        btnc btnc = new btnc();
        f149591d = btnc;
        GeneratedMessageLite.m124024a(btnc.class, btnc);
    }

    private btnc() {
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
            return GeneratedMessageLite.m124022a(f149591d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btnc();
        } else {
            if (i2 == 4) {
                return new bxvd(f149591d);
            }
            if (i2 == 5) {
                return f149591d;
            }
            bxxk bxxk = f149592e;
            if (bxxk == null) {
                synchronized (btnc.class) {
                    bxxk = f149592e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149591d);
                        f149592e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
