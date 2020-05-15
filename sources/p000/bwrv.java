package p000;

/* renamed from: bwrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwrv f160805e;

    /* renamed from: f */
    private static volatile bxxk f160806f;

    /* renamed from: a */
    public int f160807a;

    /* renamed from: b */
    public long f160808b;

    /* renamed from: c */
    public int f160809c;

    /* renamed from: d */
    public int f160810d;

    static {
        bwrv bwrv = new bwrv();
        f160805e = bwrv;
        bxvk.m124024a(bwrv.class, bwrv);
    }

    private bwrv() {
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
            return bxvk.m124022a(f160805e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwrv();
        } else {
            if (i2 == 4) {
                return new bxvd(f160805e);
            }
            if (i2 == 5) {
                return f160805e;
            }
            bxxk bxxk = f160806f;
            if (bxxk == null) {
                synchronized (bwrv.class) {
                    bxxk = f160806f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160805e);
                        f160806f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
