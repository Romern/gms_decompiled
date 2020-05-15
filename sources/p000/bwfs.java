package p000;

/* renamed from: bwfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwfs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwfs f159127c;

    /* renamed from: d */
    private static volatile bxxk f159128d;

    /* renamed from: a */
    public int f159129a;

    /* renamed from: b */
    public int f159130b;

    static {
        bwfs bwfs = new bwfs();
        f159127c = bwfs;
        bxvk.m124024a(bwfs.class, bwfs);
    }

    private bwfs() {
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
            return bxvk.m124022a(f159127c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bwff.f159084a});
        } else if (i2 == 3) {
            return new bwfs();
        } else {
            if (i2 == 4) {
                return new bxvd(f159127c);
            }
            if (i2 == 5) {
                return f159127c;
            }
            bxxk bxxk = f159128d;
            if (bxxk == null) {
                synchronized (bwfs.class) {
                    bxxk = f159128d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159127c);
                        f159128d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
