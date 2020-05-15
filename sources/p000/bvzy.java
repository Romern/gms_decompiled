package p000;

/* renamed from: bvzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvzy f158592b;

    /* renamed from: c */
    private static volatile bxxk f158593c;

    /* renamed from: a */
    public int f158594a;

    static {
        bvzy bvzy = new bvzy();
        f158592b = bvzy;
        GeneratedMessageLite.m124024a(bvzy.class, bvzy);
    }

    private bvzy() {
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
            return GeneratedMessageLite.m124022a(f158592b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bvzy();
        } else {
            if (i2 == 4) {
                return new bxvd(f158592b);
            }
            if (i2 == 5) {
                return f158592b;
            }
            bxxk bxxk = f158593c;
            if (bxxk == null) {
                synchronized (bvzy.class) {
                    bxxk = f158593c;
                    if (bxxk == null) {
                        bxxk = new bxve(f158592b);
                        f158593c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
