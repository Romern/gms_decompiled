package p000;

/* renamed from: bzjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzjk extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzjk f170300b;

    /* renamed from: d */
    private static volatile bxxk f170301d;

    /* renamed from: a */
    public String f170302a = "";

    /* renamed from: c */
    private int f170303c;

    static {
        bzjk bzjk = new bzjk();
        f170300b = bzjk;
        GeneratedMessageLite.m124024a(bzjk.class, bzjk);
    }

    private bzjk() {
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
            return GeneratedMessageLite.m124022a(f170300b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bzjk();
        } else {
            if (i2 == 4) {
                return new bxvd(f170300b);
            }
            if (i2 == 5) {
                return f170300b;
            }
            bxxk bxxk = f170301d;
            if (bxxk == null) {
                synchronized (bzjk.class) {
                    bxxk = f170301d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170300b);
                        f170301d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
