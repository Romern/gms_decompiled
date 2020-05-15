package p000;

/* renamed from: bpcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpcd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bpcd f135716b;

    /* renamed from: c */
    private static volatile bxxk f135717c;

    /* renamed from: a */
    public bxwc f135718a = bxxn.f165040b;

    static {
        bpcd bpcd = new bpcd();
        f135716b = bpcd;
        bxvk.m124024a(bpcd.class, bpcd);
    }

    private bpcd() {
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
            return bxvk.m124022a(f135716b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bpcc.class});
        } else if (i2 == 3) {
            return new bpcd();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f135716b;
            }
            bxxk bxxk = f135717c;
            if (bxxk == null) {
                synchronized (bpcd.class) {
                    bxxk = f135717c;
                    if (bxxk == null) {
                        bxxk = new bxve(f135716b);
                        f135717c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
