package p000;

/* renamed from: abtz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abtz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final abtz f58330a;

    /* renamed from: b */
    private static volatile bxxk f58331b;

    static {
        abtz abtz = new abtz();
        f58330a = abtz;
        GeneratedMessageLite.m124024a(abtz.class, abtz);
    }

    private abtz() {
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
            return GeneratedMessageLite.m124022a(f58330a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abtz();
        }
        if (i2 == 4) {
            return new bxvd(f58330a);
        }
        if (i2 == 5) {
            return f58330a;
        }
        bxxk bxxk = f58331b;
        if (bxxk == null) {
            synchronized (abtz.class) {
                bxxk = f58331b;
                if (bxxk == null) {
                    bxxk = new bxve(f58330a);
                    f58331b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
