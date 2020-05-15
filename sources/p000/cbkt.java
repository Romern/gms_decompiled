package p000;

/* renamed from: cbkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkt extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbkt f177445a;

    /* renamed from: b */
    private static volatile bxxk f177446b;

    static {
        cbkt cbkt = new cbkt();
        f177445a = cbkt;
        GeneratedMessageLite.m124024a(cbkt.class, cbkt);
    }

    private cbkt() {
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
            return GeneratedMessageLite.m124022a(f177445a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbkt();
        }
        if (i2 == 4) {
            return new bxvd(f177445a);
        }
        if (i2 == 5) {
            return f177445a;
        }
        bxxk bxxk = f177446b;
        if (bxxk == null) {
            synchronized (cbkt.class) {
                bxxk = f177446b;
                if (bxxk == null) {
                    bxxk = new bxve(f177445a);
                    f177446b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
