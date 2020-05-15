package p000;

/* renamed from: bsjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsjf f144784c;

    /* renamed from: e */
    private static volatile bxxk f144785e;

    /* renamed from: a */
    public bxwc f144786a = bxxn.f165040b;

    /* renamed from: b */
    public String f144787b = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f144788d;

    static {
        bsjf bsjf = new bsjf();
        f144784c = bsjf;
        GeneratedMessageLite.m124024a(bsjf.class, bsjf);
    }

    private bsjf() {
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
            return GeneratedMessageLite.m124022a(f144784c, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003\u0007", new Object[]{"a", "b", "d"});
        } else if (i2 == 3) {
            return new bsjf();
        } else {
            if (i2 == 4) {
                return new bsje();
            }
            if (i2 == 5) {
                return f144784c;
            }
            bxxk bxxk = f144785e;
            if (bxxk == null) {
                synchronized (bsjf.class) {
                    bxxk = f144785e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144784c);
                        f144785e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
