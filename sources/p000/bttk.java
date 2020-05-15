package p000;

/* renamed from: bttk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bttk f150356c;

    /* renamed from: d */
    private static volatile bxxk f150357d;

    /* renamed from: a */
    public int f150358a = 0;

    /* renamed from: b */
    public Object f150359b;

    static {
        bttk bttk = new bttk();
        f150356c = bttk;
        GeneratedMessageLite.m124024a(bttk.class, bttk);
    }

    private bttk() {
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
            return GeneratedMessageLite.m124022a(f150356c, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0003ဿ\u0000\u0004ဿ\u0000", new Object[]{"b", "a", btsc.class, bttl.f150360a, btsa.f150173a});
        } else if (i2 == 3) {
            return new bttk();
        } else {
            if (i2 == 4) {
                return new bxvd(f150356c);
            }
            if (i2 == 5) {
                return f150356c;
            }
            bxxk bxxk = f150357d;
            if (bxxk == null) {
                synchronized (bttk.class) {
                    bxxk = f150357d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150356c);
                        f150357d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
