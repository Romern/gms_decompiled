package p000;

/* renamed from: bmss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmss extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bmss f130743a;

    /* renamed from: b */
    private static volatile bxxk f130744b;

    static {
        bmss bmss = new bmss();
        f130743a = bmss;
        GeneratedMessageLite.m124024a(bmss.class, bmss);
    }

    private bmss() {
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
            return GeneratedMessageLite.m124022a(f130743a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bmss();
        }
        if (i2 == 4) {
            return new bxvd(f130743a);
        }
        if (i2 == 5) {
            return f130743a;
        }
        bxxk bxxk = f130744b;
        if (bxxk == null) {
            synchronized (bmss.class) {
                bxxk = f130744b;
                if (bxxk == null) {
                    bxxk = new bxve(f130743a);
                    f130744b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
