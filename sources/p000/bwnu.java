package p000;

/* renamed from: bwnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwnu f160392d;

    /* renamed from: e */
    private static volatile bxxk f160393e;

    /* renamed from: a */
    public int f160394a;

    /* renamed from: b */
    public int f160395b;

    /* renamed from: c */
    public bwpd f160396c;

    static {
        bwnu bwnu = new bwnu();
        f160392d = bwnu;
        bxvk.m124024a(bwnu.class, bwnu);
    }

    private bwnu() {
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
            return bxvk.m124022a(f160392d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bwnl.f160372a, "c"});
        } else if (i2 == 3) {
            return new bwnu();
        } else {
            if (i2 == 4) {
                return new bxvd(f160392d);
            }
            if (i2 == 5) {
                return f160392d;
            }
            bxxk bxxk = f160393e;
            if (bxxk == null) {
                synchronized (bwnu.class) {
                    bxxk = f160393e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160392d);
                        f160393e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
