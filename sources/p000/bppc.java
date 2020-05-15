package p000;

/* renamed from: bppc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bppc f138600c;

    /* renamed from: d */
    private static volatile bxxk f138601d;

    /* renamed from: a */
    public int f138602a;

    /* renamed from: b */
    public int f138603b;

    static {
        bppc bppc = new bppc();
        f138600c = bppc;
        bxvk.m124024a(bppc.class, bppc);
    }

    private bppc() {
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
            return bxvk.m124022a(f138600c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bppc();
        } else {
            if (i2 == 4) {
                return new bxvd(f138600c);
            }
            if (i2 == 5) {
                return f138600c;
            }
            bxxk bxxk = f138601d;
            if (bxxk == null) {
                synchronized (bppc.class) {
                    bxxk = f138601d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138600c);
                        f138601d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
