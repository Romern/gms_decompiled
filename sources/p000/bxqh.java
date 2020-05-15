package p000;

/* renamed from: bxqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxqh f164384b;

    /* renamed from: d */
    private static volatile bxxk f164385d;

    /* renamed from: a */
    public bxwc f164386a = bxxn.f165040b;

    /* renamed from: c */
    private byte f164387c = 2;

    static {
        bxqh bxqh = new bxqh();
        f164384b = bxqh;
        bxvk.m124024a(bxqh.class, bxqh);
    }

    private bxqh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f164387c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f164387c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f164384b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", bxbp.class});
        } else if (i2 == 3) {
            return new bxqh();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f164384b;
            }
            bxxk bxxk = f164385d;
            if (bxxk == null) {
                synchronized (bxqh.class) {
                    bxxk = f164385d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164384b);
                        f164385d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
