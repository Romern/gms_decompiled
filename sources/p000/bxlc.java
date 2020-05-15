package p000;

/* renamed from: bxlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxvu f163828c = new bxlb();

    /* renamed from: d */
    public static final bxlc f163829d;

    /* renamed from: f */
    private static volatile bxxk f163830f;

    /* renamed from: a */
    public int f163831a;

    /* renamed from: b */
    public bxvt f163832b = bxvm.f164965b;

    /* renamed from: e */
    private int f163833e;

    static {
        bxlc bxlc = new bxlc();
        f163829d = bxlc;
        bxvk.m124024a(bxlc.class, bxlc);
    }

    private bxlc() {
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
            return bxvk.m124022a(f163829d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"e", "a", bxli.f163851a, "b", bxll.m122838b()});
        } else if (i2 == 3) {
            return new bxlc();
        } else {
            if (i2 == 4) {
                return new bxvd(f163829d);
            }
            if (i2 == 5) {
                return f163829d;
            }
            bxxk bxxk = f163830f;
            if (bxxk == null) {
                synchronized (bxlc.class) {
                    bxxk = f163830f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163829d);
                        f163830f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
