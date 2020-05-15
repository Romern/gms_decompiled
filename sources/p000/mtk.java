package p000;

/* renamed from: mtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final mtk f34674a;

    /* renamed from: b */
    private static volatile bxxk f34675b;

    static {
        mtk mtk = new mtk();
        f34674a = mtk;
        GeneratedMessageLite.m124024a(mtk.class, mtk);
    }

    private mtk() {
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
            return GeneratedMessageLite.m124022a(f34674a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new mtk();
        }
        if (i2 == 4) {
            return new bxvd(f34674a);
        }
        if (i2 == 5) {
            return f34674a;
        }
        bxxk bxxk = f34675b;
        if (bxxk == null) {
            synchronized (mtk.class) {
                bxxk = f34675b;
                if (bxxk == null) {
                    bxxk = new bxve(f34674a);
                    f34675b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
