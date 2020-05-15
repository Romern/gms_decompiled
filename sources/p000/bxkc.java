package p000;

/* renamed from: bxkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxkc f163705e;

    /* renamed from: g */
    private static volatile bxxk f163706g;

    /* renamed from: a */
    public bxjx f163707a;

    /* renamed from: b */
    public String f163708b = "";

    /* renamed from: c */
    public int f163709c;

    /* renamed from: d */
    public bxcm f163710d;

    /* renamed from: f */
    private int f163711f;

    static {
        bxkc bxkc = new bxkc();
        f163705e = bxkc;
        bxvk.m124024a(bxkc.class, bxkc);
    }

    private bxkc() {
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
            return bxvk.m124022a(f163705e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", bxka.f163704a, "d"});
        } else if (i2 == 3) {
            return new bxkc();
        } else {
            if (i2 == 4) {
                return new bxvd(f163705e);
            }
            if (i2 == 5) {
                return f163705e;
            }
            bxxk bxxk = f163706g;
            if (bxxk == null) {
                synchronized (bxkc.class) {
                    bxxk = f163706g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163705e);
                        f163706g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
