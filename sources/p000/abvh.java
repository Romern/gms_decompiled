package p000;

/* renamed from: abvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abvh f58535c;

    /* renamed from: d */
    private static volatile bxxk f58536d;

    /* renamed from: a */
    public bxwc f58537a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f58538b = bxxn.f165040b;

    static {
        abvh abvh = new abvh();
        f58535c = abvh;
        GeneratedMessageLite.m124024a(abvh.class, abvh);
    }

    private abvh() {
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
            return GeneratedMessageLite.m124022a(f58535c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[]{"a", abvg.class, "b"});
        } else if (i2 == 3) {
            return new abvh();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f58535c;
            }
            bxxk bxxk = f58536d;
            if (bxxk == null) {
                synchronized (abvh.class) {
                    bxxk = f58536d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58535c);
                        f58536d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo32357a() {
        if (!this.f58537a.mo73666a()) {
            this.f58537a = GeneratedMessageLite.m124021a(this.f58537a);
        }
    }
}
