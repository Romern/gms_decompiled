package p000;

/* renamed from: bvnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvnn f156947e;

    /* renamed from: f */
    private static volatile bxxk f156948f;

    /* renamed from: a */
    public int f156949a;

    /* renamed from: b */
    public int f156950b;

    /* renamed from: c */
    public int f156951c;

    /* renamed from: d */
    public bxvw f156952d = bxwq.f165002b;

    static {
        bvnn bvnn = new bvnn();
        f156947e = bvnn;
        GeneratedMessageLite.m124024a(bvnn.class, bvnn);
    }

    private bvnn() {
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
            return GeneratedMessageLite.m124022a(f156947e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003\u0014", new Object[]{"a", "b", bvnm.m121291b(), "c", "d"});
        } else if (i2 == 3) {
            return new bvnn();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f156947e;
            }
            bxxk bxxk = f156948f;
            if (bxxk == null) {
                synchronized (bvnn.class) {
                    bxxk = f156948f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156947e);
                        f156948f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
