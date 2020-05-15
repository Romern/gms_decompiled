package p000;

/* renamed from: bzen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzen extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzen f169690c;

    /* renamed from: e */
    private static volatile bxxk f169691e;

    /* renamed from: a */
    public String f169692a = "";

    /* renamed from: b */
    public int f169693b;

    /* renamed from: d */
    private int f169694d;

    static {
        bzen bzen = new bzen();
        f169690c = bzen;
        bxvk.m124024a(bzen.class, bzen);
    }

    private bzen() {
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
            return bxvk.m124022a(f169690c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", bzcq.m125653b()});
        } else if (i2 == 3) {
            return new bzen();
        } else {
            if (i2 == 4) {
                return new bxvd(f169690c);
            }
            if (i2 == 5) {
                return f169690c;
            }
            bxxk bxxk = f169691e;
            if (bxxk == null) {
                synchronized (bzen.class) {
                    bxxk = f169691e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169690c);
                        f169691e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
