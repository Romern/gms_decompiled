package p000;

/* renamed from: bxbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbx extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bxbx f162741i;

    /* renamed from: k */
    private static volatile bxxk f162742k;

    /* renamed from: a */
    public int f162743a;

    /* renamed from: b */
    public long f162744b;

    /* renamed from: c */
    public int f162745c;

    /* renamed from: d */
    public int f162746d;

    /* renamed from: e */
    public int f162747e;

    /* renamed from: f */
    public int f162748f;

    /* renamed from: g */
    public int f162749g;

    /* renamed from: h */
    public int f162750h;

    /* renamed from: j */
    private int f162751j;

    static {
        bxbx bxbx = new bxbx();
        f162741i = bxbx;
        bxvk.m124024a(bxbx.class, bxbx);
    }

    private bxbx() {
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
            return bxvk.m124022a(f162741i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"j", "a", bxbv.f162740a, "b", "c", bxfl.f163180a, "d", bxfh.f163178a, "e", bxfj.f163179a, "f", bxfn.f163181a, "g", bxfp.f163182a, "h", bxfr.f163183a});
        } else if (i2 == 3) {
            return new bxbx();
        } else {
            if (i2 == 4) {
                return new bxvd(f162741i);
            }
            if (i2 == 5) {
                return f162741i;
            }
            bxxk bxxk = f162742k;
            if (bxxk == null) {
                synchronized (bxbx.class) {
                    bxxk = f162742k;
                    if (bxxk == null) {
                        bxxk = new bxve(f162741i);
                        f162742k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
