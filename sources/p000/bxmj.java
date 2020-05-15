package p000;

/* renamed from: bxmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxmj f163942b;

    /* renamed from: c */
    private static volatile bxxk f163943c;

    /* renamed from: a */
    public bxwc f163944a = bxxn.f165040b;

    static {
        bxmj bxmj = new bxmj();
        f163942b = bxmj;
        bxvk.m124024a(bxmj.class, bxmj);
    }

    private bxmj() {
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
            return bxvk.m124022a(f163942b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxmi.class});
        } else if (i2 == 3) {
            return new bxmj();
        } else {
            if (i2 == 4) {
                return new bxvd(f163942b);
            }
            if (i2 == 5) {
                return f163942b;
            }
            bxxk bxxk = f163943c;
            if (bxxk == null) {
                synchronized (bxmj.class) {
                    bxxk = f163943c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163942b);
                        f163943c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
