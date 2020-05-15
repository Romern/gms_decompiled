package p000;

/* renamed from: bmkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkl extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bmkl f129847j;

    /* renamed from: k */
    private static volatile bxxk f129848k;

    /* renamed from: a */
    public int f129849a;

    /* renamed from: b */
    public bmdn f129850b;

    /* renamed from: c */
    public String f129851c = "";

    /* renamed from: d */
    public boolean f129852d;

    /* renamed from: e */
    public int f129853e;

    /* renamed from: f */
    public bmkk f129854f;

    /* renamed from: g */
    public boolean f129855g;

    /* renamed from: h */
    public ByteString f129856h = ByteString.f164797b;

    /* renamed from: i */
    public boolean f129857i;

    static {
        bmkl bmkl = new bmkl();
        f129847j = bmkl;
        GeneratedMessageLite.m124024a(bmkl.class, bmkl);
    }

    private bmkl() {
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
            return GeneratedMessageLite.m124022a(f129847j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\bည\u0006\tဇ\u0007", new Object[]{"a", "b", "c", "d", "e", bmko.f129864a, "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bmkl();
        } else {
            if (i2 == 4) {
                return new bxvd(f129847j);
            }
            if (i2 == 5) {
                return f129847j;
            }
            bxxk bxxk = f129848k;
            if (bxxk == null) {
                synchronized (bmkl.class) {
                    bxxk = f129848k;
                    if (bxxk == null) {
                        bxxk = new bxve(f129847j);
                        f129848k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
