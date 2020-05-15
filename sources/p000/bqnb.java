package p000;

/* renamed from: bqnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqnb extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bqnb f141289f;

    /* renamed from: g */
    private static volatile bxxk f141290g;

    /* renamed from: a */
    public String f141291a = "";

    /* renamed from: b */
    public bqnc f141292b;

    /* renamed from: c */
    public ByteString f141293c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f141294d = ByteString.f164797b;

    /* renamed from: e */
    public bxwc f141295e = bxxn.f165040b;

    static {
        bqnb bqnb = new bqnb();
        f141289f = bqnb;
        GeneratedMessageLite.m124024a(bqnb.class, bqnb);
    }

    private bqnb() {
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
            return GeneratedMessageLite.m124022a(f141289f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\n\u0004\n\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", bqmm.class});
        } else if (i2 == 3) {
            return new bqnb();
        } else {
            if (i2 == 4) {
                return new bqna();
            }
            if (i2 == 5) {
                return f141289f;
            }
            bxxk bxxk = f141290g;
            if (bxxk == null) {
                synchronized (bqnb.class) {
                    bxxk = f141290g;
                    if (bxxk == null) {
                        bxxk = new bxve(f141289f);
                        f141290g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
