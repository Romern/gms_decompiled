package p000;

/* renamed from: cbnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbnj f177733a;

    /* renamed from: b */
    private static volatile bxxk f177734b;

    static {
        cbnj cbnj = new cbnj();
        f177733a = cbnj;
        GeneratedMessageLite.m124024a(cbnj.class, cbnj);
    }

    private cbnj() {
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
            return GeneratedMessageLite.m124022a(f177733a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbnj();
        }
        if (i2 == 4) {
            return new bxvd(f177733a);
        }
        if (i2 == 5) {
            return f177733a;
        }
        bxxk bxxk = f177734b;
        if (bxxk == null) {
            synchronized (cbnj.class) {
                bxxk = f177734b;
                if (bxxk == null) {
                    bxxk = new bxve(f177733a);
                    f177734b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
