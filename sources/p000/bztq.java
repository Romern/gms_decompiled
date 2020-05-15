package p000;

/* renamed from: bztq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bztq f171359c;

    /* renamed from: d */
    private static volatile bxxk f171360d;

    /* renamed from: a */
    public String f171361a = "";

    /* renamed from: b */
    public int f171362b;

    static {
        bztq bztq = new bztq();
        f171359c = bztq;
        GeneratedMessageLite.m124024a(bztq.class, bztq);
    }

    private bztq() {
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
            return GeneratedMessageLite.m124022a(f171359c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bztq();
        } else {
            if (i2 == 4) {
                return new bxvd(f171359c);
            }
            if (i2 == 5) {
                return f171359c;
            }
            bxxk bxxk = f171360d;
            if (bxxk == null) {
                synchronized (bztq.class) {
                    bxxk = f171360d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171359c);
                        f171360d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
