package p000;

/* renamed from: btas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btas extends GeneratedMessageLite implements btat {

    /* renamed from: c */
    public static final btas f148044c;

    /* renamed from: d */
    private static volatile bxxk f148045d;

    /* renamed from: a */
    public bxwc f148046a = bxxn.f165040b;

    /* renamed from: b */
    public long f148047b;

    static {
        btas btas = new btas();
        f148044c = btas;
        GeneratedMessageLite.m124024a(btas.class, btas);
    }

    private btas() {
    }

    /* renamed from: a */
    public final btaq mo70732a(int i) {
        throw null;
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
            return GeneratedMessageLite.m124022a(f148044c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"a", btaq.class, "b"});
        } else if (i2 == 3) {
            return new btas();
        } else {
            if (i2 == 4) {
                return new btar();
            }
            if (i2 == 5) {
                return f148044c;
            }
            bxxk bxxk = f148045d;
            if (bxxk == null) {
                synchronized (btas.class) {
                    bxxk = f148045d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148044c);
                        f148045d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70733a() {
        if (!this.f148046a.mo73666a()) {
            this.f148046a = GeneratedMessageLite.m124021a(this.f148046a);
        }
    }
}
