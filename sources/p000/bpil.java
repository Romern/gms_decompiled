package p000;

/* renamed from: bpil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpil extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bpil f137777b;

    /* renamed from: c */
    private static volatile bxxk f137778c;

    /* renamed from: a */
    public bxwc f137779a = bxxn.f165040b;

    static {
        bpil bpil = new bpil();
        f137777b = bpil;
        GeneratedMessageLite.m124024a(bpil.class, bpil);
    }

    private bpil() {
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
            return GeneratedMessageLite.m124022a(f137777b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bpik.class});
        } else if (i2 == 3) {
            return new bpil();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f137777b;
            }
            bxxk bxxk = f137778c;
            if (bxxk == null) {
                synchronized (bpil.class) {
                    bxxk = f137778c;
                    if (bxxk == null) {
                        bxxk = new bxve(f137777b);
                        f137778c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
