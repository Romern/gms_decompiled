package p000;

/* renamed from: bvod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvod extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvod f157012f;

    /* renamed from: g */
    private static volatile bxxk f157013g;

    /* renamed from: a */
    public int f157014a;

    /* renamed from: b */
    public bvnq f157015b;

    /* renamed from: c */
    public bvno f157016c;

    /* renamed from: d */
    public int f157017d;

    /* renamed from: e */
    public long f157018e;

    static {
        bvod bvod = new bvod();
        f157012f = bvod;
        bxvk.m124024a(bvod.class, bvod);
    }

    private bvod() {
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
            return bxvk.m124022a(f157012f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0002\u0003ဂ\u0003\u0004ဉ\u0001", new Object[]{"a", "b", "d", bvob.f157011a, "e", "c"});
        } else if (i2 == 3) {
            return new bvod();
        } else {
            if (i2 == 4) {
                return new bxvd(f157012f);
            }
            if (i2 == 5) {
                return f157012f;
            }
            bxxk bxxk = f157013g;
            if (bxxk == null) {
                synchronized (bvod.class) {
                    bxxk = f157013g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157012f);
                        f157013g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
