package p000;

/* renamed from: bpqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqq extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bpqq f138778a;

    /* renamed from: b */
    private static volatile bxxk f138779b;

    static {
        bpqq bpqq = new bpqq();
        f138778a = bpqq;
        GeneratedMessageLite.m124024a(bpqq.class, bpqq);
    }

    private bpqq() {
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
            return GeneratedMessageLite.m124022a(f138778a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bpqq();
        }
        if (i2 == 4) {
            return new bxvd(f138778a);
        }
        if (i2 == 5) {
            return f138778a;
        }
        bxxk bxxk = f138779b;
        if (bxxk == null) {
            synchronized (bpqq.class) {
                bxxk = f138779b;
                if (bxxk == null) {
                    bxxk = new bxve(f138778a);
                    f138779b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
