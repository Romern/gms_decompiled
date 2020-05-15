package p000;

/* renamed from: cbnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnt extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnt f177759a;

    /* renamed from: b */
    private static volatile bxxk f177760b;

    static {
        cbnt cbnt = new cbnt();
        f177759a = cbnt;
        GeneratedMessageLite.m124024a(cbnt.class, cbnt);
    }

    private cbnt() {
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
            return GeneratedMessageLite.m124022a(f177759a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnt();
        }
        if (i2 == 4) {
            return new bxvd(f177759a);
        }
        if (i2 == 5) {
            return f177759a;
        }
        bxxk bxxk = f177760b;
        if (bxxk == null) {
            synchronized (cbnt.class) {
                bxxk = f177760b;
                if (bxxk == null) {
                    bxxk = new bxve(f177759a);
                    f177760b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
