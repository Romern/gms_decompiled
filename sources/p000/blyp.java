package p000;

/* renamed from: blyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyp extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final blyp f128283f;

    /* renamed from: h */
    private static volatile bxxk f128284h;

    /* renamed from: a */
    public int f128285a;

    /* renamed from: b */
    public bmav f128286b;

    /* renamed from: c */
    public bmaq f128287c;

    /* renamed from: d */
    public bmar f128288d;

    /* renamed from: e */
    public blym f128289e;

    /* renamed from: g */
    private byte f128290g = 2;

    static {
        blyp blyp = new blyp();
        f128283f = blyp;
        GeneratedMessageLite.m124024a(blyp.class, blyp);
    }

    private blyp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128290g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128290g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128283f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003\u0005ဉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new blyp();
        } else {
            if (i2 == 4) {
                return new bxvd(f128283f);
            }
            if (i2 == 5) {
                return f128283f;
            }
            bxxk bxxk = f128284h;
            if (bxxk == null) {
                synchronized (blyp.class) {
                    bxxk = f128284h;
                    if (bxxk == null) {
                        bxxk = new bxve(f128283f);
                        f128284h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
