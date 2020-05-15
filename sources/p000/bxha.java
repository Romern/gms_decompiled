package p000;

/* renamed from: bxha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxha extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxha f163331b;

    /* renamed from: c */
    private static volatile bxxk f163332c;

    /* renamed from: a */
    public bxwc f163333a = bxxn.f165040b;

    static {
        bxha bxha = new bxha();
        f163331b = bxha;
        bxvk.m124024a(bxha.class, bxha);
    }

    private bxha() {
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
            return bxvk.m124022a(f163331b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxgz.class});
        } else if (i2 == 3) {
            return new bxha();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f163331b;
            }
            bxxk bxxk = f163332c;
            if (bxxk == null) {
                synchronized (bxha.class) {
                    bxxk = f163332c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163331b);
                        f163332c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
