package p000;

/* renamed from: bytl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bytl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bytl f167678d;

    /* renamed from: f */
    private static volatile bxxk f167679f;

    /* renamed from: a */
    public int f167680a;

    /* renamed from: b */
    public ByteString f167681b = ByteString.f164797b;

    /* renamed from: c */
    public int f167682c = 65537;

    /* renamed from: e */
    private byte f167683e = 2;

    static {
        bytl bytl = new bytl();
        f167678d = bytl;
        GeneratedMessageLite.m124024a(bytl.class, bytl);
    }

    private bytl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f167683e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f167683e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f167678d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bytl();
        } else {
            if (i2 == 4) {
                return new bxvd(f167678d);
            }
            if (i2 == 5) {
                return f167678d;
            }
            bxxk bxxk = f167679f;
            if (bxxk == null) {
                synchronized (bytl.class) {
                    bxxk = f167679f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167678d);
                        f167679f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
