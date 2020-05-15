package p000;

/* renamed from: bqsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bqsf f141514d;

    /* renamed from: e */
    private static volatile bxxk f141515e;

    /* renamed from: a */
    public String f141516a = "";

    /* renamed from: b */
    public bxtx f141517b = bxtx.f164797b;

    /* renamed from: c */
    public int f141518c;

    static {
        bqsf bqsf = new bqsf();
        f141514d = bqsf;
        bxvk.m124024a(bqsf.class, bqsf);
    }

    private bqsf() {
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
            return bxvk.m124022a(f141514d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqsf();
        } else {
            if (i2 == 4) {
                return new bxvd(f141514d);
            }
            if (i2 == 5) {
                return f141514d;
            }
            bxxk bxxk = f141515e;
            if (bxxk == null) {
                synchronized (bqsf.class) {
                    bxxk = f141515e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141514d);
                        f141515e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
