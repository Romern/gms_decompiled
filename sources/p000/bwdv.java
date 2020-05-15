package p000;

/* renamed from: bwdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdv extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bwdv f158938i;

    /* renamed from: j */
    private static volatile bxxk f158939j;

    /* renamed from: a */
    public int f158940a;

    /* renamed from: b */
    public String f158941b = "";

    /* renamed from: c */
    public String f158942c = "";

    /* renamed from: d */
    public int f158943d;

    /* renamed from: e */
    public int f158944e;

    /* renamed from: f */
    public String f158945f = "";

    /* renamed from: g */
    public String f158946g = "";

    /* renamed from: h */
    public int f158947h;

    static {
        bwdv bwdv = new bwdv();
        f158938i = bwdv;
        bxvk.m124024a(bwdv.class, bwdv);
    }

    private bwdv() {
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
            return bxvk.m124022a(f158938i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bwdu.f158937a});
        } else if (i2 == 3) {
            return new bwdv();
        } else {
            if (i2 == 4) {
                return new bxvd(f158938i);
            }
            if (i2 == 5) {
                return f158938i;
            }
            bxxk bxxk = f158939j;
            if (bxxk == null) {
                synchronized (bwdv.class) {
                    bxxk = f158939j;
                    if (bxxk == null) {
                        bxxk = new bxve(f158938i);
                        f158939j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
