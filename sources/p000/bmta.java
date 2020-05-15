package p000;

/* renamed from: bmta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmta extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmta f130803d;

    /* renamed from: e */
    private static volatile bxxk f130804e;

    /* renamed from: a */
    public bmsy f130805a;

    /* renamed from: b */
    public bxwc f130806b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f130807c;

    static {
        bmta bmta = new bmta();
        f130803d = bmta;
        GeneratedMessageLite.m124024a(bmta.class, bmta);
    }

    private bmta() {
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
            return GeneratedMessageLite.m124022a(f130803d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\u0007", new Object[]{"a", "b", bmsz.class, "c"});
        } else if (i2 == 3) {
            return new bmta();
        } else {
            if (i2 == 4) {
                return new bxvd(f130803d);
            }
            if (i2 == 5) {
                return f130803d;
            }
            bxxk bxxk = f130804e;
            if (bxxk == null) {
                synchronized (bmta.class) {
                    bxxk = f130804e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130803d);
                        f130804e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
