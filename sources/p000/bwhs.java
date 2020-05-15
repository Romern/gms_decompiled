package p000;

/* renamed from: bwhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhs extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bwhs f159552h;

    /* renamed from: i */
    private static volatile bxxk f159553i;

    /* renamed from: a */
    public int f159554a;

    /* renamed from: b */
    public bmnr f159555b;

    /* renamed from: c */
    public bwht f159556c;

    /* renamed from: d */
    public bwhm f159557d;

    /* renamed from: e */
    public bmdb f159558e;

    /* renamed from: f */
    public bmno f159559f;

    /* renamed from: g */
    public int f159560g;

    static {
        bwhs bwhs = new bwhs();
        f159552h = bwhs;
        bxvk.m124024a(bwhs.class, bwhs);
    }

    private bwhs() {
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
            return bxvk.m124022a(f159552h, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0007ဉ\u0007\bဌ\b\tဉ\u0004\nဉ\u0005", new Object[]{"a", "b", "c", "f", "g", bwhp.f159544a, "d", "e"});
        } else if (i2 == 3) {
            return new bwhs();
        } else {
            if (i2 == 4) {
                return new bxvd(f159552h);
            }
            if (i2 == 5) {
                return f159552h;
            }
            bxxk bxxk = f159553i;
            if (bxxk == null) {
                synchronized (bwhs.class) {
                    bxxk = f159553i;
                    if (bxxk == null) {
                        bxxk = new bxve(f159552h);
                        f159553i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
