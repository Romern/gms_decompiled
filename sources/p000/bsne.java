package p000;

/* renamed from: bsne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsne extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsne f146234a;

    /* renamed from: b */
    private static volatile bxxk f146235b;

    static {
        bsne bsne = new bsne();
        f146234a = bsne;
        GeneratedMessageLite.m124024a(bsne.class, bsne);
    }

    private bsne() {
        ByteString bxtx = bxtx.f164797b;
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f146234a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsne();
        }
        if (i2 == 4) {
            return new bxvd(f146234a);
        }
        if (i2 == 5) {
            return f146234a;
        }
        bxxk bxxk = f146235b;
        if (bxxk == null) {
            synchronized (bsne.class) {
                bxxk = f146235b;
                if (bxxk == null) {
                    bxxk = new bxve(f146234a);
                    f146235b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
