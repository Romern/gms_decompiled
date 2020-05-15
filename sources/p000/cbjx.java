package p000;

/* renamed from: cbjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjx extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbjx f177375a;

    /* renamed from: b */
    private static volatile bxxk f177376b;

    static {
        cbjx cbjx = new cbjx();
        f177375a = cbjx;
        bxvk.m124024a(cbjx.class, cbjx);
    }

    private cbjx() {
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
            return bxvk.m124022a(f177375a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbjx();
        }
        if (i2 == 4) {
            return new bxvd(f177375a);
        }
        if (i2 == 5) {
            return f177375a;
        }
        bxxk bxxk = f177376b;
        if (bxxk == null) {
            synchronized (cbjx.class) {
                bxxk = f177376b;
                if (bxxk == null) {
                    bxxk = new bxve(f177375a);
                    f177376b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
