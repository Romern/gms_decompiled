package p000;

/* renamed from: bzyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzyp f171913c;

    /* renamed from: d */
    private static volatile bxxk f171914d;

    /* renamed from: a */
    public String f171915a = "";

    /* renamed from: b */
    public long f171916b;

    static {
        bzyp bzyp = new bzyp();
        f171913c = bzyp;
        bxvk.m124024a(bzyp.class, bzyp);
    }

    private bzyp() {
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
            return bxvk.m124022a(f171913c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzyp();
        } else {
            if (i2 == 4) {
                return new bxvd(f171913c);
            }
            if (i2 == 5) {
                return f171913c;
            }
            bxxk bxxk = f171914d;
            if (bxxk == null) {
                synchronized (bzyp.class) {
                    bxxk = f171914d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171913c);
                        f171914d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
