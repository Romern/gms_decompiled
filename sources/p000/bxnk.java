package p000;

/* renamed from: bxnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxnk f164044c;

    /* renamed from: d */
    public static final bxvj f164045d;

    /* renamed from: e */
    private static volatile bxxk f164046e;

    /* renamed from: a */
    public int f164047a;

    /* renamed from: b */
    public String f164048b = "";

    static {
        bxnk bxnk = new bxnk();
        f164044c = bxnk;
        GeneratedMessageLite.m124024a(bxnk.class, bxnk);
        bxcf bxcf = bxcf.f162779a;
        bxnk bxnk2 = f164044c;
        f164045d = GeneratedMessageLite.m124006a(bxcf, bxnk2, bxnk2, 144125551, bxzf.MESSAGE);
    }

    private bxnk() {
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
            return GeneratedMessageLite.m124022a(f164044c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxnk();
        } else {
            if (i2 == 4) {
                return new bxvd(f164044c);
            }
            if (i2 == 5) {
                return f164044c;
            }
            bxxk bxxk = f164046e;
            if (bxxk == null) {
                synchronized (bxnk.class) {
                    bxxk = f164046e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164044c);
                        f164046e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
