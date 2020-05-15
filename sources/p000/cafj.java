package p000;

/* renamed from: cafj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafj extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cafj f172913e;

    /* renamed from: f */
    private static volatile bxxk f172914f;

    /* renamed from: a */
    public int f172915a;

    /* renamed from: b */
    public String f172916b = "";

    /* renamed from: c */
    public String f172917c = "";

    /* renamed from: d */
    public long f172918d;

    static {
        cafj cafj = new cafj();
        f172913e = cafj;
        GeneratedMessageLite.m124024a(cafj.class, cafj);
    }

    private cafj() {
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
            return GeneratedMessageLite.m124022a(f172913e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cafj();
        } else {
            if (i2 == 4) {
                return new bxvd(f172913e);
            }
            if (i2 == 5) {
                return f172913e;
            }
            bxxk bxxk = f172914f;
            if (bxxk == null) {
                synchronized (cafj.class) {
                    bxxk = f172914f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172913e);
                        f172914f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
