package p000;

/* renamed from: btln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btln extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btln f149395c;

    /* renamed from: d */
    private static volatile bxxk f149396d;

    /* renamed from: a */
    public btnd f149397a;

    /* renamed from: b */
    public String f149398b = "";

    static {
        btln btln = new btln();
        f149395c = btln;
        GeneratedMessageLite.m124024a(btln.class, btln);
    }

    private btln() {
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
            return GeneratedMessageLite.m124022a(f149395c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btln();
        } else {
            if (i2 == 4) {
                return new bxvd(f149395c);
            }
            if (i2 == 5) {
                return f149395c;
            }
            bxxk bxxk = f149396d;
            if (bxxk == null) {
                synchronized (btln.class) {
                    bxxk = f149396d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149395c);
                        f149396d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
