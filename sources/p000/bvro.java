package p000;

/* renamed from: bvro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvro extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvro f157450a;

    /* renamed from: b */
    private static volatile bxxk f157451b;

    static {
        bvro bvro = new bvro();
        f157450a = bvro;
        bxvk.m124024a(bvro.class, bvro);
    }

    private bvro() {
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
            return bxvk.m124022a(f157450a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvro();
        }
        if (i2 == 4) {
            return new bxvd(f157450a);
        }
        if (i2 == 5) {
            return f157450a;
        }
        bxxk bxxk = f157451b;
        if (bxxk == null) {
            synchronized (bvro.class) {
                bxxk = f157451b;
                if (bxxk == null) {
                    bxxk = new bxve(f157450a);
                    f157451b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
