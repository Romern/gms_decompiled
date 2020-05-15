package p000;

/* renamed from: abuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuq extends bxvk implements bxxd {

    /* renamed from: a */
    public static final abuq f58451a;

    /* renamed from: b */
    private static volatile bxxk f58452b;

    static {
        abuq abuq = new abuq();
        f58451a = abuq;
        bxvk.m124024a(abuq.class, abuq);
    }

    private abuq() {
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
            return bxvk.m124022a(f58451a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abuq();
        }
        if (i2 == 4) {
            return new bxvd(f58451a);
        }
        if (i2 == 5) {
            return f58451a;
        }
        bxxk bxxk = f58452b;
        if (bxxk == null) {
            synchronized (abuq.class) {
                bxxk = f58452b;
                if (bxxk == null) {
                    bxxk = new bxve(f58451a);
                    f58452b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
