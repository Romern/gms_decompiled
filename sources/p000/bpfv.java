package p000;

/* renamed from: bpfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpfv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpfv f137445d;

    /* renamed from: e */
    private static volatile bxxk f137446e;

    /* renamed from: a */
    public int f137447a;

    /* renamed from: b */
    public int f137448b;

    /* renamed from: c */
    public int f137449c;

    static {
        bpfv bpfv = new bpfv();
        f137445d = bpfv;
        bxvk.m124024a(bpfv.class, bpfv);
    }

    private bpfv() {
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
            return bxvk.m124022a(f137445d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpfv();
        } else {
            if (i2 == 4) {
                return new bxvd(f137445d);
            }
            if (i2 == 5) {
                return f137445d;
            }
            bxxk bxxk = f137446e;
            if (bxxk == null) {
                synchronized (bpfv.class) {
                    bxxk = f137446e;
                    if (bxxk == null) {
                        bxxk = new bxve(f137445d);
                        f137446e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
