package p000;

/* renamed from: bpcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcs extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bpcs f135833p;

    /* renamed from: q */
    private static volatile bxxk f135834q;

    /* renamed from: a */
    public int f135835a;

    /* renamed from: b */
    public String f135836b = "";

    /* renamed from: c */
    public String f135837c = "";

    /* renamed from: d */
    public String f135838d = "";

    /* renamed from: e */
    public String f135839e = "";

    /* renamed from: f */
    public String f135840f = "";

    /* renamed from: g */
    public String f135841g = "";

    /* renamed from: h */
    public String f135842h = "";

    /* renamed from: i */
    public int f135843i;

    /* renamed from: j */
    public int f135844j;

    /* renamed from: k */
    public String f135845k = "";

    /* renamed from: l */
    public int f135846l;

    /* renamed from: m */
    public bxvt f135847m = bxvm.f164965b;

    /* renamed from: n */
    public bxvt f135848n = bxvm.f164965b;

    /* renamed from: o */
    public bxvt f135849o = bxvm.f164965b;

    static {
        bpcs bpcs = new bpcs();
        f135833p = bpcs;
        bxvk.m124024a(bpcs.class, bpcs);
    }

    private bpcs() {
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
            return bxvk.m124022a(f135833p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\nင\t\u000bင\n\fဈ\u000b\rင\f\u000e\u0016\u000f\u0016\u0010\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new bpcs();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f135833p;
            }
            bxxk bxxk = f135834q;
            if (bxxk == null) {
                synchronized (bpcs.class) {
                    bxxk = f135834q;
                    if (bxxk == null) {
                        bxxk = new bxve(f135833p);
                        f135834q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
