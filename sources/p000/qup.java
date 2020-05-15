package p000;

/* renamed from: qup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qup extends bxvk implements bxxd {

    /* renamed from: a */
    public static final qup f42184a;

    /* renamed from: b */
    private static volatile bxxk f42185b;

    static {
        qup qup = new qup();
        f42184a = qup;
        bxvk.m124024a(qup.class, qup);
    }

    private qup() {
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
            return bxvk.m124022a(f42184a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new qup();
        }
        if (i2 == 4) {
            return new bxvd(f42184a);
        }
        if (i2 == 5) {
            return f42184a;
        }
        bxxk bxxk = f42185b;
        if (bxxk == null) {
            synchronized (qup.class) {
                bxxk = f42185b;
                if (bxxk == null) {
                    bxxk = new bxve(f42184a);
                    f42185b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
