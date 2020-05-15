package p000;

/* renamed from: bzwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzwk f171639c;

    /* renamed from: d */
    private static volatile bxxk f171640d;

    /* renamed from: a */
    public int f171641a;

    /* renamed from: b */
    public bzwj f171642b;

    static {
        bzwk bzwk = new bzwk();
        f171639c = bzwk;
        GeneratedMessageLite.m124024a(bzwk.class, bzwk);
    }

    private bzwk() {
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
            return GeneratedMessageLite.m124022a(f171639c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzwk();
        } else {
            if (i2 == 4) {
                return new bxvd(f171639c);
            }
            if (i2 == 5) {
                return f171639c;
            }
            bxxk bxxk = f171640d;
            if (bxxk == null) {
                synchronized (bzwk.class) {
                    bxxk = f171640d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171639c);
                        f171640d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
