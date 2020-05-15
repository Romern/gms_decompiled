package p000;

/* renamed from: bsnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsnb f146218d;

    /* renamed from: e */
    private static volatile bxxk f146219e;

    /* renamed from: a */
    public int f146220a;

    /* renamed from: b */
    public long f146221b;

    /* renamed from: c */
    public long f146222c;

    static {
        bsnb bsnb = new bsnb();
        f146218d = bsnb;
        bxvk.m124024a(bsnb.class, bsnb);
    }

    private bsnb() {
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
            return bxvk.m124022a(f146218d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f146218d);
            }
            if (i2 == 5) {
                return f146218d;
            }
            bxxk bxxk = f146219e;
            if (bxxk == null) {
                synchronized (bsnb.class) {
                    bxxk = f146219e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146218d);
                        f146219e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
