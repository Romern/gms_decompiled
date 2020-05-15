package p000;

/* renamed from: ayjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjv extends bxvk implements bxxd {

    /* renamed from: p */
    public static final ayjv f97777p;

    /* renamed from: r */
    private static volatile bxxk f97778r;

    /* renamed from: a */
    public int f97779a;

    /* renamed from: b */
    public bxtx f97780b = bxtx.f164797b;

    /* renamed from: c */
    public String f97781c = "";

    /* renamed from: d */
    public double f97782d;

    /* renamed from: e */
    public float f97783e;

    /* renamed from: f */
    public long f97784f;

    /* renamed from: g */
    public int f97785g;

    /* renamed from: h */
    public int f97786h;

    /* renamed from: i */
    public boolean f97787i;

    /* renamed from: j */
    public bxwc f97788j = bxxn.f165040b;

    /* renamed from: k */
    public bxwc f97789k = bxxn.f165040b;

    /* renamed from: l */
    public bxwc f97790l = bxxn.f165040b;

    /* renamed from: m */
    public bxvw f97791m = bxwq.f165002b;

    /* renamed from: n */
    public bxvs f97792n = bxuz.f164939b;

    /* renamed from: o */
    public long f97793o;

    /* renamed from: q */
    private byte f97794q = 2;

    static {
        ayjv ayjv = new ayjv();
        f97777p = ayjv;
        bxvk.m124024a(ayjv.class, ayjv);
    }

    private ayjv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97794q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97794q = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97777p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", ayjx.class, "k", ayjw.class, "l", "m", "o", "n"});
        } else if (i2 == 3) {
            return new ayjv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f97777p;
            }
            bxxk bxxk = f97778r;
            if (bxxk == null) {
                synchronized (ayjv.class) {
                    bxxk = f97778r;
                    if (bxxk == null) {
                        bxxk = new bxve(f97777p);
                        f97778r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
