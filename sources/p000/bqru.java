package p000;

/* renamed from: bqru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqru extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqru f141483d;

    /* renamed from: e */
    private static volatile bxxk f141484e;

    /* renamed from: a */
    public int f141485a;

    /* renamed from: b */
    public bxtx f141486b = bxtx.f164797b;

    /* renamed from: c */
    public bqrv f141487c;

    static {
        bqru bqru = new bqru();
        f141483d = bqru;
        bxvk.m124024a(bqru.class, bqru);
    }

    private bqru() {
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
            return bxvk.m124022a(f141483d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqru();
        } else {
            if (i2 == 4) {
                return new bxvd(f141483d);
            }
            if (i2 == 5) {
                return f141483d;
            }
            bxxk bxxk = f141484e;
            if (bxxk == null) {
                synchronized (bqru.class) {
                    bxxk = f141484e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141483d);
                        f141484e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
