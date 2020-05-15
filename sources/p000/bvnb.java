package p000;

/* renamed from: bvnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvnb f156841d;

    /* renamed from: f */
    private static volatile bxxk f156842f;

    /* renamed from: a */
    public int f156843a;

    /* renamed from: b */
    public bvow f156844b;

    /* renamed from: c */
    public bvoy f156845c;

    /* renamed from: e */
    private byte f156846e = 2;

    static {
        bvnb bvnb = new bvnb();
        f156841d = bvnb;
        bxvk.m124024a(bvnb.class, bvnb);
    }

    private bvnb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f156846e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f156846e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f156841d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0006ᐉ\u0005", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f156841d);
            }
            if (i2 == 5) {
                return f156841d;
            }
            bxxk bxxk = f156842f;
            if (bxxk == null) {
                synchronized (bvnb.class) {
                    bxxk = f156842f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156841d);
                        f156842f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
