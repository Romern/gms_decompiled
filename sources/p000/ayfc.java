package p000;

/* renamed from: ayfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfc extends bxvk implements bxxd {

    /* renamed from: k */
    public static final ayfc f97448k;

    /* renamed from: m */
    private static volatile bxxk f97449m;

    /* renamed from: a */
    public int f97450a;

    /* renamed from: b */
    public String f97451b = "";

    /* renamed from: c */
    public String f97452c = "";

    /* renamed from: d */
    public String f97453d = "";

    /* renamed from: e */
    public bxtx f97454e = bxtx.f164797b;

    /* renamed from: f */
    public long f97455f;

    /* renamed from: g */
    public boolean f97456g;

    /* renamed from: h */
    public String f97457h = "";

    /* renamed from: i */
    public bxwc f97458i = bxxn.f165040b;

    /* renamed from: j */
    public long f97459j;

    /* renamed from: l */
    private byte f97460l = 2;

    static {
        ayfc ayfc = new ayfc();
        f97448k = ayfc;
        bxvk.m124024a(ayfc.class, ayfc);
    }

    private ayfc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97460l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97460l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97448k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0004\u0001ᔈ\u0000\u0002ᔈ\u0002\u0004ည\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bЛ\tᔈ\u0001\nဂ\u0007", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", ayef.class, "c", "j"});
        } else if (i2 == 3) {
            return new ayfc();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f97448k;
            }
            bxxk bxxk = f97449m;
            if (bxxk == null) {
                synchronized (ayfc.class) {
                    bxxk = f97449m;
                    if (bxxk == null) {
                        bxxk = new bxve(f97448k);
                        f97449m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
