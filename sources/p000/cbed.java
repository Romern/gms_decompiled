package p000;

/* renamed from: cbed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbed extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbed f176829d;

    /* renamed from: e */
    private static volatile bxxk f176830e;

    /* renamed from: a */
    public String f176831a = "";

    /* renamed from: b */
    public boolean f176832b;

    /* renamed from: c */
    public String f176833c = "";

    static {
        cbed cbed = new cbed();
        f176829d = cbed;
        GeneratedMessageLite.m124024a(cbed.class, cbed);
    }

    private cbed() {
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
            return GeneratedMessageLite.m124022a(f176829d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbed();
        } else {
            if (i2 == 4) {
                return new bxvd(f176829d);
            }
            if (i2 == 5) {
                return f176829d;
            }
            bxxk bxxk = f176830e;
            if (bxxk == null) {
                synchronized (cbed.class) {
                    bxxk = f176830e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176829d);
                        f176830e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
