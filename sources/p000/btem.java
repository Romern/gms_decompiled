package p000;

/* renamed from: btem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btem extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btem f148532c;

    /* renamed from: d */
    private static volatile bxxk f148533d;

    /* renamed from: a */
    public bxwc f148534a = bxxn.f165040b;

    /* renamed from: b */
    public btfb f148535b;

    static {
        btem btem = new btem();
        f148532c = btem;
        GeneratedMessageLite.m124024a(btem.class, btem);
    }

    private btem() {
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
            return GeneratedMessageLite.m124022a(f148532c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\t", new Object[]{"a", btfi.class, "b"});
        } else if (i2 == 3) {
            return new btem();
        } else {
            if (i2 == 4) {
                return new btel();
            }
            if (i2 == 5) {
                return f148532c;
            }
            bxxk bxxk = f148533d;
            if (bxxk == null) {
                synchronized (btem.class) {
                    bxxk = f148533d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148532c);
                        f148533d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
