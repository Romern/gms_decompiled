package p000;

/* renamed from: byos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byos extends bxvk implements bxxd {

    /* renamed from: A */
    private static volatile bxxk f167242A;

    /* renamed from: z */
    public static final byos f167243z;

    /* renamed from: a */
    public int f167244a;

    /* renamed from: b */
    public String f167245b = "";

    /* renamed from: c */
    public String f167246c = "";

    /* renamed from: d */
    public String f167247d = "";

    /* renamed from: e */
    public String f167248e = "";

    /* renamed from: f */
    public String f167249f = "";

    /* renamed from: g */
    public String f167250g = "";

    /* renamed from: h */
    public String f167251h = "";

    /* renamed from: i */
    public String f167252i = "";

    /* renamed from: j */
    public String f167253j = "";

    /* renamed from: k */
    public String f167254k = "";

    /* renamed from: l */
    public String f167255l = "";

    /* renamed from: m */
    public String f167256m = "";

    /* renamed from: n */
    public String f167257n = "";

    /* renamed from: o */
    public String f167258o = "";

    /* renamed from: p */
    public String f167259p = "";

    /* renamed from: q */
    public String f167260q = "";

    /* renamed from: r */
    public String f167261r = "";

    /* renamed from: s */
    public String f167262s = "";

    /* renamed from: t */
    public String f167263t = "";

    /* renamed from: u */
    public String f167264u = "";

    /* renamed from: v */
    public String f167265v = "";

    /* renamed from: w */
    public String f167266w = "";

    /* renamed from: x */
    public String f167267x = "";

    /* renamed from: y */
    public String f167268y = "";

    static {
        byos byos = new byos();
        f167243z = byos;
        bxvk.m124024a(byos.class, byos);
    }

    private byos() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f167243z, "\u0001\u0018\u0000\u0001\u0001\u001e\u0018\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003\u0007ဈ\u0004\bဈ\u0005\tဈ\u0006\nဈ\u0007\u000bဈ\b\fဈ\t\rဈ\n\u000eဈ\u000b\u000fဈ\f\u0011ဈ\u000e\u0012ဈ\u000f\u0013ဈ\u0010\u0014ဈ\u0011\u0015ဈ\u0012\u0016ဈ\u0013\u0017ဈ\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဈ\u0017\u001eဈ\u0018", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"});
        } else if (i2 == 3) {
            return new byos();
        } else {
            if (i2 == 4) {
                return new bxvd(f167243z);
            }
            if (i2 == 5) {
                return f167243z;
            }
            bxxk bxxk = f167242A;
            if (bxxk == null) {
                synchronized (byos.class) {
                    bxxk = f167242A;
                    if (bxxk == null) {
                        bxxk = new bxve(f167243z);
                        f167242A = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
