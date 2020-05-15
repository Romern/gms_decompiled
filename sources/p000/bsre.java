package p000;

/* renamed from: bsre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsre extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsre f146739d;

    /* renamed from: e */
    private static volatile bxxk f146740e;

    /* renamed from: a */
    public int f146741a;

    /* renamed from: b */
    public int f146742b;

    /* renamed from: c */
    public bsrc f146743c;

    static {
        bsre bsre = new bsre();
        f146739d = bsre;
        GeneratedMessageLite.m124024a(bsre.class, bsre);
    }

    private bsre() {
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
            return GeneratedMessageLite.m124022a(f146739d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bsrd.f146738a, "c"});
        } else if (i2 == 3) {
            return new bsre();
        } else {
            if (i2 == 4) {
                return new bxvd(f146739d);
            }
            if (i2 == 5) {
                return f146739d;
            }
            bxxk bxxk = f146740e;
            if (bxxk == null) {
                synchronized (bsre.class) {
                    bxxk = f146740e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146739d);
                        f146740e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
