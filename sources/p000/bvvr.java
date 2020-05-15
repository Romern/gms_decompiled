package p000;

/* renamed from: bvvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvvr f157835e;

    /* renamed from: f */
    private static volatile bxxk f157836f;

    /* renamed from: a */
    public int f157837a;

    /* renamed from: b */
    public int f157838b;

    /* renamed from: c */
    public int f157839c;

    /* renamed from: d */
    public long f157840d;

    static {
        bvvr bvvr = new bvvr();
        f157835e = bvvr;
        bxvk.m124024a(bvvr.class, bvvr);
    }

    private bvvr() {
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
            return bxvk.m124022a(f157835e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bvvc.f157788a, "c", bvvq.f157834a, "d"});
        } else if (i2 == 3) {
            return new bvvr();
        } else {
            if (i2 == 4) {
                return new bxvd(f157835e);
            }
            if (i2 == 5) {
                return f157835e;
            }
            bxxk bxxk = f157836f;
            if (bxxk == null) {
                synchronized (bvvr.class) {
                    bxxk = f157836f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157835e);
                        f157836f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
