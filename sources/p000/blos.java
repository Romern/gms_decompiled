package p000;

/* renamed from: blos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blos extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxvu f127127d = new blor();

    /* renamed from: e */
    public static final blos f127128e;

    /* renamed from: f */
    private static volatile bxxk f127129f;

    /* renamed from: a */
    public int f127130a;

    /* renamed from: b */
    public bloj f127131b;

    /* renamed from: c */
    public bxvt f127132c = bxvm.f164965b;

    static {
        blos blos = new blos();
        f127128e = blos;
        GeneratedMessageLite.m124024a(blos.class, blos);
    }

    private blos() {
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
            return GeneratedMessageLite.m124022a(f127128e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"a", "b", "c", bloi.m107414b()});
        } else if (i2 == 3) {
            return new blos();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f127128e;
            }
            bxxk bxxk = f127129f;
            if (bxxk == null) {
                synchronized (blos.class) {
                    bxxk = f127129f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127128e);
                        f127129f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
