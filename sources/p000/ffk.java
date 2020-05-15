package p000;

/* renamed from: ffk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ffk extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final ffk f16456b;

    /* renamed from: c */
    private static volatile bxxk f16457c;

    /* renamed from: a */
    public String f16458a = "";

    static {
        ffk ffk = new ffk();
        f16456b = ffk;
        GeneratedMessageLite.m124024a(ffk.class, ffk);
    }

    private ffk() {
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
            return GeneratedMessageLite.m124022a(f16456b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new ffk();
        } else {
            if (i2 == 4) {
                return new bxvd(f16456b);
            }
            if (i2 == 5) {
                return f16456b;
            }
            bxxk bxxk = f16457c;
            if (bxxk == null) {
                synchronized (ffk.class) {
                    bxxk = f16457c;
                    if (bxxk == null) {
                        bxxk = new bxve(f16456b);
                        f16457c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
