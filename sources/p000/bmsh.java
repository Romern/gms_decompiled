package p000;

/* renamed from: bmsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmsh f130675d;

    /* renamed from: e */
    private static volatile bxxk f130676e;

    /* renamed from: a */
    public int f130677a;

    /* renamed from: b */
    public int f130678b;

    /* renamed from: c */
    public ByteString f130679c = ByteString.f164797b;

    static {
        bmsh bmsh = new bmsh();
        f130675d = bmsh;
        GeneratedMessageLite.m124024a(bmsh.class, bmsh);
    }

    private bmsh() {
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
            return GeneratedMessageLite.m124022a(f130675d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", bmfm.f129127a, "c"});
        } else if (i2 == 3) {
            return new bmsh();
        } else {
            if (i2 == 4) {
                return new bxvd(f130675d);
            }
            if (i2 == 5) {
                return f130675d;
            }
            bxxk bxxk = f130676e;
            if (bxxk == null) {
                synchronized (bmsh.class) {
                    bxxk = f130676e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130675d);
                        f130676e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
