package p000;

/* renamed from: btoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btoi extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btoi f149761a;

    /* renamed from: b */
    private static volatile bxxk f149762b;

    static {
        btoi btoi = new btoi();
        f149761a = btoi;
        GeneratedMessageLite.m124024a(btoi.class, btoi);
    }

    private btoi() {
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
            return GeneratedMessageLite.m124022a(f149761a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btoi();
        }
        if (i2 == 4) {
            return new bxvd(f149761a);
        }
        if (i2 == 5) {
            return f149761a;
        }
        bxxk bxxk = f149762b;
        if (bxxk == null) {
            synchronized (btoi.class) {
                bxxk = f149762b;
                if (bxxk == null) {
                    bxxk = new bxve(f149761a);
                    f149762b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
