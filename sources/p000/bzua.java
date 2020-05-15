package p000;

/* renamed from: bzua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzua extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bzua f171391g;

    /* renamed from: h */
    private static volatile bxxk f171392h;

    /* renamed from: a */
    public int f171393a = 0;

    /* renamed from: b */
    public Object f171394b;

    /* renamed from: c */
    public String f171395c = "";

    /* renamed from: d */
    public String f171396d = "";

    /* renamed from: e */
    public String f171397e = "";

    /* renamed from: f */
    public String f171398f = "";

    static {
        bzua bzua = new bzua();
        f171391g = bzua;
        bxvk.m124024a(bzua.class, bzua);
    }

    private bzua() {
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
            return bxvk.m124022a(f171391g, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȼ\u0000\u0004<\u0000\u0005Ȉ\u0006Ȉ", new Object[]{"b", "a", "c", "d", bzub.class, "e", "f"});
        } else if (i2 == 3) {
            return new bzua();
        } else {
            if (i2 == 4) {
                return new bxvd(f171391g);
            }
            if (i2 == 5) {
                return f171391g;
            }
            bxxk bxxk = f171392h;
            if (bxxk == null) {
                synchronized (bzua.class) {
                    bxxk = f171392h;
                    if (bxxk == null) {
                        bxxk = new bxve(f171391g);
                        f171392h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
