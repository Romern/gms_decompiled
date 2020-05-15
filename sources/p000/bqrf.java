package p000;

/* renamed from: bqrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqrf f141429c;

    /* renamed from: d */
    private static volatile bxxk f141430d;

    /* renamed from: a */
    public int f141431a;

    /* renamed from: b */
    public bxtx f141432b = bxtx.f164797b;

    static {
        bqrf bqrf = new bqrf();
        f141429c = bqrf;
        bxvk.m124024a(bqrf.class, bqrf);
    }

    private bqrf() {
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
            return bxvk.m124022a(f141429c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqrf();
        } else {
            if (i2 == 4) {
                return new bxvd(f141429c);
            }
            if (i2 == 5) {
                return f141429c;
            }
            bxxk bxxk = f141430d;
            if (bxxk == null) {
                synchronized (bqrf.class) {
                    bxxk = f141430d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141429c);
                        f141430d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
