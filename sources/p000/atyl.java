package p000;

/* renamed from: atyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final atyl f91116c;

    /* renamed from: d */
    private static volatile bxxk f91117d;

    /* renamed from: a */
    public String f91118a = "";

    /* renamed from: b */
    public String f91119b = "";

    static {
        atyl atyl = new atyl();
        f91116c = atyl;
        GeneratedMessageLite.m124024a(atyl.class, atyl);
    }

    private atyl() {
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
            return GeneratedMessageLite.m124022a(f91116c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new atyl();
        } else {
            if (i2 == 4) {
                return new bxvd(f91116c);
            }
            if (i2 == 5) {
                return f91116c;
            }
            bxxk bxxk = f91117d;
            if (bxxk == null) {
                synchronized (atyl.class) {
                    bxxk = f91117d;
                    if (bxxk == null) {
                        bxxk = new bxve(f91116c);
                        f91117d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
