package p000;

/* renamed from: bsih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsih extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsih f144716d;

    /* renamed from: e */
    private static volatile bxxk f144717e;

    /* renamed from: a */
    public String f144718a = "";

    /* renamed from: b */
    public String f144719b = "";

    /* renamed from: c */
    public bxwc f144720c = bxxn.f165040b;

    static {
        bsih bsih = new bsih();
        f144716d = bsih;
        GeneratedMessageLite.m124024a(bsih.class, bsih);
    }

    private bsih() {
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
            return GeneratedMessageLite.m124022a(f144716d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsih();
        } else {
            if (i2 == 4) {
                return new bxvd(f144716d);
            }
            if (i2 == 5) {
                return f144716d;
            }
            bxxk bxxk = f144717e;
            if (bxxk == null) {
                synchronized (bsih.class) {
                    bxxk = f144717e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144716d);
                        f144717e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
