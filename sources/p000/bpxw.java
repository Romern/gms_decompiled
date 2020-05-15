package p000;

/* renamed from: bpxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpxw f139795c;

    /* renamed from: d */
    private static volatile bxxk f139796d;

    /* renamed from: a */
    public int f139797a;

    /* renamed from: b */
    public int f139798b;

    static {
        bpxw bpxw = new bpxw();
        f139795c = bpxw;
        GeneratedMessageLite.m124024a(bpxw.class, bpxw);
    }

    private bpxw() {
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
            return GeneratedMessageLite.m124022a(f139795c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0003", new Object[]{"a", "b", bqak.m112469b()});
        } else if (i2 == 3) {
            return new bpxw();
        } else {
            if (i2 == 4) {
                return new bxvd(f139795c);
            }
            if (i2 == 5) {
                return f139795c;
            }
            bxxk bxxk = f139796d;
            if (bxxk == null) {
                synchronized (bpxw.class) {
                    bxxk = f139796d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139795c);
                        f139796d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
