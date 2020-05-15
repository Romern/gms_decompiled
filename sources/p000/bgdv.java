package p000;

/* renamed from: bgdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdv extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bgdv f116182b;

    /* renamed from: c */
    private static volatile bxxk f116183c;

    /* renamed from: a */
    public bxvw f116184a = bxwq.f165002b;

    static {
        bgdv bgdv = new bgdv();
        f116182b = bgdv;
        bxvk.m124024a(bgdv.class, bgdv);
    }

    private bgdv() {
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
            return bxvk.m124022a(f116182b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bgdv();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f116182b;
            }
            bxxk bxxk = f116183c;
            if (bxxk == null) {
                synchronized (bgdv.class) {
                    bxxk = f116183c;
                    if (bxxk == null) {
                        bxxk = new bxve(f116182b);
                        f116183c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
