package p000;

/* renamed from: bxin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxin extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxin f163538c;

    /* renamed from: d */
    private static volatile bxxk f163539d;

    /* renamed from: a */
    public int f163540a;

    /* renamed from: b */
    public int f163541b;

    static {
        bxin bxin = new bxin();
        f163538c = bxin;
        GeneratedMessageLite.m124024a(bxin.class, bxin);
    }

    private bxin() {
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
            return GeneratedMessageLite.m124022a(f163538c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxim.f163537a});
        } else if (i2 == 3) {
            return new bxin();
        } else {
            if (i2 == 4) {
                return new bxvd(f163538c);
            }
            if (i2 == 5) {
                return f163538c;
            }
            bxxk bxxk = f163539d;
            if (bxxk == null) {
                synchronized (bxin.class) {
                    bxxk = f163539d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163538c);
                        f163539d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
