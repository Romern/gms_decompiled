package p000;

/* renamed from: bufx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bufx f153757a;

    /* renamed from: b */
    private static volatile bxxk f153758b;

    static {
        bufx bufx = new bufx();
        f153757a = bufx;
        GeneratedMessageLite.m124024a(bufx.class, bufx);
    }

    private bufx() {
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
            return GeneratedMessageLite.m124022a(f153757a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bufx();
        }
        if (i2 == 4) {
            return new bxvd(f153757a);
        }
        if (i2 == 5) {
            return f153757a;
        }
        bxxk bxxk = f153758b;
        if (bxxk == null) {
            synchronized (bufx.class) {
                bxxk = f153758b;
                if (bxxk == null) {
                    bxxk = new bxve(f153757a);
                    f153758b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
