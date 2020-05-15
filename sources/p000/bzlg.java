package p000;

/* renamed from: bzlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlg extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bzlg f170523a;

    /* renamed from: e */
    private static volatile bxxk f170524e;

    /* renamed from: b */
    private int f170525b;

    /* renamed from: c */
    private bzlh f170526c;

    /* renamed from: d */
    private byte f170527d = 2;

    static {
        bzlg bzlg = new bzlg();
        f170523a = bzlg;
        GeneratedMessageLite.m124024a(bzlg.class, bzlg);
    }

    private bzlg() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170527d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170527d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170523a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new bzlg();
        } else {
            if (i2 == 4) {
                return new bxvd(f170523a);
            }
            if (i2 == 5) {
                return f170523a;
            }
            bxxk bxxk = f170524e;
            if (bxxk == null) {
                synchronized (bzlg.class) {
                    bxxk = f170524e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170523a);
                        f170524e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
