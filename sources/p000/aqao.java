package p000;

/* renamed from: aqao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqao extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aqao f85418e;

    /* renamed from: f */
    private static volatile bxxk f85419f;

    /* renamed from: a */
    public int f85420a;

    /* renamed from: b */
    public boolean f85421b;

    /* renamed from: c */
    public long f85422c;

    /* renamed from: d */
    public bxwc f85423d = bxxn.f165040b;

    static {
        aqao aqao = new aqao();
        f85418e = aqao;
        GeneratedMessageLite.m124024a(aqao.class, aqao);
    }

    private aqao() {
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
            return GeneratedMessageLite.m124022a(f85418e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", aqan.class});
        } else if (i2 == 3) {
            return new aqao();
        } else {
            if (i2 == 4) {
                return new aqam();
            }
            if (i2 == 5) {
                return f85418e;
            }
            bxxk bxxk = f85419f;
            if (bxxk == null) {
                synchronized (aqao.class) {
                    bxxk = f85419f;
                    if (bxxk == null) {
                        bxxk = new bxve(f85418e);
                        f85419f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
