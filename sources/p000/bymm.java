package p000;

/* renamed from: bymm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bymm f167036c;

    /* renamed from: d */
    private static volatile bxxk f167037d;

    /* renamed from: a */
    public int f167038a;

    /* renamed from: b */
    public bxtx f167039b = bxtx.f164797b;

    static {
        bymm bymm = new bymm();
        f167036c = bymm;
        bxvk.m124024a(bymm.class, bymm);
    }

    private bymm() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f167036c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bymm();
        } else {
            if (i2 == 4) {
                return new bxvd(f167036c);
            }
            if (i2 == 5) {
                return f167036c;
            }
            bxxk bxxk = f167037d;
            if (bxxk == null) {
                synchronized (bymm.class) {
                    bxxk = f167037d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167036c);
                        f167037d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
