package p000;

/* renamed from: bvyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvyt f158222d;

    /* renamed from: e */
    private static volatile bxxk f158223e;

    /* renamed from: a */
    public int f158224a;

    /* renamed from: b */
    public String f158225b = "";

    /* renamed from: c */
    public float f158226c;

    static {
        bvyt bvyt = new bvyt();
        f158222d = bvyt;
        bxvk.m124024a(bvyt.class, bvyt);
    }

    private bvyt() {
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
            return bxvk.m124022a(f158222d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvyt();
        } else {
            if (i2 == 4) {
                return new bxvd(f158222d);
            }
            if (i2 == 5) {
                return f158222d;
            }
            bxxk bxxk = f158223e;
            if (bxxk == null) {
                synchronized (bvyt.class) {
                    bxxk = f158223e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158222d);
                        f158223e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
