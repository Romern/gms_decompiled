package p000;

/* renamed from: bsss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsss extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsss f146910a;

    /* renamed from: b */
    private static volatile bxxk f146911b;

    static {
        bsss bsss = new bsss();
        f146910a = bsss;
        GeneratedMessageLite.m124024a(bsss.class, bsss);
    }

    private bsss() {
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
            return GeneratedMessageLite.m124022a(f146910a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsss();
        }
        if (i2 == 4) {
            return new bxvd(f146910a);
        }
        if (i2 == 5) {
            return f146910a;
        }
        bxxk bxxk = f146911b;
        if (bxxk == null) {
            synchronized (bsss.class) {
                bxxk = f146911b;
                if (bxxk == null) {
                    bxxk = new bxve(f146910a);
                    f146911b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
