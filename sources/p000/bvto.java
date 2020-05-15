package p000;

/* renamed from: bvto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvto extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvto f157591c;

    /* renamed from: e */
    private static volatile bxxk f157592e;

    /* renamed from: a */
    public bxwc f157593a = bxxn.f165040b;

    /* renamed from: b */
    public String f157594b = "";

    /* renamed from: d */
    private int f157595d;

    static {
        bvto bvto = new bvto();
        f157591c = bvto;
        GeneratedMessageLite.m124024a(bvto.class, bvto);
    }

    private bvto() {
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
            return GeneratedMessageLite.m124022a(f157591c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"d", "a", bvul.class, "b"});
        } else if (i2 == 3) {
            return new bvto();
        } else {
            if (i2 == 4) {
                return new bxvd(f157591c);
            }
            if (i2 == 5) {
                return f157591c;
            }
            bxxk bxxk = f157592e;
            if (bxxk == null) {
                synchronized (bvto.class) {
                    bxxk = f157592e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157591c);
                        f157592e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
