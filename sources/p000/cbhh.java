package p000;

/* renamed from: cbhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhh extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbhh f177131a;

    /* renamed from: b */
    private static volatile bxxk f177132b;

    static {
        cbhh cbhh = new cbhh();
        f177131a = cbhh;
        GeneratedMessageLite.m124024a(cbhh.class, cbhh);
    }

    private cbhh() {
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
            return GeneratedMessageLite.m124022a(f177131a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbhh();
        }
        if (i2 == 4) {
            return new bxvd(f177131a);
        }
        if (i2 == 5) {
            return f177131a;
        }
        bxxk bxxk = f177132b;
        if (bxxk == null) {
            synchronized (cbhh.class) {
                bxxk = f177132b;
                if (bxxk == null) {
                    bxxk = new bxve(f177131a);
                    f177132b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
