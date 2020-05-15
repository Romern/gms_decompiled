package p000;

/* renamed from: qok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qok extends bxvk implements bxxd {

    /* renamed from: e */
    public static final qok f41865e;

    /* renamed from: f */
    private static volatile bxxk f41866f;

    /* renamed from: a */
    public int f41867a;

    /* renamed from: b */
    public int f41868b;

    /* renamed from: c */
    public qmk f41869c;

    /* renamed from: d */
    public boolean f41870d;

    static {
        qok qok = new qok();
        f41865e = qok;
        bxvk.m124024a(qok.class, qok);
    }

    private qok() {
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
            return bxvk.m124022a(f41865e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new qok();
        } else {
            if (i2 == 4) {
                return new bxvd(f41865e);
            }
            if (i2 == 5) {
                return f41865e;
            }
            bxxk bxxk = f41866f;
            if (bxxk == null) {
                synchronized (qok.class) {
                    bxxk = f41866f;
                    if (bxxk == null) {
                        bxxk = new bxve(f41865e);
                        f41866f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
