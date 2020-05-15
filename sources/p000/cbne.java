package p000;

/* renamed from: cbne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbne extends bxvk implements bxxd {

    /* renamed from: a */
    public static final cbne f177721a;

    /* renamed from: b */
    private static volatile bxxk f177722b;

    static {
        cbne cbne = new cbne();
        f177721a = cbne;
        bxvk.m124024a(cbne.class, cbne);
    }

    private cbne() {
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
            return bxvk.m124022a(f177721a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbne();
        }
        if (i2 == 4) {
            return new bxvd(f177721a);
        }
        if (i2 == 5) {
            return f177721a;
        }
        bxxk bxxk = f177722b;
        if (bxxk == null) {
            synchronized (cbne.class) {
                bxxk = f177722b;
                if (bxxk == null) {
                    bxxk = new bxve(f177721a);
                    f177722b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
