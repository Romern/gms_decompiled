package p000;

/* renamed from: bpwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwt extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpwt f139567g;

    /* renamed from: h */
    private static volatile bxxk f139568h;

    /* renamed from: a */
    public int f139569a;

    /* renamed from: b */
    public int f139570b;

    /* renamed from: c */
    public int f139571c;

    /* renamed from: d */
    public int f139572d;

    /* renamed from: e */
    public int f139573e;

    /* renamed from: f */
    public int f139574f;

    static {
        bpwt bpwt = new bpwt();
        f139567g = bpwt;
        GeneratedMessageLite.m124024a(bpwt.class, bpwt);
    }

    private bpwt() {
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
            return GeneratedMessageLite.m124022a(f139567g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpwt();
        } else {
            if (i2 == 4) {
                return new bxvd(f139567g);
            }
            if (i2 == 5) {
                return f139567g;
            }
            bxxk bxxk = f139568h;
            if (bxxk == null) {
                synchronized (bpwt.class) {
                    bxxk = f139568h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139567g);
                        f139568h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
