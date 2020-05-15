package p000;

/* renamed from: btpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpl extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btpl f149858a;

    /* renamed from: b */
    private static volatile bxxk f149859b;

    static {
        btpl btpl = new btpl();
        f149858a = btpl;
        GeneratedMessageLite.m124024a(btpl.class, btpl);
    }

    private btpl() {
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
            return GeneratedMessageLite.m124022a(f149858a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btpl();
        }
        if (i2 == 4) {
            return new bxvd(f149858a);
        }
        if (i2 == 5) {
            return f149858a;
        }
        bxxk bxxk = f149859b;
        if (bxxk == null) {
            synchronized (btpl.class) {
                bxxk = f149859b;
                if (bxxk == null) {
                    bxxk = new bxve(f149858a);
                    f149859b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
