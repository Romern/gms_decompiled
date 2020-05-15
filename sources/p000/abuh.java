package p000;

/* renamed from: abuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuh extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final abuh f58387q;

    /* renamed from: r */
    private static volatile bxxk f58388r;

    /* renamed from: a */
    public int f58389a;

    /* renamed from: b */
    public int f58390b;

    /* renamed from: c */
    public bxvt f58391c = bxvm.f164965b;

    /* renamed from: d */
    public bxwc f58392d = bxxn.f165040b;

    /* renamed from: e */
    public int f58393e;

    /* renamed from: f */
    public bxvt f58394f = bxvm.f164965b;

    /* renamed from: g */
    public ByteString f58395g = ByteString.f164797b;

    /* renamed from: h */
    public abui f58396h;

    /* renamed from: i */
    public bxvo f58397i = bxum.f164858b;

    /* renamed from: j */
    public bxvt f58398j = bxvm.f164965b;

    /* renamed from: k */
    public bxvt f58399k = bxvm.f164965b;

    /* renamed from: l */
    public abtn f58400l;

    /* renamed from: m */
    public int f58401m;

    /* renamed from: n */
    public String f58402n = "";

    /* renamed from: o */
    public bxvt f58403o = bxvm.f164965b;

    /* renamed from: p */
    public ByteString f58404p = ByteString.f164797b;

    static {
        abuh abuh = new abuh();
        f58387q = abuh;
        GeneratedMessageLite.m124024a(abuh.class, abuh);
    }

    private abuh() {
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
            return GeneratedMessageLite.m124022a(f58387q, "\u0001\u000f\u0000\u0001\u0002\u0016\u000f\u0000\u0007\u0000\u0002ဋ\u0001\u0003'\u0004\u001b\u0005ဋ\u0002\u0006'\u0007ည\u0003\tဉ\u0004\n#\u000b'\f'\u000fဈ\u0007\u0010'\u0011ည\b\u0015ဉ\u0005\u0016ဌ\u0006", new Object[]{"a", "b", "c", "d", abug.class, "e", "f", "g", "h", "i", "j", "k", "n", "o", "p", "l", "m", bqax.f140196a});
        } else if (i2 == 3) {
            return new abuh();
        } else {
            if (i2 == 4) {
                return new bxvd(f58387q);
            }
            if (i2 == 5) {
                return f58387q;
            }
            bxxk bxxk = f58388r;
            if (bxxk == null) {
                synchronized (abuh.class) {
                    bxxk = f58388r;
                    if (bxxk == null) {
                        bxxk = new bxve(f58387q);
                        f58388r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
