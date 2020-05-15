package p000;

/* renamed from: bvlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvlw extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bvlw f156604h;

    /* renamed from: i */
    private static volatile bxxk f156605i;

    /* renamed from: a */
    public int f156606a;

    /* renamed from: b */
    public String f156607b = "";

    /* renamed from: c */
    public String f156608c = "";

    /* renamed from: d */
    public String f156609d = "";

    /* renamed from: e */
    public int f156610e;

    /* renamed from: f */
    public int f156611f;

    /* renamed from: g */
    public long f156612g;

    static {
        bvlw bvlw = new bvlw();
        f156604h = bvlw;
        GeneratedMessageLite.m124024a(bvlw.class, bvlw);
    }

    private bvlw() {
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
            return GeneratedMessageLite.m124022a(f156604h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006စ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bvlw();
        } else {
            if (i2 == 4) {
                return new bxvd(f156604h);
            }
            if (i2 == 5) {
                return f156604h;
            }
            bxxk bxxk = f156605i;
            if (bxxk == null) {
                synchronized (bvlw.class) {
                    bxxk = f156605i;
                    if (bxxk == null) {
                        bxxk = new bxve(f156604h);
                        f156605i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
