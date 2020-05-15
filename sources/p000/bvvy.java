package p000;

/* renamed from: bvvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvvy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvvy f157871c;

    /* renamed from: d */
    private static volatile bxxk f157872d;

    /* renamed from: a */
    public bxwc f157873a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f157874b = bxxn.f165040b;

    static {
        bvvy bvvy = new bvvy();
        f157871c = bvvy;
        bxvk.m124024a(bvvy.class, bvvy);
    }

    private bvvy() {
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
            return bxvk.m124022a(f157871c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bvxz.class, "b", bvxx.class});
        } else if (i2 == 3) {
            return new bvvy();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f157871c;
            }
            bxxk bxxk = f157872d;
            if (bxxk == null) {
                synchronized (bvvy.class) {
                    bxxk = f157872d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157871c);
                        f157872d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
