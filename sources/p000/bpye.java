package p000;

/* renamed from: bpye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpye extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bpye f139832b;

    /* renamed from: c */
    private static volatile bxxk f139833c;

    /* renamed from: a */
    public bxwc f139834a = bxxn.f165040b;

    static {
        bpye bpye = new bpye();
        f139832b = bpye;
        bxvk.m124024a(bpye.class, bpye);
    }

    private bpye() {
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
            return bxvk.m124022a(f139832b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bpyd.class});
        } else if (i2 == 3) {
            return new bpye();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f139832b;
            }
            bxxk bxxk = f139833c;
            if (bxxk == null) {
                synchronized (bpye.class) {
                    bxxk = f139833c;
                    if (bxxk == null) {
                        bxxk = new bxve(f139832b);
                        f139833c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
