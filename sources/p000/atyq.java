package p000;

/* renamed from: atyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final atyq f91143f;

    /* renamed from: g */
    private static volatile bxxk f91144g;

    /* renamed from: a */
    public String f91145a = "";

    /* renamed from: b */
    public atym f91146b;

    /* renamed from: c */
    public String f91147c = "";

    /* renamed from: d */
    public String f91148d = "";

    /* renamed from: e */
    public String f91149e = "";

    static {
        atyq atyq = new atyq();
        f91143f = atyq;
        GeneratedMessageLite.m124024a(atyq.class, atyq);
    }

    private atyq() {
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
            return GeneratedMessageLite.m124022a(f91143f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new atyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f91143f);
            }
            if (i2 == 5) {
                return f91143f;
            }
            bxxk bxxk = f91144g;
            if (bxxk == null) {
                synchronized (atyq.class) {
                    bxxk = f91144g;
                    if (bxxk == null) {
                        bxxk = new bxve(f91143f);
                        f91144g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
