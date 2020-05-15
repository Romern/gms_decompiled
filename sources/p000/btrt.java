package p000;

/* renamed from: btrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btrt f150144e;

    /* renamed from: f */
    private static volatile bxxk f150145f;

    /* renamed from: a */
    public int f150146a;

    /* renamed from: b */
    public ByteString f150147b = ByteString.f164797b;

    /* renamed from: c */
    public boolean f150148c;

    /* renamed from: d */
    public bxwc f150149d = bxxn.f165040b;

    static {
        btrt btrt = new btrt();
        f150144e = btrt;
        GeneratedMessageLite.m124024a(btrt.class, btrt);
    }

    private btrt() {
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
            return GeneratedMessageLite.m124022a(f150144e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002ဇ\u0001\u0004\u001a", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btrt();
        } else {
            if (i2 == 4) {
                return new btrs();
            }
            if (i2 == 5) {
                return f150144e;
            }
            bxxk bxxk = f150145f;
            if (bxxk == null) {
                synchronized (btrt.class) {
                    bxxk = f150145f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150144e);
                        f150145f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
