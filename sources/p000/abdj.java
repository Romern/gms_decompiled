package p000;

/* renamed from: abdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdj extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final abdj f57095a;

    /* renamed from: b */
    private static volatile bxxk f57096b;

    static {
        abdj abdj = new abdj();
        f57095a = abdj;
        GeneratedMessageLite.m124024a(abdj.class, abdj);
    }

    private abdj() {
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
            return GeneratedMessageLite.m124022a(f57095a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new abdj();
        }
        if (i2 == 4) {
            return new bxvd(f57095a);
        }
        if (i2 == 5) {
            return f57095a;
        }
        bxxk bxxk = f57096b;
        if (bxxk == null) {
            synchronized (abdj.class) {
                bxxk = f57096b;
                if (bxxk == null) {
                    bxxk = new bxve(f57095a);
                    f57096b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
