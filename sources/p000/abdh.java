package p000;

/* renamed from: abdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdh extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final abdh f57087a;

    /* renamed from: b */
    private static volatile bxxk f57088b;

    static {
        abdh abdh = new abdh();
        f57087a = abdh;
        GeneratedMessageLite.m124024a(abdh.class, abdh);
    }

    private abdh() {
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
            return GeneratedMessageLite.m124022a(f57087a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdh();
        }
        if (i2 == 4) {
            return new bxvd(f57087a);
        }
        if (i2 == 5) {
            return f57087a;
        }
        bxxk bxxk = f57088b;
        if (bxxk == null) {
            synchronized (abdh.class) {
                bxxk = f57088b;
                if (bxxk == null) {
                    bxxk = new bxve(f57087a);
                    f57088b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
