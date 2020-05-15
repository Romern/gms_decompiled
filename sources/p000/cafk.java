package p000;

/* renamed from: cafk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafk extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cafk f172919a;

    /* renamed from: b */
    public static final bxvj f172920b = GeneratedMessageLite.m124006a(cafx.f173026C, boju.f133349e, boju.f133349e, 21, bxzf.MESSAGE);

    /* renamed from: c */
    private static volatile bxxk f172921c;

    static {
        cafk cafk = new cafk();
        f172919a = cafk;
        GeneratedMessageLite.m124024a(cafk.class, cafk);
    }

    private cafk() {
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
            return GeneratedMessageLite.m124022a(f172919a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cafk();
        }
        if (i2 == 4) {
            return new bxvd(f172919a);
        }
        if (i2 == 5) {
            return f172919a;
        }
        bxxk bxxk = f172921c;
        if (bxxk == null) {
            synchronized (cafk.class) {
                bxxk = f172921c;
                if (bxxk == null) {
                    bxxk = new bxve(f172919a);
                    f172921c = bxxk;
                }
            }
        }
        return bxxk;
    }
}
