package p000;

/* renamed from: bojv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojv extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bojv f133355f;

    /* renamed from: g */
    private static volatile bxxk f133356g;

    /* renamed from: a */
    public int f133357a;

    /* renamed from: b */
    public String f133358b = "";

    /* renamed from: c */
    public String f133359c = "";

    /* renamed from: d */
    public int f133360d;

    /* renamed from: e */
    public bxwc f133361e = bxxn.f165040b;

    static {
        bojv bojv = new bojv();
        f133355f = bojv;
        GeneratedMessageLite.m124024a(bojv.class, bojv);
    }

    private bojv() {
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
            return GeneratedMessageLite.m124022a(f133355f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", bojw.class});
        } else if (i2 == 3) {
            return new bojv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f133355f;
            }
            bxxk bxxk = f133356g;
            if (bxxk == null) {
                synchronized (bojv.class) {
                    bxxk = f133356g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133355f);
                        f133356g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
