package p000;

/* renamed from: mro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mro extends bxvk implements bxxd {

    /* renamed from: e */
    public static final mro f34456e;

    /* renamed from: f */
    private static volatile bxxk f34457f;

    /* renamed from: a */
    public int f34458a;

    /* renamed from: b */
    public int f34459b;

    /* renamed from: c */
    public int f34460c;

    /* renamed from: d */
    public int f34461d;

    static {
        mro mro = new mro();
        f34456e = mro;
        bxvk.m124024a(mro.class, mro);
    }

    private mro() {
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
            return bxvk.m124022a(f34456e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new mro();
        } else {
            if (i2 == 4) {
                return new bxvd(f34456e);
            }
            if (i2 == 5) {
                return f34456e;
            }
            bxxk bxxk = f34457f;
            if (bxxk == null) {
                synchronized (mro.class) {
                    bxxk = f34457f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34456e);
                        f34457f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
