package p000;

/* renamed from: bvua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvua extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvua f157643b;

    /* renamed from: c */
    private static volatile bxxk f157644c;

    /* renamed from: a */
    public bxwc f157645a = bxxn.f165040b;

    static {
        bvua bvua = new bvua();
        f157643b = bvua;
        GeneratedMessageLite.m124024a(bvua.class, bvua);
    }

    private bvua() {
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
            return GeneratedMessageLite.m124022a(f157643b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bvty.class});
        } else if (i2 == 3) {
            return new bvua();
        } else {
            if (i2 == 4) {
                return new bxvd(f157643b);
            }
            if (i2 == 5) {
                return f157643b;
            }
            bxxk bxxk = f157644c;
            if (bxxk == null) {
                synchronized (bvua.class) {
                    bxxk = f157644c;
                    if (bxxk == null) {
                        bxxk = new bxve(f157643b);
                        f157644c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
