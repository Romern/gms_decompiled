package p000;

/* renamed from: cafr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cafr f172953d;

    /* renamed from: e */
    private static volatile bxxk f172954e;

    /* renamed from: a */
    public int f172955a;

    /* renamed from: b */
    public String f172956b = "";

    /* renamed from: c */
    public cafu f172957c;

    static {
        cafr cafr = new cafr();
        f172953d = cafr;
        bxvk.m124024a(cafr.class, cafr);
    }

    private cafr() {
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
            return bxvk.m124022a(f172953d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cafr();
        } else {
            if (i2 == 4) {
                return new bxvd(f172953d);
            }
            if (i2 == 5) {
                return f172953d;
            }
            bxxk bxxk = f172954e;
            if (bxxk == null) {
                synchronized (cafr.class) {
                    bxxk = f172954e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172953d);
                        f172954e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
