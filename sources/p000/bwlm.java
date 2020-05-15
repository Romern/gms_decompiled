package p000;

/* renamed from: bwlm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlm extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bwlm f160155a;

    /* renamed from: b */
    private static volatile bxxk f160156b;

    static {
        bwlm bwlm = new bwlm();
        f160155a = bwlm;
        bxvk.m124024a(bwlm.class, bwlm);
    }

    private bwlm() {
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
            return bxvk.m124022a(f160155a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwlm();
        }
        if (i2 == 4) {
            return new bxvd(f160155a);
        }
        if (i2 == 5) {
            return f160155a;
        }
        bxxk bxxk = f160156b;
        if (bxxk == null) {
            synchronized (bwlm.class) {
                bxxk = f160156b;
                if (bxxk == null) {
                    bxxk = new bxve(f160155a);
                    f160156b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
