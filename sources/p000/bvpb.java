package p000;

/* renamed from: bvpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvpb f157257c;

    /* renamed from: e */
    private static volatile bxxk f157258e;

    /* renamed from: a */
    public int f157259a;

    /* renamed from: b */
    public bxwc f157260b = bxxn.f165040b;

    /* renamed from: d */
    private int f157261d;

    static {
        bvpb bvpb = new bvpb();
        f157257c = bvpb;
        bxvk.m124024a(bvpb.class, bvpb);
    }

    private bvpb() {
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
            return bxvk.m124022a(f157257c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", bvng.f156860a, "b", bvpe.class});
        } else if (i2 == 3) {
            return new bvpb();
        } else {
            if (i2 == 4) {
                return new bxvd(f157257c);
            }
            if (i2 == 5) {
                return f157257c;
            }
            bxxk bxxk = f157258e;
            if (bxxk == null) {
                synchronized (bvpb.class) {
                    bxxk = f157258e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157257c);
                        f157258e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
