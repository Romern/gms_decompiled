package p000;

/* renamed from: bsqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqy extends bxvk implements bxxd {

    /* renamed from: l */
    public static final bsqy f146707l;

    /* renamed from: m */
    private static volatile bxxk f146708m;

    /* renamed from: a */
    public int f146709a;

    /* renamed from: b */
    public bsqq f146710b;

    /* renamed from: c */
    public bsqq f146711c;

    /* renamed from: d */
    public bsqq f146712d;

    /* renamed from: e */
    public bsqq f146713e;

    /* renamed from: f */
    public String f146714f = "";

    /* renamed from: g */
    public bsqq f146715g;

    /* renamed from: h */
    public bsqq f146716h;

    /* renamed from: i */
    public bsqq f146717i;

    /* renamed from: j */
    public bsqq f146718j;

    /* renamed from: k */
    public String f146719k = "";

    static {
        bsqy bsqy = new bsqy();
        f146707l = bsqy;
        bxvk.m124024a(bsqy.class, bsqy);
    }

    private bsqy() {
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
            return bxvk.m124022a(f146707l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဈ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bsqy();
        } else {
            if (i2 == 4) {
                return new bxvd(f146707l);
            }
            if (i2 == 5) {
                return f146707l;
            }
            bxxk bxxk = f146708m;
            if (bxxk == null) {
                synchronized (bsqy.class) {
                    bxxk = f146708m;
                    if (bxxk == null) {
                        bxxk = new bxve(f146707l);
                        f146708m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
