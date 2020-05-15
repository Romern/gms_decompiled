package p000;

/* renamed from: cbnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnn f177741a;

    /* renamed from: b */
    private static volatile bxxk f177742b;

    static {
        cbnn cbnn = new cbnn();
        f177741a = cbnn;
        GeneratedMessageLite.m124024a(cbnn.class, cbnn);
    }

    private cbnn() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f177741a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnn();
        }
        if (i2 == 4) {
            return new bxvd(f177741a);
        }
        if (i2 == 5) {
            return f177741a;
        }
        bxxk bxxk = f177742b;
        if (bxxk == null) {
            synchronized (cbnn.class) {
                bxxk = f177742b;
                if (bxxk == null) {
                    bxxk = new bxve(f177741a);
                    f177742b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
