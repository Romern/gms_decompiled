package p000;

/* renamed from: cbkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbkv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbkv f177449a;

    /* renamed from: b */
    private static volatile bxxk f177450b;

    static {
        cbkv cbkv = new cbkv();
        f177449a = cbkv;
        GeneratedMessageLite.m124024a(cbkv.class, cbkv);
    }

    private cbkv() {
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
            return GeneratedMessageLite.m124022a(f177449a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbkv();
        }
        if (i2 == 4) {
            return new bxvd(f177449a);
        }
        if (i2 == 5) {
            return f177449a;
        }
        bxxk bxxk = f177450b;
        if (bxxk == null) {
            synchronized (cbkv.class) {
                bxxk = f177450b;
                if (bxxk == null) {
                    bxxk = new bxve(f177449a);
                    f177450b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
