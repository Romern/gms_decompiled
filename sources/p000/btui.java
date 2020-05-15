package p000;

/* renamed from: btui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btui extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btui f150491c;

    /* renamed from: d */
    private static volatile bxxk f150492d;

    /* renamed from: a */
    public int f150493a;

    /* renamed from: b */
    public int f150494b;

    static {
        btui btui = new btui();
        f150491c = btui;
        GeneratedMessageLite.m124024a(btui.class, btui);
    }

    private btui() {
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
            return GeneratedMessageLite.m124022a(f150491c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", btur.m117164b()});
        } else if (i2 == 3) {
            return new btui();
        } else {
            if (i2 == 4) {
                return new bxvd(f150491c);
            }
            if (i2 == 5) {
                return f150491c;
            }
            bxxk bxxk = f150492d;
            if (bxxk == null) {
                synchronized (btui.class) {
                    bxxk = f150492d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150491c);
                        f150492d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
