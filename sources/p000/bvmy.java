package p000;

/* renamed from: bvmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvmy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvmy f156826d;

    /* renamed from: e */
    private static volatile bxxk f156827e;

    /* renamed from: a */
    public int f156828a;

    /* renamed from: b */
    public bvov f156829b;

    /* renamed from: c */
    public bxwc f156830c = bxxn.f165040b;

    static {
        bvmy bvmy = new bvmy();
        f156826d = bvmy;
        GeneratedMessageLite.m124024a(bvmy.class, bvmy);
    }

    private bvmy() {
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
            return GeneratedMessageLite.m124022a(f156826d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvmy();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f156826d;
            }
            bxxk bxxk = f156827e;
            if (bxxk == null) {
                synchronized (bvmy.class) {
                    bxxk = f156827e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156826d);
                        f156827e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
