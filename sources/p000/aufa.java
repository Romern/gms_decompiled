package p000;

/* renamed from: aufa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufa extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final aufa f91625b;

    /* renamed from: d */
    private static volatile bxxk f91626d;

    /* renamed from: a */
    public bxyk f91627a;

    /* renamed from: c */
    private int f91628c;

    static {
        aufa aufa = new aufa();
        f91625b = aufa;
        GeneratedMessageLite.m124024a(aufa.class, aufa);
    }

    private aufa() {
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
            return GeneratedMessageLite.m124022a(f91625b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new aufa();
        } else {
            if (i2 == 4) {
                return new bxvd(f91625b);
            }
            if (i2 == 5) {
                return f91625b;
            }
            bxxk bxxk = f91626d;
            if (bxxk == null) {
                synchronized (aufa.class) {
                    bxxk = f91626d;
                    if (bxxk == null) {
                        bxxk = new bxve(f91625b);
                        f91626d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
