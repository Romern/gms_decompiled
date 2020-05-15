package p000;

/* renamed from: bwdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwdp f158910d;

    /* renamed from: e */
    private static volatile bxxk f158911e;

    /* renamed from: a */
    public int f158912a;

    /* renamed from: b */
    public bxwc f158913b = bxxn.f165040b;

    /* renamed from: c */
    public int f158914c;

    static {
        bwdp bwdp = new bwdp();
        f158910d = bwdp;
        bxvk.m124024a(bwdp.class, bwdp);
    }

    private bwdp() {
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
            return bxvk.m124022a(f158910d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"a", "b", bwdm.class, "c", bwdn.f158909a});
        } else if (i2 == 3) {
            return new bwdp();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f158910d;
            }
            bxxk bxxk = f158911e;
            if (bxxk == null) {
                synchronized (bwdp.class) {
                    bxxk = f158911e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158910d);
                        f158911e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
