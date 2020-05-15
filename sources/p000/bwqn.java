package p000;

/* renamed from: bwqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwqn f160687c;

    /* renamed from: d */
    public static final bxvj f160688d;

    /* renamed from: e */
    private static volatile bxxk f160689e;

    /* renamed from: a */
    public int f160690a;

    /* renamed from: b */
    public String f160691b = "";

    static {
        bwqn bwqn = new bwqn();
        f160687c = bwqn;
        bxvk.m124024a(bwqn.class, bwqn);
        bwog bwog = bwog.f160437f;
        bwqn bwqn2 = f160687c;
        f160688d = bxvk.m124006a(bwog, bwqn2, bwqn2, 290848974, bxzf.MESSAGE);
    }

    private bwqn() {
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
            return bxvk.m124022a(f160687c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwqn();
        } else {
            if (i2 == 4) {
                return new bxvd(f160687c);
            }
            if (i2 == 5) {
                return f160687c;
            }
            bxxk bxxk = f160689e;
            if (bxxk == null) {
                synchronized (bwqn.class) {
                    bxxk = f160689e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160687c);
                        f160689e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
