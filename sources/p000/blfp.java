package p000;

/* renamed from: blfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final blfp f126399b;

    /* renamed from: c */
    private static volatile bxxk f126400c;

    /* renamed from: a */
    public bxwc f126401a = bxxn.f165040b;

    static {
        blfp blfp = new blfp();
        f126399b = blfp;
        bxvk.m124024a(blfp.class, blfp);
    }

    private blfp() {
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
            return bxvk.m124022a(f126399b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", blfn.class});
        } else if (i2 == 3) {
            return new blfp();
        } else {
            if (i2 == 4) {
                return new blfo();
            }
            if (i2 == 5) {
                return f126399b;
            }
            bxxk bxxk = f126400c;
            if (bxxk == null) {
                synchronized (blfp.class) {
                    bxxk = f126400c;
                    if (bxxk == null) {
                        bxxk = new bxve(f126399b);
                        f126400c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
