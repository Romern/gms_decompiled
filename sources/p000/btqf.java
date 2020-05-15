package p000;

/* renamed from: btqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btqf f149930b;

    /* renamed from: c */
    private static volatile bxxk f149931c;

    /* renamed from: a */
    public int f149932a;

    static {
        btqf btqf = new btqf();
        f149930b = btqf;
        bxvk.m124024a(btqf.class, btqf);
    }

    private btqf() {
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
            return bxvk.m124022a(f149930b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btqf();
        } else {
            if (i2 == 4) {
                return new bxvd(f149930b);
            }
            if (i2 == 5) {
                return f149930b;
            }
            bxxk bxxk = f149931c;
            if (bxxk == null) {
                synchronized (btqf.class) {
                    bxxk = f149931c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149930b);
                        f149931c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
