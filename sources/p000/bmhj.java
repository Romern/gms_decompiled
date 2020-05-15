package p000;

/* renamed from: bmhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhj extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bmhj f129426h;

    /* renamed from: i */
    private static volatile bxxk f129427i;

    /* renamed from: a */
    public int f129428a;

    /* renamed from: b */
    public String f129429b = "";

    /* renamed from: c */
    public ByteString f129430c = ByteString.f164797b;

    /* renamed from: d */
    public String f129431d = "";

    /* renamed from: e */
    public bxwc f129432e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f129433f = bxxn.f165040b;

    /* renamed from: g */
    public ByteString f129434g = ByteString.f164797b;

    static {
        bmhj bmhj = new bmhj();
        f129426h = bmhj;
        GeneratedMessageLite.m124024a(bmhj.class, bmhj);
    }

    private bmhj() {
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
            return GeneratedMessageLite.m124022a(f129426h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0005\u001b\u0006\u001b\u0007ည\u0003", new Object[]{"a", "b", "c", "d", "e", bmhl.class, "f", bmik.class, "g"});
        } else if (i2 == 3) {
            return new bmhj();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f129426h;
            }
            bxxk bxxk = f129427i;
            if (bxxk == null) {
                synchronized (bmhj.class) {
                    bxxk = f129427i;
                    if (bxxk == null) {
                        bxxk = new bxve(f129426h);
                        f129427i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo66792b() {
        if (!this.f129433f.mo73666a()) {
            this.f129433f = GeneratedMessageLite.m124021a(this.f129433f);
        }
    }

    /* renamed from: a */
    public final void mo66791a() {
        if (!this.f129432e.mo73666a()) {
            this.f129432e = GeneratedMessageLite.m124021a(this.f129432e);
        }
    }
}
