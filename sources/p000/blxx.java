package p000;

/* renamed from: blxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxx extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final blxx f128159j;

    /* renamed from: l */
    private static volatile bxxk f128160l;

    /* renamed from: a */
    public int f128161a;

    /* renamed from: b */
    public bmav f128162b;

    /* renamed from: c */
    public bmaq f128163c;

    /* renamed from: d */
    public bmar f128164d;

    /* renamed from: e */
    public bmag f128165e;

    /* renamed from: f */
    public blym f128166f;

    /* renamed from: g */
    public bxwc f128167g = bxxn.f165040b;

    /* renamed from: h */
    public int f128168h;

    /* renamed from: i */
    public bwit f128169i;

    /* renamed from: k */
    private byte f128170k = 2;

    static {
        blxx blxx = new blxx();
        f128159j = blxx;
        GeneratedMessageLite.m124024a(blxx.class, blxx);
    }

    private blxx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128170k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128170k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128159j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0004\u0004ဉ\u0003\u0006ဌ\u0005\u0007ဉ\u0002\bЛ\nဉ\u0006", new Object[]{"a", "b", "c", "f", "e", "h", bwgz.m121953b(), "d", "g", blym.class, "i"});
        } else if (i2 == 3) {
            return new blxx();
        } else {
            if (i2 == 4) {
                return new bxvd(f128159j);
            }
            if (i2 == 5) {
                return f128159j;
            }
            bxxk bxxk = f128160l;
            if (bxxk == null) {
                synchronized (blxx.class) {
                    bxxk = f128160l;
                    if (bxxk == null) {
                        bxxk = new bxve(f128159j);
                        f128160l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
