package p000;

/* renamed from: bvkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvkb f156379c;

    /* renamed from: d */
    private static volatile bxxk f156380d;

    /* renamed from: a */
    public int f156381a = 0;

    /* renamed from: b */
    public Object f156382b;

    static {
        bvkb bvkb = new bvkb();
        f156379c = bvkb;
        GeneratedMessageLite.m124024a(bvkb.class, bvkb);
    }

    private bvkb() {
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
            return GeneratedMessageLite.m124022a(f156379c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȼ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bvkb();
        } else {
            if (i2 == 4) {
                return new bxvd(f156379c);
            }
            if (i2 == 5) {
                return f156379c;
            }
            bxxk bxxk = f156380d;
            if (bxxk == null) {
                synchronized (bvkb.class) {
                    bxxk = f156380d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156379c);
                        f156380d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
