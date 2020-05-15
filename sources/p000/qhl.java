package p000;

/* renamed from: qhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final qhl f41369d;

    /* renamed from: f */
    private static volatile bxxk f41370f;

    /* renamed from: a */
    public int f41371a;

    /* renamed from: b */
    public String f41372b = "";

    /* renamed from: c */
    public String f41373c = "";

    /* renamed from: e */
    private byte f41374e = 2;

    static {
        qhl qhl = new qhl();
        f41369d = qhl;
        bxvk.m124024a(qhl.class, qhl);
    }

    private qhl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f41374e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f41374e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f41369d, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0001\u0006ᔈ\u0000\u0007ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qhl();
        } else {
            if (i2 == 4) {
                return new bxvd(f41369d);
            }
            if (i2 == 5) {
                return f41369d;
            }
            bxxk bxxk = f41370f;
            if (bxxk == null) {
                synchronized (qhl.class) {
                    bxxk = f41370f;
                    if (bxxk == null) {
                        bxxk = new bxve(f41369d);
                        f41370f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
