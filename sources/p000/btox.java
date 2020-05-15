package p000;

/* renamed from: btox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btox extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btox f149815b;

    /* renamed from: c */
    private static volatile bxxk f149816c;

    /* renamed from: a */
    public String f149817a = "";

    static {
        btox btox = new btox();
        f149815b = btox;
        GeneratedMessageLite.m124024a(btox.class, btox);
    }

    private btox() {
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
            return GeneratedMessageLite.m124022a(f149815b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btox();
        } else {
            if (i2 == 4) {
                return new bxvd(f149815b);
            }
            if (i2 == 5) {
                return f149815b;
            }
            bxxk bxxk = f149816c;
            if (bxxk == null) {
                synchronized (btox.class) {
                    bxxk = f149816c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149815b);
                        f149816c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
