package p000;

/* renamed from: baug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baug extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final baug f101763f;

    /* renamed from: h */
    private static volatile bxxk f101764h;

    /* renamed from: a */
    public int f101765a;

    /* renamed from: b */
    public String f101766b = "";

    /* renamed from: c */
    public String f101767c = "";

    /* renamed from: d */
    public int f101768d;

    /* renamed from: e */
    public String f101769e = "";

    /* renamed from: g */
    private int f101770g;

    static {
        baug baug = new baug();
        f101763f = baug;
        GeneratedMessageLite.m124024a(baug.class, baug);
    }

    private baug() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* renamed from: a */
    public static /* synthetic */ void m87563a(baug baug) {
        baug.f101765a |= 4;
        baug.f101770g = 0;
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
            return GeneratedMessageLite.m124022a(f101763f, "\u0001\u0005\u0000\u0001\u0002\u000f\u0005\u0000\u0000\u0000\u0002ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000fဌ\u0003", new Object[]{"a", "c", "g", "e", "b", "d", bauf.f101762a});
        } else if (i2 == 3) {
            return new baug();
        } else {
            if (i2 == 4) {
                return new bxvd(f101763f);
            }
            if (i2 == 5) {
                return f101763f;
            }
            bxxk bxxk = f101764h;
            if (bxxk == null) {
                synchronized (baug.class) {
                    bxxk = f101764h;
                    if (bxxk == null) {
                        bxxk = new bxve(f101763f);
                        f101764h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
