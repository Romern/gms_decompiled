package p000;

/* renamed from: ayfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfa extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final ayfa f97427k;

    /* renamed from: n */
    private static volatile bxxk f97428n;

    /* renamed from: a */
    public int f97429a;

    /* renamed from: b */
    public int f97430b;

    /* renamed from: c */
    public String f97431c = "";

    /* renamed from: d */
    public String f97432d = "";

    /* renamed from: e */
    public String f97433e = "";

    /* renamed from: f */
    public String f97434f = "";

    /* renamed from: g */
    public ByteString f97435g = ByteString.f164797b;

    /* renamed from: h */
    public String f97436h = "";

    /* renamed from: i */
    public ayen f97437i;

    /* renamed from: j */
    public int f97438j;

    /* renamed from: l */
    private int f97439l;

    /* renamed from: m */
    private byte f97440m = 2;

    static {
        ayfa ayfa = new ayfa();
        f97427k = ayfa;
        GeneratedMessageLite.m124024a(ayfa.class, ayfa);
    }

    private ayfa() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m83902a(ayfa ayfa) {
        ayfa.f97429a |= 16;
        ayfa.f97439l = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97440m);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97440m = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f97427k, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0006\u0001ᔄ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔄ\u0004\u0006ᔈ\u0005\u0007ည\u0006\bဈ\u0007\tဉ\b\nင\t", new Object[]{"a", "b", "c", "d", "e", "l", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new ayfa();
        } else {
            if (i2 == 4) {
                return new bxvd(f97427k);
            }
            if (i2 == 5) {
                return f97427k;
            }
            bxxk bxxk = f97428n;
            if (bxxk == null) {
                synchronized (ayfa.class) {
                    bxxk = f97428n;
                    if (bxxk == null) {
                        bxxk = new bxve(f97427k);
                        f97428n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
