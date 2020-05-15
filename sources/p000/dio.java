package p000;

/* renamed from: dio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dio extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final dio f13248e;

    /* renamed from: f */
    private static volatile bxxk f13249f;

    /* renamed from: a */
    public int f13250a;

    /* renamed from: b */
    public String f13251b = "";

    /* renamed from: c */
    public int f13252c;

    /* renamed from: d */
    public int f13253d;

    static {
        dio dio = new dio();
        f13248e = dio;
        GeneratedMessageLite.m124024a(dio.class, dio);
    }

    private dio() {
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
            return GeneratedMessageLite.m124022a(f13248e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new dio();
        } else {
            if (i2 == 4) {
                return new bxvd(f13248e);
            }
            if (i2 == 5) {
                return f13248e;
            }
            bxxk bxxk = f13249f;
            if (bxxk == null) {
                synchronized (dio.class) {
                    bxxk = f13249f;
                    if (bxxk == null) {
                        bxxk = new bxve(f13248e);
                        f13249f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
