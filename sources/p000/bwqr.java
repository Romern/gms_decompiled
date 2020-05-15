package p000;

/* renamed from: bwqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwqr f160711c;

    /* renamed from: d */
    public static final bxvj f160712d;

    /* renamed from: f */
    private static volatile bxxk f160713f;

    /* renamed from: a */
    public bxwc f160714a = bxxn.f165040b;

    /* renamed from: b */
    public boolean f160715b;

    /* renamed from: e */
    private int f160716e;

    static {
        bwqr bwqr = new bwqr();
        f160711c = bwqr;
        bxvk.m124024a(bwqr.class, bwqr);
        bwny bwny = bwny.f160414k;
        bwqr bwqr2 = f160711c;
        f160712d = bxvk.m124006a(bwny, bwqr2, bwqr2, 280016706, bxzf.MESSAGE);
    }

    private bwqr() {
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
            return bxvk.m124022a(f160711c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001a\u0004ဇ\u0002", new Object[]{"e", "a", "b"});
        } else if (i2 == 3) {
            return new bwqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f160711c);
            }
            if (i2 == 5) {
                return f160711c;
            }
            bxxk bxxk = f160713f;
            if (bxxk == null) {
                synchronized (bwqr.class) {
                    bxxk = f160713f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160711c);
                        f160713f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
