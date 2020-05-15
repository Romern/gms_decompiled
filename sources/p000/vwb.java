package p000;

/* renamed from: vwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final vwb f50109c;

    /* renamed from: d */
    private static volatile bxxk f50110d;

    /* renamed from: a */
    public int f50111a;

    /* renamed from: b */
    public vvt f50112b;

    static {
        vwb vwb = new vwb();
        f50109c = vwb;
        GeneratedMessageLite.m124024a(vwb.class, vwb);
    }

    private vwb() {
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
            return GeneratedMessageLite.m124022a(f50109c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new vwb();
        } else {
            if (i2 == 4) {
                return new bxvd(f50109c);
            }
            if (i2 == 5) {
                return f50109c;
            }
            bxxk bxxk = f50110d;
            if (bxxk == null) {
                synchronized (vwb.class) {
                    bxxk = f50110d;
                    if (bxxk == null) {
                        bxxk = new bxve(f50109c);
                        f50110d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
