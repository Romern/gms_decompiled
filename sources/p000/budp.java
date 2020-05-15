package p000;

/* renamed from: budp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final budp f153498c;

    /* renamed from: e */
    private static volatile bxxk f153499e;

    /* renamed from: a */
    public long f153500a;

    /* renamed from: b */
    public boolean f153501b;

    /* renamed from: d */
    private int f153502d;

    static {
        budp budp = new budp();
        f153498c = budp;
        bxvk.m124024a(budp.class, budp);
    }

    private budp() {
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
            return bxvk.m124022a(f153498c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new budp();
        } else {
            if (i2 == 4) {
                return new bxvd(f153498c);
            }
            if (i2 == 5) {
                return f153498c;
            }
            bxxk bxxk = f153499e;
            if (bxxk == null) {
                synchronized (budp.class) {
                    bxxk = f153499e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153498c);
                        f153499e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
