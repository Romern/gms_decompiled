package p000;

/* renamed from: byhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byhs f166502c;

    /* renamed from: e */
    private static volatile bxxk f166503e;

    /* renamed from: a */
    public boolean f166504a;

    /* renamed from: b */
    public int f166505b = 100;

    /* renamed from: d */
    private int f166506d;

    static {
        byhs byhs = new byhs();
        f166502c = byhs;
        bxvk.m124024a(byhs.class, byhs);
    }

    private byhs() {
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
            return bxvk.m124022a(f166502c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဋ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new byhs();
        } else {
            if (i2 == 4) {
                return new bxvd(f166502c);
            }
            if (i2 == 5) {
                return f166502c;
            }
            bxxk bxxk = f166503e;
            if (bxxk == null) {
                synchronized (byhs.class) {
                    bxxk = f166503e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166502c);
                        f166503e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
