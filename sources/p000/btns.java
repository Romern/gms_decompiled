package p000;

/* renamed from: btns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btns extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btns f149681a;

    /* renamed from: b */
    private static volatile bxxk f149682b;

    static {
        btns btns = new btns();
        f149681a = btns;
        GeneratedMessageLite.m124024a(btns.class, btns);
    }

    private btns() {
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
            return GeneratedMessageLite.m124022a(f149681a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btns();
        }
        if (i2 == 4) {
            return new bxvd(f149681a);
        }
        if (i2 == 5) {
            return f149681a;
        }
        bxxk bxxk = f149682b;
        if (bxxk == null) {
            synchronized (btns.class) {
                bxxk = f149682b;
                if (bxxk == null) {
                    bxxk = new bxve(f149681a);
                    f149682b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
