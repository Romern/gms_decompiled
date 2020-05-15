package p000;

/* renamed from: btay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btay extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxvu f148055d = new btax();

    /* renamed from: p */
    public static final btay f148056p;

    /* renamed from: q */
    private static volatile bxxk f148057q;

    /* renamed from: a */
    public long f148058a;

    /* renamed from: b */
    public long f148059b;

    /* renamed from: c */
    public bxvt f148060c = bxvm.f164965b;

    /* renamed from: e */
    public long f148061e;

    /* renamed from: f */
    public long f148062f;

    /* renamed from: g */
    public String f148063g = "";

    /* renamed from: h */
    public int f148064h;

    /* renamed from: i */
    public String f148065i = "";

    /* renamed from: j */
    public bxwc f148066j = bxxn.f165040b;

    /* renamed from: k */
    public int f148067k;

    /* renamed from: l */
    public String f148068l = "";

    /* renamed from: m */
    public int f148069m;

    /* renamed from: n */
    public String f148070n = "";

    /* renamed from: o */
    public String f148071o = "";

    static {
        btay btay = new btay();
        f148056p = btay;
        bxvk.m124024a(btay.class, btay);
    }

    private btay() {
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
            return bxvk.m124022a(f148056p, "\u0000\u000e\u0000\u0000\u0001\u0015\u000e\u0000\u0002\u0000\u0001\u0002\u0002\u0002\u0003,\u0005\u0002\u0006\u0002\u0007Ȉ\b\f\nȈ\u000b\u001b\u000f\f\u0010Ȉ\u0012\f\u0013Ȉ\u0015Ȉ", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", bszt.class, "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new btay();
        } else {
            if (i2 == 4) {
                return new bxvd(f148056p);
            }
            if (i2 == 5) {
                return f148056p;
            }
            bxxk bxxk = f148057q;
            if (bxxk == null) {
                synchronized (btay.class) {
                    bxxk = f148057q;
                    if (bxxk == null) {
                        bxxk = new bxve(f148056p);
                        f148057q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
