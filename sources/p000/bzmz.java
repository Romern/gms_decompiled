package p000;

/* renamed from: bzmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzmz f170684d;

    /* renamed from: e */
    private static volatile bxxk f170685e;

    /* renamed from: a */
    public int f170686a;

    /* renamed from: b */
    public bxwc f170687b = bxxn.f165040b;

    /* renamed from: c */
    public int f170688c;

    static {
        bzmz bzmz = new bzmz();
        f170684d = bzmz;
        bxvk.m124024a(bzmz.class, bzmz);
    }

    private bzmz() {
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
            return bxvk.m124022a(f170684d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"a", "b", bzly.class, "c", bzlj.f170539a});
        } else if (i2 == 3) {
            return new bzmz();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f170684d;
            }
            bxxk bxxk = f170685e;
            if (bxxk == null) {
                synchronized (bzmz.class) {
                    bxxk = f170685e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170684d);
                        f170685e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
