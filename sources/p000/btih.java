package p000;

/* renamed from: btih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btih extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final btih f148964m;

    /* renamed from: n */
    private static volatile bxxk f148965n;

    /* renamed from: a */
    public ByteString f148966a = ByteString.f164797b;

    /* renamed from: b */
    public bxwc f148967b = bxxn.f165040b;

    /* renamed from: c */
    public bxww f148968c = bxww.f165013b;

    /* renamed from: d */
    public bxww f148969d = bxww.f165013b;

    /* renamed from: e */
    public int f148970e;

    /* renamed from: f */
    public bxwc f148971f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f148972g = bxxn.f165040b;

    /* renamed from: h */
    public bxww f148973h = bxww.f165013b;

    /* renamed from: i */
    public bxwc f148974i = bxxn.f165040b;

    /* renamed from: j */
    public bxvt f148975j = bxvm.f164965b;

    /* renamed from: k */
    public bxvt f148976k = bxvm.f164965b;

    /* renamed from: l */
    public bxvt f148977l = bxvm.f164965b;

    static {
        btih btih = new btih();
        f148964m = btih;
        GeneratedMessageLite.m124024a(btih.class, btih);
    }

    private btih() {
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
            return GeneratedMessageLite.m124022a(f148964m, "\u0000\f\u0000\u0000\u0001\u000e\f\u0003\u0007\u0000\u0001\n\u0003\u001b\u00052\u00062\u0007\f\b\u001b\t\u001c\n2\u000bȚ\f'\r'\u000e'", new Object[]{"a", "b", bthy.class, "c", btie.f148962a, "d", btid.f148961a, "e", "f", bthy.class, "g", "h", btif.f148963a, "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new btih();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f148964m;
            }
            bxxk bxxk = f148965n;
            if (bxxk == null) {
                synchronized (btih.class) {
                    bxxk = f148965n;
                    if (bxxk == null) {
                        bxxk = new bxve(f148964m);
                        f148965n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
