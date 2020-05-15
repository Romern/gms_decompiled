package p000;

/* renamed from: bmtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmtg extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bmtg f130832g;

    /* renamed from: h */
    private static volatile bxxk f130833h;

    /* renamed from: a */
    public String f130834a = "";

    /* renamed from: b */
    public int f130835b;

    /* renamed from: c */
    public String f130836c = "";

    /* renamed from: d */
    public int f130837d;

    /* renamed from: e */
    public long f130838e;

    /* renamed from: f */
    public String f130839f;

    static {
        bmtg bmtg = new bmtg();
        f130832g = bmtg;
        GeneratedMessageLite.m124024a(bmtg.class, bmtg);
    }

    private bmtg() {
        ByteString bxtx = bxtx.f164797b;
        this.f130839f = "";
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
            return GeneratedMessageLite.m124022a(f130832g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0002\u0004\u0003\b\u0004\u0004\u0005\u0002\u0006\b", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bmtg();
        } else {
            if (i2 == 4) {
                return new bxvd(f130832g);
            }
            if (i2 == 5) {
                return f130832g;
            }
            bxxk bxxk = f130833h;
            if (bxxk == null) {
                synchronized (bmtg.class) {
                    bxxk = f130833h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130832g);
                        f130833h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
