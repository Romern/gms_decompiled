package p000;

/* renamed from: btpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btpk f149854c;

    /* renamed from: d */
    private static volatile bxxk f149855d;

    /* renamed from: a */
    public bxwc f149856a = bxxn.f165040b;

    /* renamed from: b */
    public bxyk f149857b;

    static {
        btpk btpk = new btpk();
        f149854c = btpk;
        GeneratedMessageLite.m124024a(btpk.class, btpk);
    }

    private btpk() {
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
            return GeneratedMessageLite.m124022a(f149854c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"a", btpj.class, "b"});
        } else if (i2 == 3) {
            return new btpk();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f149854c;
            }
            bxxk bxxk = f149855d;
            if (bxxk == null) {
                synchronized (btpk.class) {
                    bxxk = f149855d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149854c);
                        f149855d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
