package p000;

/* renamed from: ayez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayez extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final ayez f97415i;

    /* renamed from: l */
    private static volatile bxxk f97416l;

    /* renamed from: a */
    public String f97417a = "";

    /* renamed from: b */
    public String f97418b = "";

    /* renamed from: c */
    public String f97419c = "";

    /* renamed from: d */
    public ByteString f97420d = ByteString.f164797b;

    /* renamed from: e */
    public long f97421e;

    /* renamed from: f */
    public boolean f97422f;

    /* renamed from: g */
    public String f97423g = "";

    /* renamed from: h */
    public bxwc f97424h = bxxn.f165040b;

    /* renamed from: j */
    private int f97425j;

    /* renamed from: k */
    private byte f97426k = 2;

    static {
        ayez ayez = new ayez();
        f97415i = ayez;
        GeneratedMessageLite.m124024a(ayez.class, ayez);
    }

    private ayez() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97426k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97426k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97415i, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0004\u0001ᔈ\u0000\u0002ᔈ\u0002\u0004ည\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bЛ\tᔈ\u0001", new Object[]{"j", "a", "c", "d", "e", "f", "g", "h", ayef.class, "b"});
        } else if (i2 == 3) {
            return new ayez();
        } else {
            if (i2 == 4) {
                return new bxvd(f97415i);
            }
            if (i2 == 5) {
                return f97415i;
            }
            bxxk bxxk = f97416l;
            if (bxxk == null) {
                synchronized (ayez.class) {
                    bxxk = f97416l;
                    if (bxxk == null) {
                        bxxk = new bxve(f97415i);
                        f97416l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
