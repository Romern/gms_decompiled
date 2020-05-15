package p000;

/* renamed from: afbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbf extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final afbf f64124h;

    /* renamed from: i */
    private static volatile bxxk f64125i;

    /* renamed from: a */
    public int f64126a;

    /* renamed from: b */
    public int f64127b;

    /* renamed from: c */
    public String f64128c = "";

    /* renamed from: d */
    public int f64129d;

    /* renamed from: e */
    public afbp f64130e;

    /* renamed from: f */
    public boolean f64131f;

    /* renamed from: g */
    public boolean f64132g;

    static {
        afbf afbf = new afbf();
        f64124h = afbf;
        GeneratedMessageLite.m124024a(afbf.class, afbf);
    }

    private afbf() {
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
            return GeneratedMessageLite.m124022a(f64124h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new afbf();
        } else {
            if (i2 == 4) {
                return new bxvd(f64124h);
            }
            if (i2 == 5) {
                return f64124h;
            }
            bxxk bxxk = f64125i;
            if (bxxk == null) {
                synchronized (afbf.class) {
                    bxxk = f64125i;
                    if (bxxk == null) {
                        bxxk = new bxve(f64124h);
                        f64125i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
