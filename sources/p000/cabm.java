package p000;

/* renamed from: cabm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cabm f172450c;

    /* renamed from: d */
    private static volatile bxxk f172451d;

    /* renamed from: a */
    public int f172452a = 0;

    /* renamed from: b */
    public Object f172453b;

    static {
        cabm cabm = new cabm();
        f172450c = cabm;
        bxvk.m124024a(cabm.class, cabm);
    }

    private cabm() {
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
            return bxvk.m124022a(f172450c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", cabn.class, cabg.class});
        } else if (i2 == 3) {
            return new cabm();
        } else {
            if (i2 == 4) {
                return new bxvd(f172450c);
            }
            if (i2 == 5) {
                return f172450c;
            }
            bxxk bxxk = f172451d;
            if (bxxk == null) {
                synchronized (cabm.class) {
                    bxxk = f172451d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172450c);
                        f172451d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
