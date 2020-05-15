package p000;

/* renamed from: kde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kde extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final kde f23857h;

    /* renamed from: i */
    private static volatile bxxk f23858i;

    /* renamed from: a */
    public int f23859a;

    /* renamed from: b */
    public String f23860b = "";

    /* renamed from: c */
    public String f23861c = "";

    /* renamed from: d */
    public String f23862d = "";

    /* renamed from: e */
    public String f23863e = "";

    /* renamed from: f */
    public bzru f23864f;

    /* renamed from: g */
    public int f23865g;

    static {
        kde kde = new kde();
        f23857h = kde;
        GeneratedMessageLite.m124024a(kde.class, kde);
    }

    private kde() {
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
            return GeneratedMessageLite.m124022a(f23857h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\bင\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new kde();
        } else {
            if (i2 == 4) {
                return new bxvd(f23857h);
            }
            if (i2 == 5) {
                return f23857h;
            }
            bxxk bxxk = f23858i;
            if (bxxk == null) {
                synchronized (kde.class) {
                    bxxk = f23858i;
                    if (bxxk == null) {
                        bxxk = new bxve(f23857h);
                        f23858i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
