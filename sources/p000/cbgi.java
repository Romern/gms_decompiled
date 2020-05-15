package p000;

/* renamed from: cbgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbgi f177035d;

    /* renamed from: e */
    private static volatile bxxk f177036e;

    /* renamed from: a */
    public int f177037a = 0;

    /* renamed from: b */
    public Object f177038b;

    /* renamed from: c */
    public int f177039c;

    static {
        cbgi cbgi = new cbgi();
        f177035d = cbgi;
        GeneratedMessageLite.m124024a(cbgi.class, cbgi);
    }

    private cbgi() {
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
            return GeneratedMessageLite.m124022a(f177035d, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001\f\u0002:\u0000\u0003:\u0000\u0004:\u0000\u0005:\u0000\u0006:\u0000\u0007:\u0000\b<\u0000\t<\u0000\n7\u0000\u000b<\u0000\f?\u0000", new Object[]{"b", "a", "c", bzrt.class, bzrt.class, cbgj.class});
        } else if (i2 == 3) {
            return new cbgi();
        } else {
            if (i2 == 4) {
                return new bxvd(f177035d);
            }
            if (i2 == 5) {
                return f177035d;
            }
            bxxk bxxk = f177036e;
            if (bxxk == null) {
                synchronized (cbgi.class) {
                    bxxk = f177036e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177035d);
                        f177036e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
