package p000;

/* renamed from: budv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final budv f153524d;

    /* renamed from: f */
    private static volatile bxxk f153525f;

    /* renamed from: a */
    public long f153526a;

    /* renamed from: b */
    public bxvs f153527b = bxuz.f164939b;

    /* renamed from: c */
    public String f153528c = "";

    /* renamed from: e */
    private int f153529e;

    static {
        budv budv = new budv();
        f153524d = budv;
        bxvk.m124024a(budv.class, budv);
    }

    private budv() {
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
            return bxvk.m124022a(f153524d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဃ\u0000\u0002\u0013\u0003ဈ\u0001", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new budv();
        } else {
            if (i2 == 4) {
                return new bxvd(f153524d);
            }
            if (i2 == 5) {
                return f153524d;
            }
            bxxk bxxk = f153525f;
            if (bxxk == null) {
                synchronized (budv.class) {
                    bxxk = f153525f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153524d);
                        f153525f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
