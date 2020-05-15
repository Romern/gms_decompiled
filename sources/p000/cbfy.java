package p000;

/* renamed from: cbfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbfy f176988d;

    /* renamed from: e */
    private static volatile bxxk f176989e;

    /* renamed from: a */
    public int f176990a = 0;

    /* renamed from: b */
    public Object f176991b;

    /* renamed from: c */
    public int f176992c;

    static {
        cbfy cbfy = new cbfy();
        f176988d = cbfy;
        bxvk.m124024a(cbfy.class, cbfy);
    }

    private cbfy() {
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
            return bxvk.m124022a(f176988d, "\u0000\u0003\u0001\u0000\u0001f\u0003\u0000\u0000\u0000\u0001\fe<\u0000f<\u0000", new Object[]{"b", "a", "c", cbfv.class, cbfz.class});
        } else if (i2 == 3) {
            return new cbfy();
        } else {
            if (i2 == 4) {
                return new bxvd(f176988d);
            }
            if (i2 == 5) {
                return f176988d;
            }
            bxxk bxxk = f176989e;
            if (bxxk == null) {
                synchronized (cbfy.class) {
                    bxxk = f176989e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176988d);
                        f176989e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
