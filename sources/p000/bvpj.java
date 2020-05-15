package p000;

/* renamed from: bvpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpj extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvpj f157303a;

    /* renamed from: b */
    private static volatile bxxk f157304b;

    static {
        bvpj bvpj = new bvpj();
        f157303a = bvpj;
        bxvk.m124024a(bvpj.class, bvpj);
    }

    private bvpj() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f157303a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpj();
        }
        if (i2 == 4) {
            return new bxvd(f157303a);
        }
        if (i2 == 5) {
            return f157303a;
        }
        bxxk bxxk = f157304b;
        if (bxxk == null) {
            synchronized (bvpj.class) {
                bxxk = f157304b;
                if (bxxk == null) {
                    bxxk = new bxve(f157303a);
                    f157304b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
