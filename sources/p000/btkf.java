package p000;

/* renamed from: btkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btkf f149247b;

    /* renamed from: c */
    private static volatile bxxk f149248c;

    /* renamed from: a */
    public String f149249a = "";

    static {
        btkf btkf = new btkf();
        f149247b = btkf;
        bxvk.m124024a(btkf.class, btkf);
    }

    private btkf() {
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
            return bxvk.m124022a(f149247b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btkf();
        } else {
            if (i2 == 4) {
                return new bxvd(f149247b);
            }
            if (i2 == 5) {
                return f149247b;
            }
            bxxk bxxk = f149248c;
            if (bxxk == null) {
                synchronized (btkf.class) {
                    bxxk = f149248c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149247b);
                        f149248c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
