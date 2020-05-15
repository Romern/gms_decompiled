package p000;

/* renamed from: bwqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwqp f160701c;

    /* renamed from: d */
    public static final bxvj f160702d;

    /* renamed from: e */
    private static volatile bxxk f160703e;

    /* renamed from: a */
    public int f160704a;

    /* renamed from: b */
    public String f160705b = "";

    static {
        bwqp bwqp = new bwqp();
        f160701c = bwqp;
        GeneratedMessageLite.m124024a(bwqp.class, bwqp);
        bwog bwog = bwog.f160437f;
        bwqp bwqp2 = f160701c;
        f160702d = GeneratedMessageLite.m124006a(bwog, bwqp2, bwqp2, 290848975, bxzf.MESSAGE);
    }

    private bwqp() {
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
            return GeneratedMessageLite.m124022a(f160701c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f160701c);
            }
            if (i2 == 5) {
                return f160701c;
            }
            bxxk bxxk = f160703e;
            if (bxxk == null) {
                synchronized (bwqp.class) {
                    bxxk = f160703e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160701c);
                        f160703e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
