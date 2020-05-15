package p000;

/* renamed from: bteq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bteq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bteq f148550e;

    /* renamed from: f */
    private static volatile bxxk f148551f;

    /* renamed from: a */
    public bxwc f148552a = bxxn.f165040b;

    /* renamed from: b */
    public btdi f148553b;

    /* renamed from: c */
    public btea f148554c;

    /* renamed from: d */
    public int f148555d;

    static {
        bteq bteq = new bteq();
        f148550e = bteq;
        GeneratedMessageLite.m124024a(bteq.class, bteq);
    }

    private bteq() {
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
            return GeneratedMessageLite.m124022a(f148550e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\f", new Object[]{"a", bzks.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new bteq();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null);
            }
            if (i2 == 5) {
                return f148550e;
            }
            bxxk bxxk = f148551f;
            if (bxxk == null) {
                synchronized (bteq.class) {
                    bxxk = f148551f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148550e);
                        f148551f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
