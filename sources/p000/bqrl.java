package p000;

/* renamed from: bqrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrl extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqrl f141448e;

    /* renamed from: f */
    private static volatile bxxk f141449f;

    /* renamed from: a */
    public int f141450a;

    /* renamed from: b */
    public bqrj f141451b;

    /* renamed from: c */
    public bxtx f141452c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f141453d = bxtx.f164797b;

    static {
        bqrl bqrl = new bqrl();
        f141448e = bqrl;
        bxvk.m124024a(bqrl.class, bqrl);
    }

    private bqrl() {
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
            return bxvk.m124022a(f141448e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqrl();
        } else {
            if (i2 == 4) {
                return new bxvd(f141448e);
            }
            if (i2 == 5) {
                return f141448e;
            }
            bxxk bxxk = f141449f;
            if (bxxk == null) {
                synchronized (bqrl.class) {
                    bxxk = f141449f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141448e);
                        f141449f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
