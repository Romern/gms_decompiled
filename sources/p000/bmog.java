package p000;

/* renamed from: bmog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmog extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmog f130225e;

    /* renamed from: f */
    private static volatile bxxk f130226f;

    /* renamed from: a */
    public int f130227a;

    /* renamed from: b */
    public String f130228b = "";

    /* renamed from: c */
    public bmqk f130229c;

    /* renamed from: d */
    public int f130230d = -1;

    static {
        bmog bmog = new bmog();
        f130225e = bmog;
        GeneratedMessageLite.m124024a(bmog.class, bmog);
    }

    private bmog() {
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
            return GeneratedMessageLite.m124022a(f130225e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmog();
        } else {
            if (i2 == 4) {
                return new bxvd(f130225e);
            }
            if (i2 == 5) {
                return f130225e;
            }
            bxxk bxxk = f130226f;
            if (bxxk == null) {
                synchronized (bmog.class) {
                    bxxk = f130226f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130225e);
                        f130226f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
