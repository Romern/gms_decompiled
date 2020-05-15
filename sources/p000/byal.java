package p000;

/* renamed from: byal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byal extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final byal f165279g;

    /* renamed from: h */
    private static volatile bxxk f165280h;

    /* renamed from: a */
    public int f165281a;

    /* renamed from: b */
    public long f165282b;

    /* renamed from: c */
    public String f165283c = "";

    /* renamed from: d */
    public ByteString f165284d = ByteString.f164797b;

    /* renamed from: e */
    public boolean f165285e;

    /* renamed from: f */
    public boolean f165286f = true;

    static {
        byal byal = new byal();
        f165279g = byal;
        GeneratedMessageLite.m124024a(byal.class, byal);
    }

    private byal() {
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
            return GeneratedMessageLite.m124022a(f165279g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new byal();
        } else {
            if (i2 == 4) {
                return new bxvd(f165279g);
            }
            if (i2 == 5) {
                return f165279g;
            }
            bxxk bxxk = f165280h;
            if (bxxk == null) {
                synchronized (byal.class) {
                    bxxk = f165280h;
                    if (bxxk == null) {
                        bxxk = new bxve(f165279g);
                        f165280h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
