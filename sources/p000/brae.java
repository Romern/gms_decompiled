package p000;

/* renamed from: brae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brae extends bxvk implements bxxd {

    /* renamed from: e */
    public static final brae f142131e;

    /* renamed from: f */
    private static volatile bxxk f142132f;

    /* renamed from: a */
    public int f142133a;

    /* renamed from: b */
    public int f142134b = 0;

    /* renamed from: c */
    public Object f142135c;

    /* renamed from: d */
    public String f142136d = "";

    static {
        brae brae = new brae();
        f142131e = brae;
        bxvk.m124024a(brae.class, brae);
    }

    private brae() {
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
            return bxvk.m124022a(f142131e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003ဳ\u0000\u0004်\u0000\u0005ျ\u0000\u0006ွ\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new brae();
        } else {
            if (i2 == 4) {
                return new bxvd(f142131e);
            }
            if (i2 == 5) {
                return f142131e;
            }
            bxxk bxxk = f142132f;
            if (bxxk == null) {
                synchronized (brae.class) {
                    bxxk = f142132f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142131e);
                        f142132f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
