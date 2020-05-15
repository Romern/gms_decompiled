package p000;

/* renamed from: abqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abqt f58012c;

    /* renamed from: d */
    private static volatile bxxk f58013d;

    /* renamed from: a */
    public String f58014a = "";

    /* renamed from: b */
    public String f58015b = "";

    static {
        abqt abqt = new abqt();
        f58012c = abqt;
        GeneratedMessageLite.m124024a(abqt.class, abqt);
    }

    private abqt() {
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
            return GeneratedMessageLite.m124022a(f58012c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new abqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f58012c);
            }
            if (i2 == 5) {
                return f58012c;
            }
            bxxk bxxk = f58013d;
            if (bxxk == null) {
                synchronized (abqt.class) {
                    bxxk = f58013d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58012c);
                        f58013d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
