package p000;

/* renamed from: bmbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmbt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmbt f128620d;

    /* renamed from: f */
    private static volatile bxxk f128621f;

    /* renamed from: a */
    public bmdn f128622a;

    /* renamed from: b */
    public bxwc f128623b = bxxn.f165040b;

    /* renamed from: c */
    public String f128624c = "";

    /* renamed from: e */
    private int f128625e;

    static {
        bmbt bmbt = new bmbt();
        f128620d = bmbt;
        bxvk.m124024a(bmbt.class, bmbt);
    }

    private bmbt() {
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
            return bxvk.m124022a(f128620d, "\u0001\u0003\u0000\u0001\u0002\u0007\u0003\u0000\u0001\u0000\u0002\u001a\u0003ဈ\u0001\u0007ဉ\u0000", new Object[]{"e", "b", "c", "a"});
        } else if (i2 == 3) {
            return new bmbt();
        } else {
            if (i2 == 4) {
                return new bxvd(f128620d);
            }
            if (i2 == 5) {
                return f128620d;
            }
            bxxk bxxk = f128621f;
            if (bxxk == null) {
                synchronized (bmbt.class) {
                    bxxk = f128621f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128620d);
                        f128621f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
