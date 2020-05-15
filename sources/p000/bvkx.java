package p000;

/* renamed from: bvkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvkx f156485e;

    /* renamed from: f */
    private static volatile bxxk f156486f;

    /* renamed from: a */
    public int f156487a;

    /* renamed from: b */
    public int f156488b;

    /* renamed from: c */
    public String f156489c = "";

    /* renamed from: d */
    public String f156490d = "";

    static {
        bvkx bvkx = new bvkx();
        f156485e = bvkx;
        GeneratedMessageLite.m124024a(bvkx.class, bvkx);
    }

    private bvkx() {
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
            return GeneratedMessageLite.m124022a(f156485e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", bvkz.m121222b(), "c", "d"});
        } else if (i2 == 3) {
            return new bvkx();
        } else {
            if (i2 == 4) {
                return new bxvd(f156485e);
            }
            if (i2 == 5) {
                return f156485e;
            }
            bxxk bxxk = f156486f;
            if (bxxk == null) {
                synchronized (bvkx.class) {
                    bxxk = f156486f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156485e);
                        f156486f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
