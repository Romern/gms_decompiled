package p000;

/* renamed from: abdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final abdd f57067e;

    /* renamed from: f */
    private static volatile bxxk f57068f;

    /* renamed from: a */
    public int f57069a;

    /* renamed from: b */
    public abde f57070b;

    /* renamed from: c */
    public bxwc f57071c = bxxn.f165040b;

    /* renamed from: d */
    public String f57072d = "";

    static {
        abdd abdd = new abdd();
        f57067e = abdd;
        bxvk.m124024a(abdd.class, abdd);
    }

    private abdd() {
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
            return bxvk.m124022a(f57067e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", "c", abdf.class, "d"});
        } else if (i2 == 3) {
            return new abdd();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f57067e;
            }
            bxxk bxxk = f57068f;
            if (bxxk == null) {
                synchronized (abdd.class) {
                    bxxk = f57068f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57067e);
                        f57068f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
