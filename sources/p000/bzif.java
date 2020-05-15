package p000;

/* renamed from: bzif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzif extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzif f170167f;

    /* renamed from: h */
    private static volatile bxxk f170168h;

    /* renamed from: a */
    public int f170169a;

    /* renamed from: b */
    public String f170170b = "";

    /* renamed from: c */
    public bzig f170171c;

    /* renamed from: d */
    public String f170172d = "";

    /* renamed from: e */
    public long f170173e;

    /* renamed from: g */
    private byte f170174g = 2;

    static {
        bzif bzif = new bzif();
        f170167f = bzif;
        GeneratedMessageLite.m124024a(bzif.class, bzif);
    }

    private bzif() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170174g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170174g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170167f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0005ဈ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzif();
        } else {
            if (i2 == 4) {
                return new bxvd(f170167f);
            }
            if (i2 == 5) {
                return f170167f;
            }
            bxxk bxxk = f170168h;
            if (bxxk == null) {
                synchronized (bzif.class) {
                    bxxk = f170168h;
                    if (bxxk == null) {
                        bxxk = new bxve(f170167f);
                        f170168h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
