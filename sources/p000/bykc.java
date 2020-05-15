package p000;

/* renamed from: bykc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bykc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bykc f166732e;

    /* renamed from: f */
    private static volatile bxxk f166733f;

    /* renamed from: a */
    public int f166734a;

    /* renamed from: b */
    public byjj f166735b;

    /* renamed from: c */
    public byhd f166736c;

    /* renamed from: d */
    public bxwc f166737d = bxxn.f165040b;

    static {
        bykc bykc = new bykc();
        f166732e = bykc;
        bxvk.m124024a(bykc.class, bykc);
    }

    private bykc() {
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
            return bxvk.m124022a(f166732e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0004ဉ\u0002\u0005\u001b", new Object[]{"a", "b", "c", "d", bykb.class});
        } else if (i2 == 3) {
            return new bykc();
        } else {
            if (i2 == 4) {
                return new bxvd(f166732e);
            }
            if (i2 == 5) {
                return f166732e;
            }
            bxxk bxxk = f166733f;
            if (bxxk == null) {
                synchronized (bykc.class) {
                    bxxk = f166733f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166732e);
                        f166733f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
