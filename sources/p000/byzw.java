package p000;

/* renamed from: byzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byzw f169185e;

    /* renamed from: f */
    private static volatile bxxk f169186f;

    /* renamed from: a */
    public int f169187a;

    /* renamed from: b */
    public int f169188b;

    /* renamed from: c */
    public int f169189c;

    /* renamed from: d */
    public int f169190d;

    static {
        byzw byzw = new byzw();
        f169185e = byzw;
        GeneratedMessageLite.m124024a(byzw.class, byzw);
    }

    private byzw() {
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
            return GeneratedMessageLite.m124022a(f169185e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဌ\u0003", new Object[]{"a", "b", bzae.f169214a, "c", bzam.f169218a, "d", bzbd.f169244a});
        } else if (i2 == 3) {
            return new byzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f169185e);
            }
            if (i2 == 5) {
                return f169185e;
            }
            bxxk bxxk = f169186f;
            if (bxxk == null) {
                synchronized (byzw.class) {
                    bxxk = f169186f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169185e);
                        f169186f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
