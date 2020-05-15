package p000;

/* renamed from: abde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abde extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final abde f57073a;

    /* renamed from: b */
    private static volatile bxxk f57074b;

    static {
        abde abde = new abde();
        f57073a = abde;
        GeneratedMessageLite.m124024a(abde.class, abde);
    }

    private abde() {
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
            return GeneratedMessageLite.m124022a(f57073a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abde();
        }
        if (i2 == 4) {
            return new bxvd(f57073a);
        }
        if (i2 == 5) {
            return f57073a;
        }
        bxxk bxxk = f57074b;
        if (bxxk == null) {
            synchronized (abde.class) {
                bxxk = f57074b;
                if (bxxk == null) {
                    bxxk = new bxve(f57073a);
                    f57074b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
