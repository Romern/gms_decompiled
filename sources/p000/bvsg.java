package p000;

/* renamed from: bvsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsg extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvsg f157486a;

    /* renamed from: b */
    private static volatile bxxk f157487b;

    static {
        bvsg bvsg = new bvsg();
        f157486a = bvsg;
        bxvk.m124024a(bvsg.class, bvsg);
    }

    private bvsg() {
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
            return bxvk.m124022a(f157486a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsg();
        }
        if (i2 == 4) {
            return new bxvd(f157486a);
        }
        if (i2 == 5) {
            return f157486a;
        }
        bxxk bxxk = f157487b;
        if (bxxk == null) {
            synchronized (bvsg.class) {
                bxxk = f157487b;
                if (bxxk == null) {
                    bxxk = new bxve(f157486a);
                    f157487b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
