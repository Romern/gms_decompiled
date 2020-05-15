package p000;

/* renamed from: bzwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzwz f171704e;

    /* renamed from: f */
    private static volatile bxxk f171705f;

    /* renamed from: a */
    public int f171706a;

    /* renamed from: b */
    public bsab f171707b;

    /* renamed from: c */
    public bzwv f171708c;

    /* renamed from: d */
    public bxwc f171709d = bxxn.f165040b;

    static {
        bzwz bzwz = new bzwz();
        f171704e = bzwz;
        bxvk.m124024a(bzwz.class, bzwz);
    }

    private bzwz() {
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
            return bxvk.m124022a(f171704e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", bzxa.class});
        } else if (i2 == 3) {
            return new bzwz();
        } else {
            if (i2 == 4) {
                return new bxvd(f171704e);
            }
            if (i2 == 5) {
                return f171704e;
            }
            bxxk bxxk = f171705f;
            if (bxxk == null) {
                synchronized (bzwz.class) {
                    bxxk = f171705f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171704e);
                        f171705f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
