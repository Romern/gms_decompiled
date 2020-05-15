package p000;

/* renamed from: blmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmp extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final blmp f126864r;

    /* renamed from: t */
    private static volatile bxxk f126865t;

    /* renamed from: a */
    public int f126866a;

    /* renamed from: b */
    public String f126867b = "";

    /* renamed from: c */
    public String f126868c = "";

    /* renamed from: d */
    public String f126869d = "";

    /* renamed from: e */
    public String f126870e = "";

    /* renamed from: f */
    public String f126871f = "";

    /* renamed from: g */
    public bxwc f126872g = bxxn.f165040b;

    /* renamed from: h */
    public String f126873h = "";

    /* renamed from: i */
    public int f126874i;

    /* renamed from: j */
    public String f126875j = "";

    /* renamed from: k */
    public long f126876k;

    /* renamed from: l */
    public int f126877l;

    /* renamed from: m */
    public long f126878m;

    /* renamed from: n */
    public long f126879n;

    /* renamed from: o */
    public ByteString f126880o = ByteString.f164797b;

    /* renamed from: p */
    public boolean f126881p;

    /* renamed from: q */
    public int f126882q;

    /* renamed from: s */
    private byte f126883s = 2;

    static {
        blmp blmp = new blmp();
        f126864r = blmp;
        GeneratedMessageLite.m124024a(blmp.class, blmp);
    }

    private blmp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126883s);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126883s = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126864r, "\u0001\u0010\u0000\u0001\u0002\u001d\u0010\u0000\u0001\u0003\u0002ဈ\u0001\u0003ᔈ\u0002\u0004ဈ\u0003\u0005ᔈ\u0004\u0006ဈ\u0005\u0007Л\tဈ\u0007\u000bင\t\rဈ\u000b\u0010ဂ\u000e\u0011င\u000f\u0012ဂ\u0010\u0014ဂ\u0012\u0015ည\u0013\u0018ဇ\u0016\u001dင\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", blmi.class, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        } else if (i2 == 3) {
            return new blmp();
        } else {
            if (i2 == 4) {
                return new blmo();
            }
            if (i2 == 5) {
                return f126864r;
            }
            bxxk bxxk = f126865t;
            if (bxxk == null) {
                synchronized (blmp.class) {
                    bxxk = f126865t;
                    if (bxxk == null) {
                        bxxk = new bxve(f126864r);
                        f126865t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
