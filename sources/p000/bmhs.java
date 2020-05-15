package p000;

/* renamed from: bmhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhs extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmhs f129480f;

    /* renamed from: h */
    private static volatile bxxk f129481h;

    /* renamed from: a */
    public String f129482a = "";

    /* renamed from: b */
    public String f129483b = "";

    /* renamed from: c */
    public int f129484c;

    /* renamed from: d */
    public bxvt f129485d = bxvm.f164965b;

    /* renamed from: e */
    public String f129486e = "";

    /* renamed from: g */
    private int f129487g;

    static {
        bmhs bmhs = new bmhs();
        f129480f = bmhs;
        GeneratedMessageLite.m124024a(bmhs.class, bmhs);
    }

    private bmhs() {
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
            return GeneratedMessageLite.m124022a(f129480f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u0016\u0005ဈ\u0003", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmhs();
        } else {
            if (i2 == 4) {
                return new bxvd(f129480f);
            }
            if (i2 == 5) {
                return f129480f;
            }
            bxxk bxxk = f129481h;
            if (bxxk == null) {
                synchronized (bmhs.class) {
                    bxxk = f129481h;
                    if (bxxk == null) {
                        bxxk = new bxve(f129480f);
                        f129481h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
