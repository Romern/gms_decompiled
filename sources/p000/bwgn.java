package p000;

/* renamed from: bwgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bwgn f159218h;

    /* renamed from: j */
    private static volatile bxxk f159219j;

    /* renamed from: a */
    public int f159220a;

    /* renamed from: b */
    public bmav f159221b;

    /* renamed from: c */
    public bmaq f159222c;

    /* renamed from: d */
    public bmar f159223d;

    /* renamed from: e */
    public int f159224e;

    /* renamed from: f */
    public bwgo f159225f;

    /* renamed from: g */
    public int f159226g;

    /* renamed from: i */
    private byte f159227i = 2;

    static {
        bwgn bwgn = new bwgn();
        f159218h = bwgn;
        GeneratedMessageLite.m124024a(bwgn.class, bwgn);
    }

    private bwgn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f159227i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f159227i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f159218h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0003\u0004ᐉ\u0004\u0005ဌ\u0005\u0006ဉ\u0002", new Object[]{"a", "b", "c", "e", bwgl.f159217a, "f", "g", bwgz.m121953b(), "d"});
        } else if (i2 == 3) {
            return new bwgn();
        } else {
            if (i2 == 4) {
                return new bxvd(f159218h);
            }
            if (i2 == 5) {
                return f159218h;
            }
            bxxk bxxk = f159219j;
            if (bxxk == null) {
                synchronized (bwgn.class) {
                    bxxk = f159219j;
                    if (bxxk == null) {
                        bxxk = new bxve(f159218h);
                        f159219j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
