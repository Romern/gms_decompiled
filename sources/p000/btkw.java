package p000;

/* renamed from: btkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btkw f149320b;

    /* renamed from: c */
    private static volatile bxxk f149321c;

    /* renamed from: a */
    public String f149322a = "";

    static {
        btkw btkw = new btkw();
        f149320b = btkw;
        bxvk.m124024a(btkw.class, btkw);
    }

    private btkw() {
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
            return bxvk.m124022a(f149320b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btkw();
        } else {
            if (i2 == 4) {
                return new bxvd(f149320b);
            }
            if (i2 == 5) {
                return f149320b;
            }
            bxxk bxxk = f149321c;
            if (bxxk == null) {
                synchronized (btkw.class) {
                    bxxk = f149321c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149320b);
                        f149321c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
