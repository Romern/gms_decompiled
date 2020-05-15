package p000;

/* renamed from: bzmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzmf f170609b;

    /* renamed from: c */
    private static volatile bxxk f170610c;

    /* renamed from: a */
    public bxwc f170611a = bxxn.f165040b;

    static {
        bzmf bzmf = new bzmf();
        f170609b = bzmf;
        GeneratedMessageLite.m124024a(bzmf.class, bzmf);
    }

    private bzmf() {
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
            return GeneratedMessageLite.m124022a(f170609b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzmq.class});
        } else if (i2 == 3) {
            return new bzmf();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f170609b;
            }
            bxxk bxxk = f170610c;
            if (bxxk == null) {
                synchronized (bzmf.class) {
                    bxxk = f170610c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170609b);
                        f170610c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
