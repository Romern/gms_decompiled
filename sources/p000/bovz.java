package p000;

/* renamed from: bovz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bovz f135078d;

    /* renamed from: e */
    private static volatile bxxk f135079e;

    /* renamed from: a */
    public int f135080a;

    /* renamed from: b */
    public int f135081b;

    /* renamed from: c */
    public int f135082c;

    static {
        bovz bovz = new bovz();
        f135078d = bovz;
        bxvk.m124024a(bovz.class, bovz);
    }

    private bovz() {
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
            return bxvk.m124022a(f135078d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bovx.f135076a, "c", bovy.f135077a});
        } else if (i2 == 3) {
            return new bovz();
        } else {
            if (i2 == 4) {
                return new bxvd(f135078d);
            }
            if (i2 == 5) {
                return f135078d;
            }
            bxxk bxxk = f135079e;
            if (bxxk == null) {
                synchronized (bovz.class) {
                    bxxk = f135079e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135078d);
                        f135079e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
