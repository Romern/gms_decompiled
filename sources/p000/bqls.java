package p000;

/* renamed from: bqls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqls extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqls f141159c;

    /* renamed from: d */
    private static volatile bxxk f141160d;

    /* renamed from: a */
    public int f141161a;

    /* renamed from: b */
    public bxtx f141162b = bxtx.f164797b;

    static {
        bqls bqls = new bqls();
        f141159c = bqls;
        bxvk.m124024a(bqls.class, bqls);
    }

    private bqls() {
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
            return bxvk.m124022a(f141159c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqls();
        } else {
            if (i2 == 4) {
                return new bxvd(f141159c);
            }
            if (i2 == 5) {
                return f141159c;
            }
            bxxk bxxk = f141160d;
            if (bxxk == null) {
                synchronized (bqls.class) {
                    bxxk = f141160d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141159c);
                        f141160d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
