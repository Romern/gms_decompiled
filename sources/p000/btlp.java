package p000;

/* renamed from: btlp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btlp f149399e;

    /* renamed from: f */
    private static volatile bxxk f149400f;

    /* renamed from: a */
    public btiy f149401a;

    /* renamed from: b */
    public String f149402b = "";

    /* renamed from: c */
    public ByteString f149403c = ByteString.f164797b;

    /* renamed from: d */
    public bxvt f149404d = bxvm.f164965b;

    static {
        btlp btlp = new btlp();
        f149399e = btlp;
        GeneratedMessageLite.m124024a(btlp.class, btlp);
    }

    private btlp() {
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
            return GeneratedMessageLite.m124022a(f149399e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002Ȉ\u0003\n\u0004,", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btlp();
        } else {
            if (i2 == 4) {
                return new btlo();
            }
            if (i2 == 5) {
                return f149399e;
            }
            bxxk bxxk = f149400f;
            if (bxxk == null) {
                synchronized (btlp.class) {
                    bxxk = f149400f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149399e);
                        f149400f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
