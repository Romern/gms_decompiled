package p000;

/* renamed from: blny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blny extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final blny f127043k;

    /* renamed from: m */
    private static volatile bxxk f127044m;

    /* renamed from: a */
    public int f127045a;

    /* renamed from: b */
    public double f127046b;

    /* renamed from: c */
    public double f127047c;

    /* renamed from: d */
    public String f127048d = "";

    /* renamed from: e */
    public int f127049e;

    /* renamed from: f */
    public int f127050f = 1;

    /* renamed from: g */
    public bsak f127051g;

    /* renamed from: h */
    public String f127052h = "";

    /* renamed from: i */
    public blnj f127053i;

    /* renamed from: j */
    public blnz f127054j;

    /* renamed from: l */
    private byte f127055l = 2;

    static {
        blny blny = new blny();
        f127043k = blny;
        GeneratedMessageLite.m124024a(blny.class, blny);
    }

    private blny() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127055l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127055l = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127043k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006\bဉ\b\tဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", blnw.f127042a, "g", "h", "j", "i"});
        } else if (i2 == 3) {
            return new blny();
        } else {
            if (i2 == 4) {
                return new bxvd(f127043k);
            }
            if (i2 == 5) {
                return f127043k;
            }
            bxxk bxxk = f127044m;
            if (bxxk == null) {
                synchronized (blny.class) {
                    bxxk = f127044m;
                    if (bxxk == null) {
                        bxxk = new bxve(f127043k);
                        f127044m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
