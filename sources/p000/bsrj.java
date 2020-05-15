package p000;

/* renamed from: bsrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsrj f146768c;

    /* renamed from: d */
    private static volatile bxxk f146769d;

    /* renamed from: a */
    public int f146770a;

    /* renamed from: b */
    public bssl f146771b;

    static {
        bsrj bsrj = new bsrj();
        f146768c = bsrj;
        bxvk.m124024a(bsrj.class, bsrj);
    }

    private bsrj() {
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
            return bxvk.m124022a(f146768c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsrj();
        } else {
            if (i2 == 4) {
                return new bxvd(f146768c);
            }
            if (i2 == 5) {
                return f146768c;
            }
            bxxk bxxk = f146769d;
            if (bxxk == null) {
                synchronized (bsrj.class) {
                    bxxk = f146769d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146768c);
                        f146769d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
