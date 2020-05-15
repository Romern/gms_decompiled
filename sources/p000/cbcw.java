package p000;

/* renamed from: cbcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbcw f176696f;

    /* renamed from: g */
    private static volatile bxxk f176697g;

    /* renamed from: a */
    public int f176698a;

    /* renamed from: b */
    public String f176699b = "";

    /* renamed from: c */
    public cbdr f176700c;

    /* renamed from: d */
    public String f176701d;

    /* renamed from: e */
    public cbdj f176702e;

    static {
        cbcw cbcw = new cbcw();
        f176696f = cbcw;
        GeneratedMessageLite.m124024a(cbcw.class, cbcw);
    }

    private cbcw() {
        ByteString bxtx = bxtx.f164797b;
        this.f176701d = "";
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
            return GeneratedMessageLite.m124022a(f176696f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0004\t\u0005Ȉ\u0006\t", new Object[]{"a", "b", "e", "d", "c"});
        } else if (i2 == 3) {
            return new cbcw();
        } else {
            if (i2 == 4) {
                return new bxvd(f176696f);
            }
            if (i2 == 5) {
                return f176696f;
            }
            bxxk bxxk = f176697g;
            if (bxxk == null) {
                synchronized (cbcw.class) {
                    bxxk = f176697g;
                    if (bxxk == null) {
                        bxxk = new bxve(f176696f);
                        f176697g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
