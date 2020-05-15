package p000;

/* renamed from: bypb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bypb extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bxvu f167288k = new bypa();

    /* renamed from: p */
    public static final bypb f167289p;

    /* renamed from: q */
    private static volatile bxxk f167290q;

    /* renamed from: a */
    public int f167291a;

    /* renamed from: b */
    public long f167292b;

    /* renamed from: c */
    public int f167293c;

    /* renamed from: d */
    public String f167294d = "";

    /* renamed from: e */
    public byny f167295e;

    /* renamed from: f */
    public int f167296f;

    /* renamed from: g */
    public int f167297g;

    /* renamed from: h */
    public int f167298h = -1;

    /* renamed from: i */
    public long f167299i;

    /* renamed from: j */
    public bxvt f167300j = bxvm.f164965b;

    /* renamed from: l */
    public byoa f167301l;

    /* renamed from: m */
    public byog f167302m;

    /* renamed from: n */
    public byog f167303n;

    /* renamed from: o */
    public ByteString f167304o = ByteString.f164797b;

    static {
        bypb bypb = new bypb();
        f167289p = bypb;
        GeneratedMessageLite.m124024a(bypb.class, bypb);
    }

    private bypb() {
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
            return GeneratedMessageLite.m124022a(f167289p, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0001\u0000\u0001စ\u0000\u0002ဌ\u0001\u0003ဉ\n\u0004ဈ\u0002\u0006ဉ\u000b\u0007ဌ\u0005\nဌ\u0007\u000bဂ\b\f\u001e\u000eည\u000e\u000fဌ\u0006\u0010ဉ\f\u0011ဉ\u0004", new Object[]{"a", "b", "c", byoi.f167215a, "l", "d", "m", "f", byod.m125021b(), "h", byol.f167220a, "i", "j", byox.m125046b(), "o", "g", byod.m125021b(), "n", "e"});
        } else if (i2 == 3) {
            return new bypb();
        } else {
            if (i2 == 4) {
                return new bxvd(f167289p);
            }
            if (i2 == 5) {
                return f167289p;
            }
            bxxk bxxk = f167290q;
            if (bxxk == null) {
                synchronized (bypb.class) {
                    bxxk = f167290q;
                    if (bxxk == null) {
                        bxxk = new bxve(f167289p);
                        f167290q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
