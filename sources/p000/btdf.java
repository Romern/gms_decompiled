package p000;

/* renamed from: btdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdf extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btdf f148391a;

    /* renamed from: b */
    private static volatile bxxk f148392b;

    static {
        btdf btdf = new btdf();
        f148391a = btdf;
        bxvk.m124024a(btdf.class, btdf);
    }

    private btdf() {
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
            return bxvk.m124022a(f148391a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btdf();
        }
        if (i2 == 4) {
            return new bxvd(f148391a);
        }
        if (i2 == 5) {
            return f148391a;
        }
        bxxk bxxk = f148392b;
        if (bxxk == null) {
            synchronized (btdf.class) {
                bxxk = f148392b;
                if (bxxk == null) {
                    bxxk = new bxve(f148391a);
                    f148392b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
