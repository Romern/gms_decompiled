package p000;

/* renamed from: btiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btiv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btiv f149041b;

    /* renamed from: c */
    private static volatile bxxk f149042c;

    /* renamed from: a */
    public boolean f149043a;

    static {
        btiv btiv = new btiv();
        f149041b = btiv;
        GeneratedMessageLite.m124024a(btiv.class, btiv);
    }

    private btiv() {
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
            return GeneratedMessageLite.m124022a(f149041b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0007", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btiv();
        } else {
            if (i2 == 4) {
                return new bxvd(f149041b);
            }
            if (i2 == 5) {
                return f149041b;
            }
            bxxk bxxk = f149042c;
            if (bxxk == null) {
                synchronized (btiv.class) {
                    bxxk = f149042c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149041b);
                        f149042c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
