package p000;

/* renamed from: bbic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbic extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bbic f102696f;

    /* renamed from: g */
    private static volatile bxxk f102697g;

    /* renamed from: a */
    public int f102698a;

    /* renamed from: b */
    public int f102699b = 0;

    /* renamed from: c */
    public Object f102700c;

    /* renamed from: d */
    public int f102701d;

    /* renamed from: e */
    public bbib f102702e;

    static {
        bbic bbic = new bbic();
        f102696f = bbic;
        bxvk.m124024a(bbic.class, bbic);
    }

    private bbic() {
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
            return bxvk.m124022a(f102696f, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002င\u0004\u0003ဉ\u0005\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"c", "b", "a", bbie.class, "d", "e", bbid.class, afre.class, bbii.class});
        } else if (i2 == 3) {
            return new bbic();
        } else {
            if (i2 == 4) {
                return new bxvd(f102696f);
            }
            if (i2 == 5) {
                return f102696f;
            }
            bxxk bxxk = f102697g;
            if (bxxk == null) {
                synchronized (bbic.class) {
                    bxxk = f102697g;
                    if (bxxk == null) {
                        bxxk = new bxve(f102696f);
                        f102697g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
