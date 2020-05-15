package p000;

/* renamed from: bxbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxbn f161818c;

    /* renamed from: d */
    private static volatile bxxk f161819d;

    /* renamed from: a */
    public int f161820a;

    /* renamed from: b */
    public bxte f161821b;

    static {
        bxbn bxbn = new bxbn();
        f161818c = bxbn;
        GeneratedMessageLite.m124024a(bxbn.class, bxbn);
    }

    private bxbn() {
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
            return GeneratedMessageLite.m124022a(f161818c, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဉ\b", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxbn();
        } else {
            if (i2 == 4) {
                return new bxvd(f161818c);
            }
            if (i2 == 5) {
                return f161818c;
            }
            bxxk bxxk = f161819d;
            if (bxxk == null) {
                synchronized (bxbn.class) {
                    bxxk = f161819d;
                    if (bxxk == null) {
                        bxxk = new bxve(f161818c);
                        f161819d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
