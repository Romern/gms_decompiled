package p000;

/* renamed from: cbef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbef extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbef f176837c;

    /* renamed from: d */
    private static volatile bxxk f176838d;

    /* renamed from: a */
    public cbdk f176839a;

    /* renamed from: b */
    public int f176840b;

    static {
        cbef cbef = new cbef();
        f176837c = cbef;
        GeneratedMessageLite.m124024a(cbef.class, cbef);
    }

    private cbef() {
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
            return GeneratedMessageLite.m124022a(f176837c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbef();
        } else {
            if (i2 == 4) {
                return new bxvd(f176837c);
            }
            if (i2 == 5) {
                return f176837c;
            }
            bxxk bxxk = f176838d;
            if (bxxk == null) {
                synchronized (cbef.class) {
                    bxxk = f176838d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176837c);
                        f176838d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
