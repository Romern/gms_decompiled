package p000;

/* renamed from: bmlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmlv extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bmlv f129963p;

    /* renamed from: q */
    private static volatile bxxk f129964q;

    /* renamed from: a */
    public int f129965a;

    /* renamed from: b */
    public int f129966b = 0;

    /* renamed from: c */
    public Object f129967c;

    /* renamed from: d */
    public int f129968d;

    /* renamed from: e */
    public long f129969e;

    /* renamed from: f */
    public String f129970f = "";

    /* renamed from: g */
    public bmno f129971g;

    /* renamed from: h */
    public bmoq f129972h;

    /* renamed from: i */
    public bxvw f129973i = bxwq.f165002b;

    /* renamed from: j */
    public int f129974j = -1;

    /* renamed from: k */
    public int f129975k = -1;

    /* renamed from: l */
    public int f129976l;

    /* renamed from: m */
    public bmlh f129977m;

    /* renamed from: n */
    public bxwc f129978n = bxxn.f165040b;

    /* renamed from: o */
    public int f129979o;

    static {
        bmlv bmlv = new bmlv();
        f129963p = bmlv;
        bxvk.m124024a(bmlv.class, bmlv);
    }

    private bmlv() {
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
            return bxvk.m124022a(f129963p, "\u0001\u0010\u0001\u0001\u0001\u0014\u0010\u0000\u0002\u0000\u0001ဈ\u0006\u0002ဉ\u0007\u0003ဉ\b\u0005\u0014\u0007ဌ\u000b\bဌ\u0000\tင\t\nင\n\u000b\u001b\rဂ\u0005\u000eဉ\f\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0013ြ\u0000\u0014ဌ\r", new Object[]{"c", "b", "a", "f", "g", "h", "i", "l", bmqn.f130412a, "d", bmlt.f129962a, "j", "k", "n", bmlv.class, "e", "m", bmlp.class, bmlg.class, bmlk.class, bmls.class, "o", bmla.f129910a});
        } else if (i2 == 3) {
            return new bmlv();
        } else {
            if (i2 == 4) {
                return new bxvd(f129963p);
            }
            if (i2 == 5) {
                return f129963p;
            }
            bxxk bxxk = f129964q;
            if (bxxk == null) {
                synchronized (bmlv.class) {
                    bxxk = f129964q;
                    if (bxxk == null) {
                        bxxk = new bxve(f129963p);
                        f129964q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
