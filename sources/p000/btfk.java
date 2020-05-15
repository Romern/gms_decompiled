package p000;

/* renamed from: btfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btfk f148693d;

    /* renamed from: e */
    private static volatile bxxk f148694e;

    /* renamed from: a */
    public String f148695a = "";

    /* renamed from: b */
    public String f148696b = "";

    /* renamed from: c */
    public int f148697c;

    static {
        btfk btfk = new btfk();
        f148693d = btfk;
        bxvk.m124024a(btfk.class, btfk);
    }

    private btfk() {
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
            return bxvk.m124022a(f148693d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btfk();
        } else {
            if (i2 == 4) {
                return new bxvd(f148693d);
            }
            if (i2 == 5) {
                return f148693d;
            }
            bxxk bxxk = f148694e;
            if (bxxk == null) {
                synchronized (btfk.class) {
                    bxxk = f148694e;
                    if (bxxk == null) {
                        bxxk = new bxve(f148693d);
                        f148694e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
