package p000;

/* renamed from: bvef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvef extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvef f155706e;

    /* renamed from: f */
    private static volatile bxxk f155707f;

    /* renamed from: a */
    public int f155708a;

    /* renamed from: b */
    public long f155709b;

    /* renamed from: c */
    public bxvt f155710c = bxvm.f164965b;

    /* renamed from: d */
    public bxwc f155711d = bxxn.f165040b;

    static {
        bvef bvef = new bvef();
        f155706e = bvef;
        bxvk.m124024a(bvef.class, bvef);
    }

    private bvef() {
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
            return bxvk.m124022a(f155706e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001e\u0003\u001b", new Object[]{"a", "b", "c", bvif.m121137b(), "d", bvej.class});
        } else if (i2 == 3) {
            return new bvef();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f155706e;
            }
            bxxk bxxk = f155707f;
            if (bxxk == null) {
                synchronized (bvef.class) {
                    bxxk = f155707f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155706e);
                        f155707f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
