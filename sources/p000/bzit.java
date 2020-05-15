package p000;

/* renamed from: bzit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzit extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bzit f170233f;

    /* renamed from: g */
    private static volatile bxxk f170234g;

    /* renamed from: a */
    public int f170235a;

    /* renamed from: b */
    public bziu f170236b;

    /* renamed from: c */
    public bxwc f170237c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f170238d = bxxn.f165040b;

    /* renamed from: e */
    public bziu f170239e;

    static {
        bzit bzit = new bzit();
        f170233f = bzit;
        GeneratedMessageLite.m124024a(bzit.class, bzit);
    }

    private bzit() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f170233f, "\u0001\u0004\u0000\u0001\u0002\n\u0004\u0000\u0002\u0000\u0002ဉ\u0001\u0004\u001b\u0006\u001b\nဉ\u0004", new Object[]{"a", "b", "c", bziu.class, "d", bziu.class, "e"});
        } else if (i2 == 3) {
            return new bzit();
        } else {
            if (i2 == 4) {
                return new bxvd(f170233f);
            }
            if (i2 == 5) {
                return f170233f;
            }
            bxxk bxxk = f170234g;
            if (bxxk == null) {
                synchronized (bzit.class) {
                    bxxk = f170234g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170233f);
                        f170234g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
