package p000;

/* renamed from: bxlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxlm f163859c;

    /* renamed from: d */
    private static volatile bxxk f163860d;

    /* renamed from: a */
    public bxwc f163861a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f163862b = bxxn.f165040b;

    static {
        bxlm bxlm = new bxlm();
        f163859c = bxlm;
        bxvk.m124024a(bxlm.class, bxlm);
    }

    private bxlm() {
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
            return bxvk.m124022a(f163859c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bxkz.class, "b", bxlc.class});
        } else if (i2 == 3) {
            return new bxlm();
        } else {
            if (i2 == 4) {
                return new bxvd(f163859c);
            }
            if (i2 == 5) {
                return f163859c;
            }
            bxxk bxxk = f163860d;
            if (bxxk == null) {
                synchronized (bxlm.class) {
                    bxxk = f163860d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163859c);
                        f163860d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
