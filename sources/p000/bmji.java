package p000;

/* renamed from: bmji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmji extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmji f129706f;

    /* renamed from: g */
    private static volatile bxxk f129707g;

    /* renamed from: a */
    public int f129708a;

    /* renamed from: b */
    public String f129709b = "";

    /* renamed from: c */
    public long f129710c;

    /* renamed from: d */
    public ByteString f129711d = ByteString.f164797b;

    /* renamed from: e */
    public bxwc f129712e = bxxn.f165040b;

    static {
        bmji bmji = new bmji();
        f129706f = bmji;
        GeneratedMessageLite.m124024a(bmji.class, bmji);
    }

    private bmji() {
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
            return GeneratedMessageLite.m124022a(f129706f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b\u0004ဂ\u0001\u0005ည\u0002", new Object[]{"a", "b", "e", bmqf.class, "c", "d"});
        } else if (i2 == 3) {
            return new bmji();
        } else {
            if (i2 == 4) {
                return new bxvd(f129706f);
            }
            if (i2 == 5) {
                return f129706f;
            }
            bxxk bxxk = f129707g;
            if (bxxk == null) {
                synchronized (bmji.class) {
                    bxxk = f129707g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129706f);
                        f129707g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
