package p000;

/* renamed from: bvfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvfi f155868e;

    /* renamed from: f */
    private static volatile bxxk f155869f;

    /* renamed from: a */
    public int f155870a;

    /* renamed from: b */
    public int f155871b;

    /* renamed from: c */
    public int f155872c;

    /* renamed from: d */
    public long f155873d;

    static {
        bvfi bvfi = new bvfi();
        f155868e = bvfi;
        bxvk.m124024a(bvfi.class, bvfi);
    }

    private bvfi() {
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
            return bxvk.m124022a(f155868e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bvjq.f156351a, "c", bvjp.f156350a, "d"});
        } else if (i2 == 3) {
            return new bvfi();
        } else {
            if (i2 == 4) {
                return new bxvd(f155868e);
            }
            if (i2 == 5) {
                return f155868e;
            }
            bxxk bxxk = f155869f;
            if (bxxk == null) {
                synchronized (bvfi.class) {
                    bxxk = f155869f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155868e);
                        f155869f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
