package p000;

/* renamed from: bocl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bocl f132567d;

    /* renamed from: e */
    private static volatile bxxk f132568e;

    /* renamed from: a */
    public int f132569a;

    /* renamed from: b */
    public boolean f132570b;

    /* renamed from: c */
    public int f132571c;

    static {
        bocl bocl = new bocl();
        f132567d = bocl;
        bxvk.m124024a(bocl.class, bocl);
    }

    private bocl() {
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
            return bxvk.m124022a(f132567d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bock.f132566a});
        } else if (i2 == 3) {
            return new bocl();
        } else {
            if (i2 == 4) {
                return new bxvd(f132567d);
            }
            if (i2 == 5) {
                return f132567d;
            }
            bxxk bxxk = f132568e;
            if (bxxk == null) {
                synchronized (bocl.class) {
                    bxxk = f132568e;
                    if (bxxk == null) {
                        bxxk = new bxve(f132567d);
                        f132568e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
