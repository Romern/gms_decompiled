package p000;

/* renamed from: amnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnh extends bxvk implements bxxd {

    /* renamed from: f */
    public static final amnh f75472f;

    /* renamed from: g */
    private static volatile bxxk f75473g;

    /* renamed from: a */
    public int f75474a;

    /* renamed from: b */
    public int f75475b;

    /* renamed from: c */
    public int f75476c;

    /* renamed from: d */
    public int f75477d;

    /* renamed from: e */
    public int f75478e;

    static {
        amnh amnh = new amnh();
        f75472f = amnh;
        bxvk.m124024a(amnh.class, amnh);
    }

    private amnh() {
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
            return bxvk.m124022a(f75472f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new amnh();
        } else {
            if (i2 == 4) {
                return new bxvd(f75472f);
            }
            if (i2 == 5) {
                return f75472f;
            }
            bxxk bxxk = f75473g;
            if (bxxk == null) {
                synchronized (amnh.class) {
                    bxxk = f75473g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75472f);
                        f75473g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
