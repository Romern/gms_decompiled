package p000;

/* renamed from: cbid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbid extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbid f177228c;

    /* renamed from: d */
    private static volatile bxxk f177229d;

    /* renamed from: a */
    public int f177230a = 0;

    /* renamed from: b */
    public Object f177231b;

    static {
        cbid cbid = new cbid();
        f177228c = cbid;
        GeneratedMessageLite.m124024a(cbid.class, cbid);
    }

    private cbid() {
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
            return GeneratedMessageLite.m124022a(f177228c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new cbid();
        } else {
            if (i2 == 4) {
                return new bxvd(f177228c);
            }
            if (i2 == 5) {
                return f177228c;
            }
            bxxk bxxk = f177229d;
            if (bxxk == null) {
                synchronized (cbid.class) {
                    bxxk = f177229d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177228c);
                        f177229d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
