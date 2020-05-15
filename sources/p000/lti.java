package p000;

/* renamed from: lti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lti extends bxvk implements bxxd {

    /* renamed from: e */
    public static final lti f32933e;

    /* renamed from: h */
    private static volatile bxxk f32934h;

    /* renamed from: a */
    public String f32935a = "";

    /* renamed from: b */
    public int f32936b;

    /* renamed from: c */
    public int f32937c;

    /* renamed from: d */
    public long f32938d;

    /* renamed from: f */
    private int f32939f;

    /* renamed from: g */
    private byte f32940g = 2;

    static {
        lti lti = new lti();
        f32933e = lti;
        bxvk.m124024a(lti.class, lti);
    }

    private lti() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f32940g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f32940g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f32933e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဃ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new lti();
        } else {
            if (i2 == 4) {
                return new bxvd(f32933e);
            }
            if (i2 == 5) {
                return f32933e;
            }
            bxxk bxxk = f32934h;
            if (bxxk == null) {
                synchronized (lti.class) {
                    bxxk = f32934h;
                    if (bxxk == null) {
                        bxxk = new bxve(f32933e);
                        f32934h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
