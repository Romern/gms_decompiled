package p000;

/* renamed from: abdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdz extends bxvk implements bxxd {

    /* renamed from: a */
    public static final abdz f57159a;

    /* renamed from: b */
    private static volatile bxxk f57160b;

    static {
        abdz abdz = new abdz();
        f57159a = abdz;
        bxvk.m124024a(abdz.class, abdz);
    }

    private abdz() {
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
            return bxvk.m124022a(f57159a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdz();
        }
        if (i2 == 4) {
            return new bxvd(f57159a);
        }
        if (i2 == 5) {
            return f57159a;
        }
        bxxk bxxk = f57160b;
        if (bxxk == null) {
            synchronized (abdz.class) {
                bxxk = f57160b;
                if (bxxk == null) {
                    bxxk = new bxve(f57159a);
                    f57160b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
