package p000;

/* renamed from: bvrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvrs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvrs f157458a;

    /* renamed from: b */
    private static volatile bxxk f157459b;

    static {
        bvrs bvrs = new bvrs();
        f157458a = bvrs;
        bxvk.m124024a(bvrs.class, bvrs);
    }

    private bvrs() {
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
            return bxvk.m124022a(f157458a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvrs();
        }
        if (i2 == 4) {
            return new bxvd(f157458a);
        }
        if (i2 == 5) {
            return f157458a;
        }
        bxxk bxxk = f157459b;
        if (bxxk == null) {
            synchronized (bvrs.class) {
                bxxk = f157459b;
                if (bxxk == null) {
                    bxxk = new bxve(f157458a);
                    f157459b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
