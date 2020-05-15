package p000;

/* renamed from: bych */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bych extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bych f165647c;

    /* renamed from: e */
    private static volatile bxxk f165648e;

    /* renamed from: a */
    public String f165649a = "";

    /* renamed from: b */
    public boolean f165650b;

    /* renamed from: d */
    private int f165651d;

    static {
        bych bych = new bych();
        f165647c = bych;
        GeneratedMessageLite.m124024a(bych.class, bych);
    }

    private bych() {
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
            return GeneratedMessageLite.m124022a(f165647c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bych();
        } else {
            if (i2 == 4) {
                return new bxvd(f165647c);
            }
            if (i2 == 5) {
                return f165647c;
            }
            bxxk bxxk = f165648e;
            if (bxxk == null) {
                synchronized (bych.class) {
                    bxxk = f165648e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165647c);
                        f165648e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
