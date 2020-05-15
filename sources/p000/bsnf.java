package p000;

/* renamed from: bsnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsnf f146236b;

    /* renamed from: c */
    private static volatile bxxk f146237c;

    /* renamed from: a */
    public int f146238a;

    static {
        bsnf bsnf = new bsnf();
        f146236b = bsnf;
        bxvk.m124024a(bsnf.class, bsnf);
    }

    private bsnf() {
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
            return bxvk.m124022a(f146236b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f146236b);
            }
            if (i2 == 5) {
                return f146236b;
            }
            bxxk bxxk = f146237c;
            if (bxxk == null) {
                synchronized (bsnf.class) {
                    bxxk = f146237c;
                    if (bxxk == null) {
                        bxxk = new bxve(f146236b);
                        f146237c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
