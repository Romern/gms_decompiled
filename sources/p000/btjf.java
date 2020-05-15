package p000;

/* renamed from: btjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btjf f149105c;

    /* renamed from: d */
    private static volatile bxxk f149106d;

    /* renamed from: a */
    public bxtx f149107a = bxtx.f164797b;

    /* renamed from: b */
    public btjm f149108b;

    static {
        btjf btjf = new btjf();
        f149105c = btjf;
        bxvk.m124024a(btjf.class, btjf);
    }

    private btjf() {
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
            return bxvk.m124022a(f149105c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\n\u0003\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btjf();
        } else {
            if (i2 == 4) {
                return new bxvd(f149105c);
            }
            if (i2 == 5) {
                return f149105c;
            }
            bxxk bxxk = f149106d;
            if (bxxk == null) {
                synchronized (btjf.class) {
                    bxxk = f149106d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149105c);
                        f149106d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
