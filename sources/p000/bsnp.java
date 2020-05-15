package p000;

/* renamed from: bsnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsnp f146312b;

    /* renamed from: c */
    private static volatile bxxk f146313c;

    /* renamed from: a */
    public bsnq f146314a;

    static {
        bsnp bsnp = new bsnp();
        f146312b = bsnp;
        bxvk.m124024a(bsnp.class, bsnp);
    }

    private bsnp() {
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
            return bxvk.m124022a(f146312b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f146312b);
            }
            if (i2 == 5) {
                return f146312b;
            }
            bxxk bxxk = f146313c;
            if (bxxk == null) {
                synchronized (bsnp.class) {
                    bxxk = f146313c;
                    if (bxxk == null) {
                        bxxk = new bxve(f146312b);
                        f146313c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
