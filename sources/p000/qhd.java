package p000;

/* renamed from: qhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhd extends bxvk implements bxxd {

    /* renamed from: A */
    private static volatile bxxk f41285A;

    /* renamed from: y */
    public static final qhd f41286y;

    /* renamed from: a */
    public int f41287a;

    /* renamed from: b */
    public int f41288b;

    /* renamed from: c */
    public int f41289c;

    /* renamed from: d */
    public int f41290d;

    /* renamed from: e */
    public int f41291e;

    /* renamed from: f */
    public int f41292f;

    /* renamed from: g */
    public boolean f41293g;

    /* renamed from: h */
    public boolean f41294h;

    /* renamed from: i */
    public int f41295i;

    /* renamed from: j */
    public int f41296j;

    /* renamed from: k */
    public int f41297k;

    /* renamed from: l */
    public int f41298l;

    /* renamed from: m */
    public bxwc f41299m = bxxn.f165040b;

    /* renamed from: n */
    public bxwc f41300n = bxxn.f165040b;

    /* renamed from: o */
    public bxwc f41301o = bxxn.f165040b;

    /* renamed from: p */
    public bxwc f41302p = bxxn.f165040b;

    /* renamed from: q */
    public bxwc f41303q = bxxn.f165040b;

    /* renamed from: r */
    public bxwc f41304r = bxxn.f165040b;

    /* renamed from: s */
    public int f41305s;

    /* renamed from: t */
    public boolean f41306t;

    /* renamed from: u */
    public long f41307u;

    /* renamed from: v */
    public int f41308v;

    /* renamed from: w */
    public boolean f41309w;

    /* renamed from: x */
    public String f41310x = "";

    /* renamed from: z */
    private byte f41311z = 2;

    static {
        qhd qhd = new qhd();
        f41286y = qhd;
        bxvk.m124024a(qhd.class, qhd);
    }

    private qhd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41311z);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41311z = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f41286y, "\u0001\u0017\u0000\u0001\u0001\u001e\u0017\u0000\u0006\b\u0001ᔌ\u0000\u0002ᔌ\u0001\u0003ᔌ\u0002\u0004ᔌ\u0003\u0005ᔇ\u0005\u0006ᔇ\u0006\u0007ᔄ\u0007\bᔄ\n\t\u001a\n\u001a\u000b\u001a\fင\b\rင\t\u000e\u001a\u000f\u001a\u0012င\f\u0013ဇ\r\u0014ဂ\u000e\u0015င\u000f\u001a\u001b\u001cဇ\u0010\u001dဈ\u0011\u001eဌ\u0004", new Object[]{"a", "b", qhc.f41284a, "c", qgz.f41281a, "d", qha.f41282a, "e", qhb.f41283a, "g", "h", "i", "l", "m", "n", "p", "j", "k", "q", "r", "s", "t", "u", "v", "o", qhe.class, "w", "x", "f", qhb.f41283a});
        } else if (i2 == 3) {
            return new qhd();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f41286y;
            }
            bxxk bxxk = f41285A;
            if (bxxk == null) {
                synchronized (qhd.class) {
                    bxxk = f41285A;
                    if (bxxk == null) {
                        bxxk = new bxve(f41286y);
                        f41285A = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
