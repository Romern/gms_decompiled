package p000;

/* renamed from: bpgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpgf f137483c;

    /* renamed from: d */
    private static volatile bxxk f137484d;

    /* renamed from: a */
    public bxvt f137485a = bxvm.f164965b;

    /* renamed from: b */
    public bxvt f137486b = bxvm.f164965b;

    static {
        bpgf bpgf = new bpgf();
        f137483c = bpgf;
        GeneratedMessageLite.m124024a(bpgf.class, bpgf);
    }

    private bpgf() {
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
            return GeneratedMessageLite.m124022a(f137483c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001e", new Object[]{"a", bzzv.m126374b(), "b", bzzv.m126374b()});
        } else if (i2 == 3) {
            return new bpgf();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f137483c;
            }
            bxxk bxxk = f137484d;
            if (bxxk == null) {
                synchronized (bpgf.class) {
                    bxxk = f137484d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137483c);
                        f137484d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
