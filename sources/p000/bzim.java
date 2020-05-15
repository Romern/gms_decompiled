package p000;

/* renamed from: bzim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzim extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzim f170209b;

    /* renamed from: c */
    private static volatile bxxk f170210c;

    /* renamed from: a */
    public bxwc f170211a = bxxn.f165040b;

    static {
        bzim bzim = new bzim();
        f170209b = bzim;
        GeneratedMessageLite.m124024a(bzim.class, bzim);
    }

    private bzim() {
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
            return GeneratedMessageLite.m124022a(f170209b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzio.class});
        } else if (i2 == 3) {
            return new bzim();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f170209b;
            }
            bxxk bxxk = f170210c;
            if (bxxk == null) {
                synchronized (bzim.class) {
                    bxxk = f170210c;
                    if (bxxk == null) {
                        bxxk = new bxve(f170209b);
                        f170210c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
