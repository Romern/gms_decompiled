package p000;

/* renamed from: bqrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqrv f141488c;

    /* renamed from: d */
    private static volatile bxxk f141489d;

    /* renamed from: a */
    public int f141490a;

    /* renamed from: b */
    public bxtx f141491b = bxtx.f164797b;

    static {
        bqrv bqrv = new bqrv();
        f141488c = bqrv;
        bxvk.m124024a(bqrv.class, bqrv);
    }

    private bqrv() {
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
            return bxvk.m124022a(f141488c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bqrv();
        } else {
            if (i2 == 4) {
                return new bxvd(f141488c);
            }
            if (i2 == 5) {
                return f141488c;
            }
            bxxk bxxk = f141489d;
            if (bxxk == null) {
                synchronized (bqrv.class) {
                    bxxk = f141489d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141488c);
                        f141489d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
