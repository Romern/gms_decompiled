package p000;

/* renamed from: bqze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqze extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bqze f142028f;

    /* renamed from: h */
    private static volatile bxxk f142029h;

    /* renamed from: a */
    public bxwc f142030a = bxxn.f165040b;

    /* renamed from: b */
    public ByteString f142031b = ByteString.f164797b;

    /* renamed from: c */
    public String f142032c = "";

    /* renamed from: d */
    public long f142033d;

    /* renamed from: e */
    public bxvt f142034e = bxvm.f164965b;

    /* renamed from: g */
    private int f142035g;

    static {
        bqze bqze = new bqze();
        f142028f = bqze;
        GeneratedMessageLite.m124024a(bqze.class, bqze);
    }

    private bqze() {
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
            return GeneratedMessageLite.m124022a(f142028f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u001b\u0002ည\u0000\u0003ဈ\u0001\u0004ဂ\u0002\u0006\u0016", new Object[]{"g", "a", bqyt.class, "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bqze();
        } else {
            if (i2 == 4) {
                return new bxvd(f142028f);
            }
            if (i2 == 5) {
                return f142028f;
            }
            bxxk bxxk = f142029h;
            if (bxxk == null) {
                synchronized (bqze.class) {
                    bxxk = f142029h;
                    if (bxxk == null) {
                        bxxk = new bxve(f142028f);
                        f142029h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
