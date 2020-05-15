package p000;

/* renamed from: bliz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bliz extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bliz f126647i;

    /* renamed from: j */
    private static volatile bxxk f126648j;

    /* renamed from: a */
    public int f126649a;

    /* renamed from: b */
    public String f126650b = "";

    /* renamed from: c */
    public int f126651c;

    /* renamed from: d */
    public int f126652d;

    /* renamed from: e */
    public long f126653e;

    /* renamed from: f */
    public long f126654f;

    /* renamed from: g */
    public int f126655g;

    /* renamed from: h */
    public boolean f126656h;

    static {
        bliz bliz = new bliz();
        f126647i = bliz;
        GeneratedMessageLite.m124024a(bliz.class, bliz);
    }

    private bliz() {
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
            return GeneratedMessageLite.m124022a(f126647i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဇ\u0006\u0007င\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g"});
        } else if (i2 == 3) {
            return new bliz();
        } else {
            if (i2 == 4) {
                return new bxvd(f126647i);
            }
            if (i2 == 5) {
                return f126647i;
            }
            bxxk bxxk = f126648j;
            if (bxxk == null) {
                synchronized (bliz.class) {
                    bxxk = f126648j;
                    if (bxxk == null) {
                        bxxk = new bxve(f126647i);
                        f126648j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
