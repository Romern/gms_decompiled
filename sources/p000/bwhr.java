package p000;

/* renamed from: bwhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwhr extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwhr f159545f;

    /* renamed from: g */
    private static volatile bxxk f159546g;

    /* renamed from: a */
    public int f159547a;

    /* renamed from: b */
    public bmnr f159548b;

    /* renamed from: c */
    public bmnr f159549c;

    /* renamed from: d */
    public bmno f159550d;

    /* renamed from: e */
    public int f159551e;

    static {
        bwhr bwhr = new bwhr();
        f159545f = bwhr;
        bxvk.m124024a(bwhr.class, bwhr);
    }

    private bwhr() {
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
            return bxvk.m124022a(f159545f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bwhp.f159544a});
        } else if (i2 == 3) {
            return new bwhr();
        } else {
            if (i2 == 4) {
                return new bxvd(f159545f);
            }
            if (i2 == 5) {
                return f159545f;
            }
            bxxk bxxk = f159546g;
            if (bxxk == null) {
                synchronized (bwhr.class) {
                    bxxk = f159546g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159545f);
                        f159546g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
