package p000;

/* renamed from: cbbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbw extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbbw f176623a;

    /* renamed from: b */
    private static volatile bxxk f176624b;

    static {
        cbbw cbbw = new cbbw();
        f176623a = cbbw;
        GeneratedMessageLite.m124024a(cbbw.class, cbbw);
    }

    private cbbw() {
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
            return GeneratedMessageLite.m124022a(f176623a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbbw();
        }
        if (i2 == 4) {
            return new bxvd(f176623a);
        }
        if (i2 == 5) {
            return f176623a;
        }
        bxxk bxxk = f176624b;
        if (bxxk == null) {
            synchronized (cbbw.class) {
                bxxk = f176624b;
                if (bxxk == null) {
                    bxxk = new bxve(f176623a);
                    f176624b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
