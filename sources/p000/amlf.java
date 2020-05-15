package p000;

/* renamed from: amlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amlf extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final amlf f75170f;

    /* renamed from: g */
    private static volatile bxxk f75171g;

    /* renamed from: a */
    public int f75172a;

    /* renamed from: b */
    public int f75173b;

    /* renamed from: c */
    public int f75174c;

    /* renamed from: d */
    public int f75175d;

    /* renamed from: e */
    public int f75176e;

    static {
        amlf amlf = new amlf();
        f75170f = amlf;
        GeneratedMessageLite.m124024a(amlf.class, amlf);
    }

    private amlf() {
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
            return GeneratedMessageLite.m124022a(f75170f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", amld.f75168a, "c", amle.f75169a, "d", "e"});
        } else if (i2 == 3) {
            return new amlf();
        } else {
            if (i2 == 4) {
                return new bxvd(f75170f);
            }
            if (i2 == 5) {
                return f75170f;
            }
            bxxk bxxk = f75171g;
            if (bxxk == null) {
                synchronized (amlf.class) {
                    bxxk = f75171g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75170f);
                        f75171g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
