package p000;

/* renamed from: bomb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bomb f133616f;

    /* renamed from: g */
    private static volatile bxxk f133617g;

    /* renamed from: a */
    public int f133618a;

    /* renamed from: b */
    public int f133619b;

    /* renamed from: c */
    public boma f133620c;

    /* renamed from: d */
    public bxwc f133621d = bxxn.f165040b;

    /* renamed from: e */
    public long f133622e;

    static {
        bomb bomb = new bomb();
        f133616f = bomb;
        bxvk.m124024a(bomb.class, bomb);
    }

    private bomb() {
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
            return bxvk.m124022a(f133616f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\f\u0003\t\u0004\u001b\u0005\u0002", new Object[]{"a", "b", "c", "d", bomc.class, "e"});
        } else if (i2 == 3) {
            return new bomb();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f133616f;
            }
            bxxk bxxk = f133617g;
            if (bxxk == null) {
                synchronized (bomb.class) {
                    bxxk = f133617g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133616f);
                        f133617g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
