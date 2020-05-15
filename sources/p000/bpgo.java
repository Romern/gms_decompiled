package p000;

/* renamed from: bpgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpgo f137518c;

    /* renamed from: d */
    private static volatile bxxk f137519d;

    /* renamed from: a */
    public int f137520a;

    /* renamed from: b */
    public int f137521b;

    static {
        bpgo bpgo = new bpgo();
        f137518c = bpgo;
        bxvk.m124024a(bpgo.class, bpgo);
    }

    private bpgo() {
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
            return bxvk.m124022a(f137518c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpgo();
        } else {
            if (i2 == 4) {
                return new bxvd(f137518c);
            }
            if (i2 == 5) {
                return f137518c;
            }
            bxxk bxxk = f137519d;
            if (bxxk == null) {
                synchronized (bpgo.class) {
                    bxxk = f137519d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137518c);
                        f137519d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
