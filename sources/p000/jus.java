package p000;

/* renamed from: jus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jus extends bxvk implements bxxd {

    /* renamed from: h */
    public static final jus f23257h;

    /* renamed from: k */
    private static volatile bxxk f23258k;

    /* renamed from: a */
    public int f23259a;

    /* renamed from: b */
    public String f23260b = "";

    /* renamed from: c */
    public boolean f23261c;

    /* renamed from: d */
    public bzws f23262d;

    /* renamed from: e */
    public bzwt f23263e;

    /* renamed from: f */
    public bzww f23264f;

    /* renamed from: g */
    public bxwc f23265g = bxxn.f165040b;

    /* renamed from: i */
    private int f23266i;

    /* renamed from: j */
    private byte f23267j = 2;

    static {
        jus jus = new jus();
        f23257h = jus;
        bxvk.m124024a(jus.class, jus);
    }

    private jus() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m17350a(jus jus) {
        jus.f23259a |= 1;
        jus.f23266i = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f23267j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f23267j = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f23257h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\u0007\u001a", new Object[]{"a", "i", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new jus();
        } else {
            if (i2 == 4) {
                return new bxvd(f23257h);
            }
            if (i2 == 5) {
                return f23257h;
            }
            bxxk bxxk = f23258k;
            if (bxxk == null) {
                synchronized (jus.class) {
                    bxxk = f23258k;
                    if (bxxk == null) {
                        bxxk = new bxve(f23257h);
                        f23258k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
