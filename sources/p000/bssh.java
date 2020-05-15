package p000;

/* renamed from: bssh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bssh f146859b;

    /* renamed from: c */
    private static volatile bxxk f146860c;

    /* renamed from: a */
    public bxvt f146861a = bxvm.f164965b;

    static {
        bssh bssh = new bssh();
        f146859b = bssh;
        GeneratedMessageLite.m124024a(bssh.class, bssh);
    }

    private bssh() {
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
            return GeneratedMessageLite.m124022a(f146859b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", btuh.m117152b()});
        } else if (i2 == 3) {
            return new bssh();
        } else {
            if (i2 == 4) {
                return new bssg();
            }
            if (i2 == 5) {
                return f146859b;
            }
            bxxk bxxk = f146860c;
            if (bxxk == null) {
                synchronized (bssh.class) {
                    bxxk = f146860c;
                    if (bxxk == null) {
                        bxxk = new bxve(f146859b);
                        f146860c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
