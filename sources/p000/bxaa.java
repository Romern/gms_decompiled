package p000;

/* renamed from: bxaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxaa extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxaa f161662d;

    /* renamed from: e */
    public static final bxvj f161663e;

    /* renamed from: g */
    private static volatile bxxk f161664g;

    /* renamed from: a */
    public int f161665a = 0;

    /* renamed from: b */
    public Object f161666b;

    /* renamed from: c */
    public int f161667c;

    /* renamed from: f */
    private int f161668f;

    static {
        bxaa bxaa = new bxaa();
        f161662d = bxaa;
        GeneratedMessageLite.m124024a(bxaa.class, bxaa);
        bwoq bwoq = bwoq.f160480d;
        bxaa bxaa2 = f161662d;
        f161663e = GeneratedMessageLite.m124006a(bwoq, bxaa2, bxaa2, 254296299, bxzf.MESSAGE);
    }

    private bxaa() {
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
            return GeneratedMessageLite.m124022a(f161662d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "f", "c", bwzy.f161661a, bwzx.class});
        } else if (i2 == 3) {
            return new bxaa();
        } else {
            if (i2 == 4) {
                return new bxvd(f161662d);
            }
            if (i2 == 5) {
                return f161662d;
            }
            bxxk bxxk = f161664g;
            if (bxxk == null) {
                synchronized (bxaa.class) {
                    bxxk = f161664g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161662d);
                        f161664g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
