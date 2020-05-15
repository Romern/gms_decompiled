package p000;

/* renamed from: bqiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqiw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bqiw f140909f;

    /* renamed from: g */
    private static volatile bxxk f140910g;

    /* renamed from: a */
    public int f140911a;

    /* renamed from: b */
    public int f140912b;

    /* renamed from: c */
    public bqiu f140913c;

    /* renamed from: d */
    public bqje f140914d;

    /* renamed from: e */
    public bqiv f140915e;

    static {
        bqiw bqiw = new bqiw();
        f140909f = bqiw;
        GeneratedMessageLite.m124024a(bqiw.class, bqiw);
    }

    private bqiw() {
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
            return GeneratedMessageLite.m124022a(f140909f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004", new Object[]{"a", "b", bqjl.f140966a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bqiw();
        } else {
            if (i2 == 4) {
                return new bxvd(f140909f);
            }
            if (i2 == 5) {
                return f140909f;
            }
            bxxk bxxk = f140910g;
            if (bxxk == null) {
                synchronized (bqiw.class) {
                    bxxk = f140910g;
                    if (bxxk == null) {
                        bxxk = new bxve(f140909f);
                        f140910g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
