package p000;

/* renamed from: bumu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bumu f154275e;

    /* renamed from: f */
    private static volatile bxxk f154276f;

    /* renamed from: a */
    public int f154277a;

    /* renamed from: b */
    public bunb f154278b;

    /* renamed from: c */
    public bunb f154279c;

    /* renamed from: d */
    public bunb f154280d;

    static {
        bumu bumu = new bumu();
        f154275e = bumu;
        GeneratedMessageLite.m124024a(bumu.class, bumu);
    }

    private bumu() {
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
            return GeneratedMessageLite.m124022a(f154275e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bumu();
        } else {
            if (i2 == 4) {
                return new bxvd(f154275e);
            }
            if (i2 == 5) {
                return f154275e;
            }
            bxxk bxxk = f154276f;
            if (bxxk == null) {
                synchronized (bumu.class) {
                    bxxk = f154276f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154275e);
                        f154276f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
