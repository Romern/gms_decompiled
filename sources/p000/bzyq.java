package p000;

/* renamed from: bzyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzyq f171917c;

    /* renamed from: d */
    private static volatile bxxk f171918d;

    /* renamed from: a */
    public String f171919a = "";

    /* renamed from: b */
    public boolean f171920b;

    static {
        bzyq bzyq = new bzyq();
        f171917c = bzyq;
        GeneratedMessageLite.m124024a(bzyq.class, bzyq);
    }

    private bzyq() {
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
            return GeneratedMessageLite.m124022a(f171917c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzyq();
        } else {
            if (i2 == 4) {
                return new bxvd(f171917c);
            }
            if (i2 == 5) {
                return f171917c;
            }
            bxxk bxxk = f171918d;
            if (bxxk == null) {
                synchronized (bzyq.class) {
                    bxxk = f171918d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171917c);
                        f171918d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
