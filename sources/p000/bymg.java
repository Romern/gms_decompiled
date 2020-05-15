package p000;

/* renamed from: bymg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bymg f167020b;

    /* renamed from: c */
    private static volatile bxxk f167021c;

    /* renamed from: a */
    public bxwc f167022a = bxxn.f165040b;

    static {
        bymg bymg = new bymg();
        f167020b = bymg;
        bxvk.m124024a(bymg.class, bymg);
    }

    private bymg() {
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
            return bxvk.m124022a(f167020b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bymf.class});
        } else if (i2 == 3) {
            return new bymg();
        } else {
            if (i2 == 4) {
                return new bxvd(f167020b);
            }
            if (i2 == 5) {
                return f167020b;
            }
            bxxk bxxk = f167021c;
            if (bxxk == null) {
                synchronized (bymg.class) {
                    bxxk = f167021c;
                    if (bxxk == null) {
                        bxxk = new bxve(f167020b);
                        f167021c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
