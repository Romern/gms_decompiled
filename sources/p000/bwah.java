package p000;

/* renamed from: bwah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwah extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bwah f158643i;

    /* renamed from: j */
    private static volatile bxxk f158644j;

    /* renamed from: a */
    public int f158645a;

    /* renamed from: b */
    public int f158646b;

    /* renamed from: c */
    public String f158647c = "";

    /* renamed from: d */
    public int f158648d;

    /* renamed from: e */
    public bwae f158649e;

    /* renamed from: f */
    public int f158650f;

    /* renamed from: g */
    public bwaf f158651g;

    /* renamed from: h */
    public bwag f158652h;

    static {
        bwah bwah = new bwah();
        f158643i = bwah;
        bxvk.m124024a(bwah.class, bwah);
    }

    private bwah() {
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
            return bxvk.m124022a(f158643i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\bဉ\u0007", new Object[]{"a", "b", "c", "d", bzvf.f171515a, "e", "f", bzvg.f171516a, "g", "h"});
        } else if (i2 == 3) {
            return new bwah();
        } else {
            if (i2 == 4) {
                return new bxvd(f158643i);
            }
            if (i2 == 5) {
                return f158643i;
            }
            bxxk bxxk = f158644j;
            if (bxxk == null) {
                synchronized (bwah.class) {
                    bxxk = f158644j;
                    if (bxxk == null) {
                        bxxk = new bxve(f158643i);
                        f158644j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
