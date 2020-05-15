package p000;

/* renamed from: bipk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bipk f121175a;

    /* renamed from: b */
    private static volatile bxxk f121176b;

    static {
        bipk bipk = new bipk();
        f121175a = bipk;
        GeneratedMessageLite.m124024a(bipk.class, bipk);
    }

    private bipk() {
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
            return GeneratedMessageLite.m124022a(f121175a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bipk();
        }
        if (i2 == 4) {
            return new bxvd(f121175a);
        }
        if (i2 == 5) {
            return f121175a;
        }
        bxxk bxxk = f121176b;
        if (bxxk == null) {
            synchronized (bipk.class) {
                bxxk = f121176b;
                if (bxxk == null) {
                    bxxk = new bxve(f121175a);
                    f121176b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
