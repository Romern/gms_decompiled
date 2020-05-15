package p000;

/* renamed from: biup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biup extends bxvk implements bxxd {

    /* renamed from: w */
    public static final biup f121833w;

    /* renamed from: y */
    private static volatile bxxk f121834y;

    /* renamed from: a */
    public bxwc f121835a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f121836b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f121837c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f121838d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f121839e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f121840f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f121841g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f121842h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f121843i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f121844j = bxxn.f165040b;

    /* renamed from: k */
    public bxwc f121845k = bxxn.f165040b;

    /* renamed from: l */
    public bxwc f121846l = bxxn.f165040b;

    /* renamed from: m */
    public bxwc f121847m = bxxn.f165040b;

    /* renamed from: n */
    public bxwc f121848n = bxxn.f165040b;

    /* renamed from: o */
    public bxwc f121849o = bxxn.f165040b;

    /* renamed from: p */
    public bxwc f121850p = bxxn.f165040b;

    /* renamed from: q */
    public bxwc f121851q = bxxn.f165040b;

    /* renamed from: r */
    public bxwc f121852r = bxxn.f165040b;

    /* renamed from: s */
    public bxwc f121853s = bxxn.f165040b;

    /* renamed from: t */
    public bxwc f121854t = bxxn.f165040b;

    /* renamed from: u */
    public bxwc f121855u = bxxn.f165040b;

    /* renamed from: v */
    public bxwc f121856v = bxxn.f165040b;

    /* renamed from: x */
    private byte f121857x = 2;

    static {
        biup biup = new biup();
        f121833w = biup;
        bxvk.m124024a(biup.class, biup);
    }

    private biup() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121857x);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121857x = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121833w, "\u0001\u0016\u0000\u0000\u0001\u0016\u0016\u0000\u0016\n\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006\u001b\u0007Л\bЛ\t\u001b\n\u001b\u000b\u001b\f\u001b\rЛ\u000e\u001b\u000f\u001b\u0010\u001b\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u001b\u0015Л\u0016Л", new Object[]{"a", birs.class, "b", bipr.class, "c", bivg.class, "d", biuj.class, "e", bitg.class, "f", biqi.class, "g", bith.class, "h", biqn.class, "i", bipy.class, "j", bitf.class, "k", biqd.class, "l", bira.class, "m", biqc.class, "n", bipx.class, "o", biti.class, "p", bipz.class, "q", birq.class, "r", bivo.class, "s", biol.class, "t", biqv.class, "u", biqu.class, "v", bivp.class});
        } else if (i2 == 3) {
            return new biup();
        } else {
            if (i2 == 4) {
                return new bxvd(f121833w);
            }
            if (i2 == 5) {
                return f121833w;
            }
            bxxk bxxk = f121834y;
            if (bxxk == null) {
                synchronized (biup.class) {
                    bxxk = f121834y;
                    if (bxxk == null) {
                        bxxk = new bxve(f121833w);
                        f121834y = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
