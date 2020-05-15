package p000;

/* renamed from: bymu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bymu f167075c;

    /* renamed from: d */
    private static volatile bxxk f167076d;

    /* renamed from: a */
    public int f167077a = 0;

    /* renamed from: b */
    public Object f167078b;

    static {
        bymu bymu = new bymu();
        f167075c = bymu;
        bxvk.m124024a(bymu.class, bymu);
    }

    private bymu() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f167075c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000", new Object[]{"b", "a", bymw.class});
        } else if (i2 == 3) {
            return new bymu();
        } else {
            if (i2 == 4) {
                return new bxvd(f167075c);
            }
            if (i2 == 5) {
                return f167075c;
            }
            bxxk bxxk = f167076d;
            if (bxxk == null) {
                synchronized (bymu.class) {
                    bxxk = f167076d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167075c);
                        f167076d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
