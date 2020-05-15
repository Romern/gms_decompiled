package p000;

/* renamed from: jbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jbd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final jbd f22078d;

    /* renamed from: e */
    private static volatile bxxk f22079e;

    /* renamed from: a */
    public bxww f22080a = bxww.f165013b;

    /* renamed from: b */
    public bxwc f22081b = bxxn.f165040b;

    /* renamed from: c */
    public int f22082c;

    static {
        jbd jbd = new jbd();
        f22078d = jbd;
        bxvk.m124024a(jbd.class, jbd);
    }

    private jbd() {
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
            return bxvk.m124022a(f22078d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u00012\u0002\u001b\u0003\u0004", new Object[]{"a", jbc.f22077a, "b", jbf.class, "c"});
        } else if (i2 == 3) {
            return new jbd();
        } else {
            if (i2 == 4) {
                return new bxvd(f22078d);
            }
            if (i2 == 5) {
                return f22078d;
            }
            bxxk bxxk = f22079e;
            if (bxxk == null) {
                synchronized (jbd.class) {
                    bxxk = f22079e;
                    if (bxxk == null) {
                        bxxk = new bxve(f22078d);
                        f22079e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
