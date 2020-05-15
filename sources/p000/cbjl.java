package p000;

/* renamed from: cbjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjl extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbjl f177341a;

    /* renamed from: b */
    private static volatile bxxk f177342b;

    static {
        cbjl cbjl = new cbjl();
        f177341a = cbjl;
        bxvk.m124024a(cbjl.class, cbjl);
    }

    private cbjl() {
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
            return bxvk.m124022a(f177341a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbjl();
        }
        if (i2 == 4) {
            return new bxvd(f177341a);
        }
        if (i2 == 5) {
            return f177341a;
        }
        bxxk bxxk = f177342b;
        if (bxxk == null) {
            synchronized (cbjl.class) {
                bxxk = f177342b;
                if (bxxk == null) {
                    bxxk = new bxve(f177341a);
                    f177342b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
