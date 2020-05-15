package p000;

/* renamed from: ciwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ciwu f191610e;

    /* renamed from: f */
    private static volatile bxxk f191611f;

    /* renamed from: a */
    public int f191612a;

    /* renamed from: b */
    public int f191613b;

    /* renamed from: c */
    public bxtx f191614c = bxtx.f164797b;

    /* renamed from: d */
    public bxtx f191615d = bxtx.f164797b;

    static {
        ciwu ciwu = new ciwu();
        f191610e = ciwu;
        bxvk.m124024a(ciwu.class, ciwu);
    }

    private ciwu() {
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
            return bxvk.m124022a(f191610e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ciwu();
        } else {
            if (i2 == 4) {
                return new bxvd(f191610e);
            }
            if (i2 == 5) {
                return f191610e;
            }
            bxxk bxxk = f191611f;
            if (bxxk == null) {
                synchronized (ciwu.class) {
                    bxxk = f191611f;
                    if (bxxk == null) {
                        bxxk = new bxve(f191610e);
                        f191611f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
