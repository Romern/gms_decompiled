package p000;

/* renamed from: bpsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpsa f138925c;

    /* renamed from: d */
    private static volatile bxxk f138926d;

    /* renamed from: a */
    public int f138927a;

    /* renamed from: b */
    public bpsb f138928b;

    static {
        bpsa bpsa = new bpsa();
        f138925c = bpsa;
        bxvk.m124024a(bpsa.class, bpsa);
    }

    private bpsa() {
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
            return bxvk.m124022a(f138925c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpsa();
        } else {
            if (i2 == 4) {
                return new bxvd(f138925c);
            }
            if (i2 == 5) {
                return f138925c;
            }
            bxxk bxxk = f138926d;
            if (bxxk == null) {
                synchronized (bpsa.class) {
                    bxxk = f138926d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138925c);
                        f138926d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
