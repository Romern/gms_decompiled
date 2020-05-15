package p000;

/* renamed from: bvtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtf extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvtf f157562a;

    /* renamed from: b */
    private static volatile bxxk f157563b;

    static {
        bvtf bvtf = new bvtf();
        f157562a = bvtf;
        GeneratedMessageLite.m124024a(bvtf.class, bvtf);
    }

    private bvtf() {
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
            return GeneratedMessageLite.m124022a(f157562a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvtf();
        }
        if (i2 == 4) {
            return new bxvd(f157562a);
        }
        if (i2 == 5) {
            return f157562a;
        }
        bxxk bxxk = f157563b;
        if (bxxk == null) {
            synchronized (bvtf.class) {
                bxxk = f157563b;
                if (bxxk == null) {
                    bxxk = new bxve(f157562a);
                    f157563b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
