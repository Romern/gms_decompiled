package p000;

/* renamed from: blxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxs extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final blxs f128130j;

    /* renamed from: l */
    private static volatile bxxk f128131l;

    /* renamed from: a */
    public int f128132a;

    /* renamed from: b */
    public ByteString f128133b = ByteString.f164797b;

    /* renamed from: c */
    public blzc f128134c;

    /* renamed from: d */
    public bxwc f128135d = bxxn.f165040b;

    /* renamed from: e */
    public blym f128136e;

    /* renamed from: f */
    public blxv f128137f;

    /* renamed from: g */
    public long f128138g;

    /* renamed from: h */
    public boolean f128139h;

    /* renamed from: i */
    public ByteString f128140i = ByteString.f164797b;

    /* renamed from: k */
    private byte f128141k = 2;

    static {
        blxs blxs = new blxs();
        f128130j = blxs;
        GeneratedMessageLite.m124024a(blxs.class, blxs);
    }

    private blxs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128141k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128141k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f128130j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0001\u0001ည\u0000\u0002ᐉ\u0002\u0004ဂ\u0004\u0006ဉ\u0003\u0007ဇ\u0005\bဉ\u0001\tည\u0006\n\u001b", new Object[]{"a", "b", "e", "g", "f", "h", "c", "i", "d", blyh.class});
        } else if (i2 == 3) {
            return new blxs();
        } else {
            if (i2 == 4) {
                return new bxvd(f128130j);
            }
            if (i2 == 5) {
                return f128130j;
            }
            bxxk bxxk = f128131l;
            if (bxxk == null) {
                synchronized (blxs.class) {
                    bxxk = f128131l;
                    if (bxxk == null) {
                        bxxk = new bxve(f128130j);
                        f128131l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
