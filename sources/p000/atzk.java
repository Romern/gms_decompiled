package p000;

/* renamed from: atzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final atzk f91234c;

    /* renamed from: d */
    private static volatile bxxk f91235d;

    /* renamed from: a */
    public String f91236a = "";

    /* renamed from: b */
    public int f91237b;

    static {
        atzk atzk = new atzk();
        f91234c = atzk;
        bxvk.m124024a(atzk.class, atzk);
    }

    private atzk() {
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
            return bxvk.m124022a(f91234c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new atzk();
        } else {
            if (i2 == 4) {
                return new bxvd(f91234c);
            }
            if (i2 == 5) {
                return f91234c;
            }
            bxxk bxxk = f91235d;
            if (bxxk == null) {
                synchronized (atzk.class) {
                    bxxk = f91235d;
                    if (bxxk == null) {
                        bxxk = new bxve(f91234c);
                        f91235d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
