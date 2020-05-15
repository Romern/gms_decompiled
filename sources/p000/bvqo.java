package p000;

/* renamed from: bvqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqo f157398a;

    /* renamed from: b */
    private static volatile bxxk f157399b;

    static {
        bvqo bvqo = new bvqo();
        f157398a = bvqo;
        GeneratedMessageLite.m124024a(bvqo.class, bvqo);
    }

    private bvqo() {
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
            return GeneratedMessageLite.m124022a(f157398a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqo();
        }
        if (i2 == 4) {
            return new bxvd(f157398a);
        }
        if (i2 == 5) {
            return f157398a;
        }
        bxxk bxxk = f157399b;
        if (bxxk == null) {
            synchronized (bvqo.class) {
                bxxk = f157399b;
                if (bxxk == null) {
                    bxxk = new bxve(f157398a);
                    f157399b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
