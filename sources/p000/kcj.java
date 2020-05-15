package p000;

/* renamed from: kcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcj extends bxvk implements bxxd {

    /* renamed from: h */
    public static final kcj f23808h;

    /* renamed from: i */
    private static volatile bxxk f23809i;

    /* renamed from: a */
    public int f23810a;

    /* renamed from: b */
    public int f23811b;

    /* renamed from: c */
    public int f23812c;

    /* renamed from: d */
    public kci f23813d;

    /* renamed from: e */
    public String f23814e = "";

    /* renamed from: f */
    public int f23815f;

    /* renamed from: g */
    public int f23816g;

    static {
        kcj kcj = new kcj();
        f23808h = kcj;
        bxvk.m124024a(kcj.class, kcj);
    }

    private kcj() {
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
            return bxvk.m124022a(f23808h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\t\u0005Ȉ\u0006\u0004\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new kcj();
        } else {
            if (i2 == 4) {
                return new bxvd(f23808h);
            }
            if (i2 == 5) {
                return f23808h;
            }
            bxxk bxxk = f23809i;
            if (bxxk == null) {
                synchronized (kcj.class) {
                    bxxk = f23809i;
                    if (bxxk == null) {
                        bxxk = new bxve(f23808h);
                        f23809i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
