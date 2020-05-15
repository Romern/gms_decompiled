package p000;

/* renamed from: btoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btoz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final btoz f149820a;

    /* renamed from: b */
    private static volatile bxxk f149821b;

    static {
        btoz btoz = new btoz();
        f149820a = btoz;
        GeneratedMessageLite.m124024a(btoz.class, btoz);
    }

    private btoz() {
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
            return GeneratedMessageLite.m124022a(f149820a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btoz();
        }
        if (i2 == 4) {
            return new bxvd(f149820a);
        }
        if (i2 == 5) {
            return f149820a;
        }
        bxxk bxxk = f149821b;
        if (bxxk == null) {
            synchronized (btoz.class) {
                bxxk = f149821b;
                if (bxxk == null) {
                    bxxk = new bxve(f149820a);
                    f149821b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
