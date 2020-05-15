package p000;

/* renamed from: btqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqc extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btqc f149926a;

    /* renamed from: b */
    private static volatile bxxk f149927b;

    static {
        btqc btqc = new btqc();
        f149926a = btqc;
        bxvk.m124024a(btqc.class, btqc);
    }

    private btqc() {
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
            return bxvk.m124022a(f149926a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btqc();
        }
        if (i2 == 4) {
            return new bxvd(f149926a);
        }
        if (i2 == 5) {
            return f149926a;
        }
        bxxk bxxk = f149927b;
        if (bxxk == null) {
            synchronized (btqc.class) {
                bxxk = f149927b;
                if (bxxk == null) {
                    bxxk = new bxve(f149926a);
                    f149927b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
