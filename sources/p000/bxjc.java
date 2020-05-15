package p000;

/* renamed from: bxjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjc extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bxjc f163605j;

    /* renamed from: k */
    private static volatile bxxk f163606k;

    /* renamed from: a */
    public int f163607a;

    /* renamed from: b */
    public bxho f163608b;

    /* renamed from: c */
    public bxho f163609c;

    /* renamed from: d */
    public long f163610d;

    /* renamed from: e */
    public String f163611e = "";

    /* renamed from: f */
    public bxhs f163612f;

    /* renamed from: g */
    public bxik f163613g;

    /* renamed from: h */
    public bxho f163614h;

    /* renamed from: i */
    public String f163615i = "";

    static {
        bxjc bxjc = new bxjc();
        f163605j = bxjc;
        GeneratedMessageLite.m124024a(bxjc.class, bxjc);
    }

    private bxjc() {
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
            return GeneratedMessageLite.m124022a(f163605j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bxjc();
        } else {
            if (i2 == 4) {
                return new bxvd(f163605j);
            }
            if (i2 == 5) {
                return f163605j;
            }
            bxxk bxxk = f163606k;
            if (bxxk == null) {
                synchronized (bxjc.class) {
                    bxxk = f163606k;
                    if (bxxk == null) {
                        bxxk = new bxve(f163605j);
                        f163606k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
