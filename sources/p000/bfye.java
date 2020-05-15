package p000;

/* renamed from: bfye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfye extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bfye f115663l;

    /* renamed from: m */
    private static volatile bxxk f115664m;

    /* renamed from: a */
    public int f115665a;

    /* renamed from: b */
    public int f115666b = 1;

    /* renamed from: c */
    public double f115667c;

    /* renamed from: d */
    public double f115668d;

    /* renamed from: e */
    public float f115669e;

    /* renamed from: f */
    public long f115670f;

    /* renamed from: g */
    public String f115671g = "";

    /* renamed from: h */
    public int f115672h;

    /* renamed from: i */
    public int f115673i;

    /* renamed from: j */
    public int f115674j = -1;

    /* renamed from: k */
    public int f115675k = 5;

    static {
        bfye bfye = new bfye();
        f115663l = bfye;
        GeneratedMessageLite.m124024a(bfye.class, bfye);
    }

    private bfye() {
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
            return GeneratedMessageLite.m124022a(f115663l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t", new Object[]{"a", "b", bfyk.f115695a, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bfye();
        } else {
            if (i2 == 4) {
                return new bxvd(f115663l);
            }
            if (i2 == 5) {
                return f115663l;
            }
            bxxk bxxk = f115664m;
            if (bxxk == null) {
                synchronized (bfye.class) {
                    bxxk = f115664m;
                    if (bxxk == null) {
                        bxxk = new bxve(f115663l);
                        f115664m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
