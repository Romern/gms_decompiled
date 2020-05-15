package p000;

/* renamed from: byzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzi extends bxvg implements bxvh {

    /* renamed from: x */
    public static final byzi f169083x;

    /* renamed from: z */
    private static volatile bxxk f169084z;

    /* renamed from: a */
    public int f169085a;

    /* renamed from: b */
    public int f169086b;

    /* renamed from: c */
    public String f169087c = "";

    /* renamed from: d */
    public String f169088d = "";

    /* renamed from: e */
    public String f169089e = "";

    /* renamed from: f */
    public String f169090f = "";

    /* renamed from: g */
    public ByteString f169091g = ByteString.f164797b;

    /* renamed from: h */
    public String f169092h = "";

    /* renamed from: i */
    public String f169093i = "";

    /* renamed from: j */
    public int f169094j;

    /* renamed from: k */
    public bxwc f169095k = bxxn.f165040b;

    /* renamed from: l */
    public String f169096l = "";

    /* renamed from: n */
    public String f169097n = "";

    /* renamed from: o */
    public byzj f169098o;

    /* renamed from: p */
    public long f169099p;

    /* renamed from: q */
    public int f169100q;

    /* renamed from: r */
    public float f169101r;

    /* renamed from: s */
    public String f169102s = "";

    /* renamed from: t */
    public String f169103t = "";

    /* renamed from: u */
    public String f169104u = "";

    /* renamed from: v */
    public ByteString f169105v = ByteString.f164797b;

    /* renamed from: w */
    public byzb f169106w;

    /* renamed from: y */
    private byte f169107y = 2;

    static {
        byzi byzi = new byzi();
        f169083x = byzi;
        GeneratedMessageLite.m124024a(byzi.class, byzi);
    }

    private byzi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169107y);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169107y = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f169083x, "\u0001\u0015\u0000\u0001\u0001\u001c\u0015\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ဈ\u0006\tဈ\u0007\u000bဌ\t\u000fဈ\n\u0010ဈ\u000b\u0011ဉ\f\u0012ဂ\r\u0013ဌ\u000e\u0014ခ\u000f\u0015ဈ\u0010\u0017ဈ\u0012\u0018\u001b\u001aဈ\u0014\u001bည\u0015\u001cဉ\u0016", new Object[]{"a", "b", bzbk.m125616b(), "c", "d", "e", "f", "g", "h", "i", "j", bzbn.f169260a, "l", "n", "o", "p", "q", bzar.m125590b(), "r", "s", "t", "k", byzm.class, "u", "v", "w"});
        } else if (i2 == 3) {
            return new byzi();
        } else {
            if (i2 == 4) {
                return new bxvf(f169083x);
            }
            if (i2 == 5) {
                return f169083x;
            }
            bxxk bxxk = f169084z;
            if (bxxk == null) {
                synchronized (byzi.class) {
                    bxxk = f169084z;
                    if (bxxk == null) {
                        bxxk = new bxve(f169083x);
                        f169084z = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
