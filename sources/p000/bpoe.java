package p000;

/* renamed from: bpoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpoe extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpoe f138489e;

    /* renamed from: f */
    private static volatile bxxk f138490f;

    /* renamed from: a */
    public int f138491a;

    /* renamed from: b */
    public int f138492b;

    /* renamed from: c */
    public int f138493c;

    /* renamed from: d */
    public int f138494d;

    static {
        bpoe bpoe = new bpoe();
        f138489e = bpoe;
        bxvk.m124024a(bpoe.class, bpoe);
    }

    private bpoe() {
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
            return bxvk.m124022a(f138489e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpoe();
        } else {
            if (i2 == 4) {
                return new bxvd(f138489e);
            }
            if (i2 == 5) {
                return f138489e;
            }
            bxxk bxxk = f138490f;
            if (bxxk == null) {
                synchronized (bpoe.class) {
                    bxxk = f138490f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138489e);
                        f138490f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
