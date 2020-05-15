package p000;

/* renamed from: btot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btot extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btot f149799d;

    /* renamed from: e */
    private static volatile bxxk f149800e;

    /* renamed from: a */
    public String f149801a = "";

    /* renamed from: b */
    public btiw f149802b;

    /* renamed from: c */
    public btnn f149803c;

    static {
        btot btot = new btot();
        f149799d = btot;
        GeneratedMessageLite.m124024a(btot.class, btot);
    }

    private btot() {
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
            return GeneratedMessageLite.m124022a(f149799d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"a", "c", "b"});
        } else if (i2 == 3) {
            return new btot();
        } else {
            if (i2 == 4) {
                return new bxvd(f149799d);
            }
            if (i2 == 5) {
                return f149799d;
            }
            bxxk bxxk = f149800e;
            if (bxxk == null) {
                synchronized (btot.class) {
                    bxxk = f149800e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149799d);
                        f149800e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
