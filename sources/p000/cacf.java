package p000;

/* renamed from: cacf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cacf f172536e;

    /* renamed from: f */
    private static volatile bxxk f172537f;

    /* renamed from: a */
    public int f172538a;

    /* renamed from: b */
    public String f172539b = "";

    /* renamed from: c */
    public String f172540c = "";

    /* renamed from: d */
    public cabk f172541d;

    static {
        cacf cacf = new cacf();
        f172536e = cacf;
        GeneratedMessageLite.m124024a(cacf.class, cacf);
    }

    private cacf() {
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
            return GeneratedMessageLite.m124022a(f172536e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cacf();
        } else {
            if (i2 == 4) {
                return new bxvd(f172536e);
            }
            if (i2 == 5) {
                return f172536e;
            }
            bxxk bxxk = f172537f;
            if (bxxk == null) {
                synchronized (cacf.class) {
                    bxxk = f172537f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172536e);
                        f172537f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
