package p000;

/* renamed from: btlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btlb f149338e;

    /* renamed from: f */
    private static volatile bxxk f149339f;

    /* renamed from: a */
    public btiy f149340a;

    /* renamed from: b */
    public ByteString f149341b = ByteString.f164797b;

    /* renamed from: c */
    public String f149342c = "";

    /* renamed from: d */
    public String f149343d = "";

    static {
        btlb btlb = new btlb();
        f149338e = btlb;
        GeneratedMessageLite.m124024a(btlb.class, btlb);
    }

    private btlb() {
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
            return GeneratedMessageLite.m124022a(f149338e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\n\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btlb();
        } else {
            if (i2 == 4) {
                return new bxvd(f149338e);
            }
            if (i2 == 5) {
                return f149338e;
            }
            bxxk bxxk = f149339f;
            if (bxxk == null) {
                synchronized (btlb.class) {
                    bxxk = f149339f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149338e);
                        f149339f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
