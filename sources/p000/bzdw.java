package p000;

/* renamed from: bzdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzdw f169590d;

    /* renamed from: e */
    private static volatile bxxk f169591e;

    /* renamed from: a */
    public boolean f169592a;

    /* renamed from: b */
    public boolean f169593b;

    /* renamed from: c */
    public boolean f169594c;

    static {
        bzdw bzdw = new bzdw();
        f169590d = bzdw;
        bxvk.m124024a(bzdw.class, bzdw);
    }

    private bzdw() {
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
            return bxvk.m124022a(f169590d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzdw();
        } else {
            if (i2 == 4) {
                return new bxvd(f169590d);
            }
            if (i2 == 5) {
                return f169590d;
            }
            bxxk bxxk = f169591e;
            if (bxxk == null) {
                synchronized (bzdw.class) {
                    bxxk = f169591e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169590d);
                        f169591e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
