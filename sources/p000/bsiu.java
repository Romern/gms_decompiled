package p000;

/* renamed from: bsiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsiu extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsiu f144756a;

    /* renamed from: b */
    private static volatile bxxk f144757b;

    static {
        bsiu bsiu = new bsiu();
        f144756a = bsiu;
        bxvk.m124024a(bsiu.class, bsiu);
    }

    private bsiu() {
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
            return bxvk.m124022a(f144756a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsiu();
        }
        if (i2 == 4) {
            return new bxvd(f144756a);
        }
        if (i2 == 5) {
            return f144756a;
        }
        bxxk bxxk = f144757b;
        if (bxxk == null) {
            synchronized (bsiu.class) {
                bxxk = f144757b;
                if (bxxk == null) {
                    bxxk = new bxve(f144756a);
                    f144757b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
