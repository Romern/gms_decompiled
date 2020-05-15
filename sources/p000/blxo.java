package p000;

/* renamed from: blxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxo extends bxvk implements bxxd {

    /* renamed from: k */
    public static final blxo f128095k;

    /* renamed from: m */
    private static volatile bxxk f128096m;

    /* renamed from: a */
    public int f128097a;

    /* renamed from: b */
    public int f128098b = 0;

    /* renamed from: c */
    public Object f128099c;

    /* renamed from: d */
    public String f128100d = "";

    /* renamed from: e */
    public bmnr f128101e;

    /* renamed from: f */
    public bxwc f128102f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f128103g = bxxn.f165040b;

    /* renamed from: h */
    public bmlz f128104h;

    /* renamed from: i */
    public bmkw f128105i;

    /* renamed from: j */
    public bmdj f128106j;

    /* renamed from: l */
    private byte f128107l = 2;

    static {
        blxo blxo = new blxo();
        f128095k = blxo;
        bxvk.m124024a(blxo.class, blxo);
    }

    private blxo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f128107l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f128107l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f128095k, "\u0001\t\u0001\u0001\u0001\u0011\t\u0000\u0002\u0003\u0001ဈ\u0000\u0002ဉ\u0002\u0005ᐼ\u0000\u0006ြ\u0000\n\u001b\u000bဉ\u0007\r\u001b\u0010ᐉ\b\u0011ᐉ\t", new Object[]{"c", "b", "a", "d", "e", bmgn.class, bmfs.class, "g", bmjf.class, "h", "f", bmdb.class, "i", "j"});
        } else if (i2 == 3) {
            return new blxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f128095k);
            }
            if (i2 == 5) {
                return f128095k;
            }
            bxxk bxxk = f128096m;
            if (bxxk == null) {
                synchronized (blxo.class) {
                    bxxk = f128096m;
                    if (bxxk == null) {
                        bxxk = new bxve(f128095k);
                        f128096m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
