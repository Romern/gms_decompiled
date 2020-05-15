package p000;

/* renamed from: btir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btir extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btir f149020h;

    /* renamed from: i */
    private static volatile bxxk f149021i;

    /* renamed from: a */
    public String f149022a = "";

    /* renamed from: b */
    public String f149023b = "";

    /* renamed from: c */
    public long f149024c;

    /* renamed from: d */
    public ByteString f149025d = ByteString.f164797b;

    /* renamed from: e */
    public boolean f149026e;

    /* renamed from: f */
    public bxwc f149027f = bxxn.f165040b;

    /* renamed from: g */
    public bxvt f149028g = bxvm.f164965b;

    static {
        btir btir = new btir();
        f149020h = btir;
        GeneratedMessageLite.m124024a(btir.class, btir);
    }

    private btir() {
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
            return GeneratedMessageLite.m124022a(f149020h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ț\u0005\n\u0006\u0007\u0007'", new Object[]{"a", "b", "c", "f", "d", "e", "g"});
        } else if (i2 == 3) {
            return new btir();
        } else {
            if (i2 == 4) {
                return new bxvd(f149020h);
            }
            if (i2 == 5) {
                return f149020h;
            }
            bxxk bxxk = f149021i;
            if (bxxk == null) {
                synchronized (btir.class) {
                    bxxk = f149021i;
                    if (bxxk == null) {
                        bxxk = new bxve(f149020h);
                        f149021i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
