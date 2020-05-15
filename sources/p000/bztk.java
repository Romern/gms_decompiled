package p000;

/* renamed from: bztk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bztk f171338c;

    /* renamed from: d */
    private static volatile bxxk f171339d;

    /* renamed from: a */
    public String f171340a = "";

    /* renamed from: b */
    public String f171341b = "";

    static {
        bztk bztk = new bztk();
        f171338c = bztk;
        GeneratedMessageLite.m124024a(bztk.class, bztk);
    }

    private bztk() {
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
            return GeneratedMessageLite.m124022a(f171338c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bztk();
        } else {
            if (i2 == 4) {
                return new bxvd(f171338c);
            }
            if (i2 == 5) {
                return f171338c;
            }
            bxxk bxxk = f171339d;
            if (bxxk == null) {
                synchronized (bztk.class) {
                    bxxk = f171339d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171338c);
                        f171339d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
