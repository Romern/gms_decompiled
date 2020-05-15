package p000;

/* renamed from: bwrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwrf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwrf f160754e;

    /* renamed from: f */
    public static final bxvj f160755f;

    /* renamed from: h */
    private static volatile bxxk f160756h;

    /* renamed from: a */
    public int f160757a;

    /* renamed from: b */
    public int f160758b = 0;

    /* renamed from: c */
    public Object f160759c;

    /* renamed from: d */
    public int f160760d;

    /* renamed from: g */
    private byte f160761g = 2;

    static {
        bwrf bwrf = new bwrf();
        f160754e = bwrf;
        bxvk.m124024a(bwrf.class, bwrf);
        bwoq bwoq = bwoq.f160480d;
        bwrf bwrf2 = f160754e;
        f160755f = bxvk.m124006a(bwoq, bwrf2, bwrf2, 233780160, bxzf.MESSAGE);
    }

    private bwrf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160761g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160761g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160754e, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"c", "b", "a", "d", bwrd.f160753a, bwrk.class, bwrc.class, bwrg.class, bwrl.class, bwqz.class, bwqy.class, bwrm.class, bwrh.class});
        } else if (i2 == 3) {
            return new bwrf();
        } else {
            if (i2 == 4) {
                return new bxvd(f160754e);
            }
            if (i2 == 5) {
                return f160754e;
            }
            bxxk bxxk = f160756h;
            if (bxxk == null) {
                synchronized (bwrf.class) {
                    bxxk = f160756h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160754e);
                        f160756h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
