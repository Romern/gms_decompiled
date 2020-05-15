package p000;

/* renamed from: bpti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpti extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpti f139118e;

    /* renamed from: f */
    private static volatile bxxk f139119f;

    /* renamed from: a */
    public int f139120a;

    /* renamed from: b */
    public int f139121b;

    /* renamed from: c */
    public long f139122c;

    /* renamed from: d */
    public int f139123d;

    static {
        bpti bpti = new bpti();
        f139118e = bpti;
        GeneratedMessageLite.m124024a(bpti.class, bpti);
    }

    private bpti() {
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
            return GeneratedMessageLite.m124022a(f139118e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bpfa.m111856b(), "c", "d", bpel.f137296a});
        } else if (i2 == 3) {
            return new bpti();
        } else {
            if (i2 == 4) {
                return new bxvd(f139118e);
            }
            if (i2 == 5) {
                return f139118e;
            }
            bxxk bxxk = f139119f;
            if (bxxk == null) {
                synchronized (bpti.class) {
                    bxxk = f139119f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139118e);
                        f139119f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
