package p000;

/* renamed from: cixj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cixj f191673e;

    /* renamed from: h */
    private static volatile bxxk f191674h;

    /* renamed from: a */
    public int f191675a;

    /* renamed from: b */
    public String f191676b = "";

    /* renamed from: c */
    public int f191677c;

    /* renamed from: d */
    public byuj f191678d;

    /* renamed from: f */
    private bzlg f191679f;

    /* renamed from: g */
    private byte f191680g = 2;

    static {
        cixj cixj = new cixj();
        f191673e = cixj;
        GeneratedMessageLite.m124024a(cixj.class, cixj);
    }

    private cixj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f191680g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f191680g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f191673e, "\u0001\u0004\u0000\u0001\u0005\u000e\u0004\u0000\u0000\u0001\u0005ᐉ\u0004\tဈ\b\nင\t\u000eဉ\r", new Object[]{"a", "f", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cixj();
        } else {
            if (i2 == 4) {
                return new bxvd(f191673e);
            }
            if (i2 == 5) {
                return f191673e;
            }
            bxxk bxxk = f191674h;
            if (bxxk == null) {
                synchronized (cixj.class) {
                    bxxk = f191674h;
                    if (bxxk == null) {
                        bxxk = new bxve(f191673e);
                        f191674h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
