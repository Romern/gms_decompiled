package p000;

/* renamed from: btsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btsd f150184e;

    /* renamed from: g */
    private static volatile bxxk f150185g;

    /* renamed from: a */
    public String f150186a = "";

    /* renamed from: b */
    public String f150187b = "";

    /* renamed from: c */
    public ByteString f150188c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f150189d = ByteString.f164797b;

    /* renamed from: f */
    private int f150190f;

    static {
        btsd btsd = new btsd();
        f150184e = btsd;
        GeneratedMessageLite.m124024a(btsd.class, btsd);
    }

    private btsd() {
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
            return GeneratedMessageLite.m124022a(f150184e, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006ည\u0005", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btsd();
        } else {
            if (i2 == 4) {
                return new bxvd(f150184e);
            }
            if (i2 == 5) {
                return f150184e;
            }
            bxxk bxxk = f150185g;
            if (bxxk == null) {
                synchronized (btsd.class) {
                    bxxk = f150185g;
                    if (bxxk == null) {
                        bxxk = new bxve(f150184e);
                        f150185g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
