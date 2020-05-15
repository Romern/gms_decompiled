package p000;

/* renamed from: cafv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafv extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cafv f173016f;

    /* renamed from: g */
    private static volatile bxxk f173017g;

    /* renamed from: a */
    public int f173018a;

    /* renamed from: b */
    public int f173019b;

    /* renamed from: c */
    public long f173020c;

    /* renamed from: d */
    public long f173021d;

    /* renamed from: e */
    public ByteString f173022e = ByteString.f164797b;

    static {
        cafv cafv = new cafv();
        f173016f = cafv;
        GeneratedMessageLite.m124024a(cafv.class, cafv);
    }

    private cafv() {
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
            return GeneratedMessageLite.m124022a(f173016f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cafv();
        } else {
            if (i2 == 4) {
                return new bxvd(f173016f);
            }
            if (i2 == 5) {
                return f173016f;
            }
            bxxk bxxk = f173017g;
            if (bxxk == null) {
                synchronized (cafv.class) {
                    bxxk = f173017g;
                    if (bxxk == null) {
                        bxxk = new bxve(f173016f);
                        f173017g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
