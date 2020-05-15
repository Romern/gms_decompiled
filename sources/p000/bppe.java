package p000;

/* renamed from: bppe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppe extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bppe f138605d;

    /* renamed from: e */
    private static volatile bxxk f138606e;

    /* renamed from: a */
    public int f138607a;

    /* renamed from: b */
    public int f138608b;

    /* renamed from: c */
    public int f138609c;

    static {
        bppe bppe = new bppe();
        f138605d = bppe;
        GeneratedMessageLite.m124024a(bppe.class, bppe);
    }

    private bppe() {
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
            return GeneratedMessageLite.m124022a(f138605d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bppe();
        } else {
            if (i2 == 4) {
                return new bxvd(f138605d);
            }
            if (i2 == 5) {
                return f138605d;
            }
            bxxk bxxk = f138606e;
            if (bxxk == null) {
                synchronized (bppe.class) {
                    bxxk = f138606e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138605d);
                        f138606e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
