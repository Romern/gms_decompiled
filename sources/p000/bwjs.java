package p000;

/* renamed from: bwjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjs extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bwjs f159864a;

    /* renamed from: b */
    private static volatile bxxk f159865b;

    static {
        bwjs bwjs = new bwjs();
        f159864a = bwjs;
        GeneratedMessageLite.m124024a(bwjs.class, bwjs);
    }

    private bwjs() {
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
            return GeneratedMessageLite.m124022a(f159864a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bwjs();
        }
        if (i2 == 4) {
            return new bxvd(f159864a);
        }
        if (i2 == 5) {
            return f159864a;
        }
        bxxk bxxk = f159865b;
        if (bxxk == null) {
            synchronized (bwjs.class) {
                bxxk = f159865b;
                if (bxxk == null) {
                    bxxk = new bxve(f159864a);
                    f159865b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
