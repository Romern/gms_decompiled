package p000;

/* renamed from: bzha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzha extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzha f170012b;

    /* renamed from: d */
    private static volatile bxxk f170013d;

    /* renamed from: a */
    public String f170014a = "";

    /* renamed from: c */
    private int f170015c;

    static {
        bzha bzha = new bzha();
        f170012b = bzha;
        bxvk.m124024a(bzha.class, bzha);
    }

    private bzha() {
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
            return bxvk.m124022a(f170012b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzha();
        } else {
            if (i2 == 4) {
                return new bxvd(f170012b);
            }
            if (i2 == 5) {
                return f170012b;
            }
            bxxk bxxk = f170013d;
            if (bxxk == null) {
                synchronized (bzha.class) {
                    bxxk = f170013d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170012b);
                        f170013d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
