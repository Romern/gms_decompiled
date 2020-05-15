package p000;

/* renamed from: btwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwk extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btwk f152710a;

    /* renamed from: b */
    private static volatile bxxk f152711b;

    static {
        btwk btwk = new btwk();
        f152710a = btwk;
        bxvk.m124024a(btwk.class, btwk);
    }

    private btwk() {
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
            return bxvk.m124022a(f152710a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btwk();
        }
        if (i2 == 4) {
            return new bxvd(f152710a);
        }
        if (i2 == 5) {
            return f152710a;
        }
        bxxk bxxk = f152711b;
        if (bxxk == null) {
            synchronized (btwk.class) {
                bxxk = f152711b;
                if (bxxk == null) {
                    bxxk = new bxve(f152710a);
                    f152711b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
