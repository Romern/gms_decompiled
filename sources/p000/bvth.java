package p000;

/* renamed from: bvth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvth extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvth f157566a;

    /* renamed from: b */
    private static volatile bxxk f157567b;

    static {
        bvth bvth = new bvth();
        f157566a = bvth;
        bxvk.m124024a(bvth.class, bvth);
    }

    private bvth() {
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
            return bxvk.m124022a(f157566a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvth();
        }
        if (i2 == 4) {
            return new bxvd(f157566a);
        }
        if (i2 == 5) {
            return f157566a;
        }
        bxxk bxxk = f157567b;
        if (bxxk == null) {
            synchronized (bvth.class) {
                bxxk = f157567b;
                if (bxxk == null) {
                    bxxk = new bxve(f157566a);
                    f157567b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
