package p000;

/* renamed from: btkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkk extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btkk f149266b;

    /* renamed from: c */
    private static volatile bxxk f149267c;

    /* renamed from: a */
    public String f149268a = "";

    static {
        btkk btkk = new btkk();
        f149266b = btkk;
        GeneratedMessageLite.m124024a(btkk.class, btkk);
    }

    private btkk() {
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
            return GeneratedMessageLite.m124022a(f149266b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btkk();
        } else {
            if (i2 == 4) {
                return new bxvd(f149266b);
            }
            if (i2 == 5) {
                return f149266b;
            }
            bxxk bxxk = f149267c;
            if (bxxk == null) {
                synchronized (btkk.class) {
                    bxxk = f149267c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149266b);
                        f149267c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
