package p000;

/* renamed from: btks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btks extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btks f149297c;

    /* renamed from: d */
    private static volatile bxxk f149298d;

    /* renamed from: a */
    public int f149299a = 0;

    /* renamed from: b */
    public Object f149300b;

    static {
        btks btks = new btks();
        f149297c = btks;
        bxvk.m124024a(btks.class, btks);
    }

    private btks() {
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
            return bxvk.m124022a(f149297c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new btks();
        } else {
            if (i2 == 4) {
                return new bxvd(f149297c);
            }
            if (i2 == 5) {
                return f149297c;
            }
            bxxk bxxk = f149298d;
            if (bxxk == null) {
                synchronized (btks.class) {
                    bxxk = f149298d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149297c);
                        f149298d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
