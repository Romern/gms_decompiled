package p000;

/* renamed from: bvos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvos extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvos f157212c;

    /* renamed from: e */
    private static volatile bxxk f157213e;

    /* renamed from: a */
    public bvow f157214a;

    /* renamed from: b */
    public bxwc f157215b = bxxn.f165040b;

    /* renamed from: d */
    private int f157216d;

    static {
        bvos bvos = new bvos();
        f157212c = bvos;
        GeneratedMessageLite.m124024a(bvos.class, bvos);
    }

    private bvos() {
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
            return GeneratedMessageLite.m124022a(f157212c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001c", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bvos();
        } else {
            if (i2 == 4) {
                return new bxvd(f157212c);
            }
            if (i2 == 5) {
                return f157212c;
            }
            bxxk bxxk = f157213e;
            if (bxxk == null) {
                synchronized (bvos.class) {
                    bxxk = f157213e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157212c);
                        f157213e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
