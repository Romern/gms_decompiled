package p000;

/* renamed from: cajx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajx extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cajx f174890e;

    /* renamed from: f */
    private static volatile bxxk f174891f;

    /* renamed from: a */
    public int f174892a;

    /* renamed from: b */
    public bxvw f174893b = bxwq.f165002b;

    /* renamed from: c */
    public boolean f174894c;

    /* renamed from: d */
    public long f174895d;

    static {
        cajx cajx = new cajx();
        f174890e = cajx;
        bxvk.m124024a(cajx.class, cajx);
    }

    private cajx() {
        bxwq bxwq = bxwq.f165002b;
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
            return bxvk.m124022a(f174890e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u0017\u0003ဇ\u0000\u0004စ\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cajx();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f174890e;
            }
            bxxk bxxk = f174891f;
            if (bxxk == null) {
                synchronized (cajx.class) {
                    bxxk = f174891f;
                    if (bxxk == null) {
                        bxxk = new bxve(f174890e);
                        f174891f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
