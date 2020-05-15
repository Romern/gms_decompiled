package p000;

/* renamed from: abdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdq extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final abdq f57120e;

    /* renamed from: f */
    private static volatile bxxk f57121f;

    /* renamed from: a */
    public int f57122a;

    /* renamed from: b */
    public abdp f57123b;

    /* renamed from: c */
    public bxyl f57124c;

    /* renamed from: d */
    public boolean f57125d;

    static {
        abdq abdq = new abdq();
        f57120e = abdq;
        GeneratedMessageLite.m124024a(abdq.class, abdq);
    }

    private abdq() {
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
            return GeneratedMessageLite.m124022a(f57120e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abdq();
        } else {
            if (i2 == 4) {
                return new bxvd(f57120e);
            }
            if (i2 == 5) {
                return f57120e;
            }
            bxxk bxxk = f57121f;
            if (bxxk == null) {
                synchronized (abdq.class) {
                    bxxk = f57121f;
                    if (bxxk == null) {
                        bxxk = new bxve(f57120e);
                        f57121f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
