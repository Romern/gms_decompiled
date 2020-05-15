package p000;

/* renamed from: bwtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwtw f160999d;

    /* renamed from: e */
    public static final bxvj f161000e;

    /* renamed from: g */
    private static volatile bxxk f161001g;

    /* renamed from: a */
    public int f161002a = 0;

    /* renamed from: b */
    public Object f161003b;

    /* renamed from: c */
    public int f161004c;

    /* renamed from: f */
    private int f161005f;

    static {
        bwtw bwtw = new bwtw();
        f160999d = bwtw;
        GeneratedMessageLite.m124024a(bwtw.class, bwtw);
        bwoq bwoq = bwoq.f160480d;
        bwtw bwtw2 = f160999d;
        f161000e = GeneratedMessageLite.m124006a(bwoq, bwtw2, bwtw2, 265929774, bxzf.MESSAGE);
    }

    private bwtw() {
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
            return GeneratedMessageLite.m124022a(f160999d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", "f", "c", bwtu.f160998a, bwtx.f161006a});
        } else if (i2 == 3) {
            return new bwtw();
        } else {
            if (i2 == 4) {
                return new bxvd(f160999d);
            }
            if (i2 == 5) {
                return f160999d;
            }
            bxxk bxxk = f161001g;
            if (bxxk == null) {
                synchronized (bwtw.class) {
                    bxxk = f161001g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160999d);
                        f161001g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
