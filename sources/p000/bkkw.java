package p000;

/* renamed from: bkkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bkkw f124653f;

    /* renamed from: j */
    private static volatile bxxk f124654j;

    /* renamed from: a */
    public String f124655a = "";

    /* renamed from: b */
    public String f124656b = "";

    /* renamed from: c */
    public String f124657c = "";

    /* renamed from: d */
    public String f124658d = "";

    /* renamed from: e */
    public long f124659e;

    /* renamed from: g */
    private int f124660g;

    /* renamed from: h */
    private String f124661h = "";

    /* renamed from: i */
    private byte f124662i = 2;

    static {
        bkkw bkkw = new bkkw();
        f124653f = bkkw;
        GeneratedMessageLite.m124024a(bkkw.class, bkkw);
    }

    private bkkw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124662i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124662i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f124653f, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"g", "h", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bkkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f124653f);
            }
            if (i2 == 5) {
                return f124653f;
            }
            bxxk bxxk = f124654j;
            if (bxxk == null) {
                synchronized (bkkw.class) {
                    bxxk = f124654j;
                    if (bxxk == null) {
                        bxxk = new bxve(f124653f);
                        f124654j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
