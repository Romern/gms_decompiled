package p000;

/* renamed from: aapf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapf extends bxvk implements bxxd {

    /* renamed from: i */
    public static final aapf f28749i;

    /* renamed from: j */
    private static volatile bxxk f28750j;

    /* renamed from: a */
    public int f28751a;

    /* renamed from: b */
    public boolean f28752b;

    /* renamed from: c */
    public boolean f28753c;

    /* renamed from: d */
    public boolean f28754d;

    /* renamed from: e */
    public boolean f28755e;

    /* renamed from: f */
    public boolean f28756f;

    /* renamed from: g */
    public boolean f28757g;

    /* renamed from: h */
    public boolean f28758h;

    static {
        aapf aapf = new aapf();
        f28749i = aapf;
        bxvk.m124024a(aapf.class, aapf);
    }

    private aapf() {
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
            return bxvk.m124022a(f28749i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new aapf();
        } else {
            if (i2 == 4) {
                return new bxvd(f28749i);
            }
            if (i2 == 5) {
                return f28749i;
            }
            bxxk bxxk = f28750j;
            if (bxxk == null) {
                synchronized (aapf.class) {
                    bxxk = f28750j;
                    if (bxxk == null) {
                        bxxk = new bxve(f28749i);
                        f28750j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
