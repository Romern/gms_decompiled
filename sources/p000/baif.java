package p000;

/* renamed from: baif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baif {

    /* renamed from: a */
    public final cijl f100956a;

    /* renamed from: b */
    public final cijl f100957b;

    /* renamed from: c */
    public final cijl f100958c;

    /* renamed from: d */
    public final cijl f100959d;

    public baif(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        m86933a(cijl, 1);
        this.f100956a = cijl;
        m86933a(cijl2, 2);
        this.f100957b = cijl2;
        m86933a(cijl3, 3);
        this.f100958c = cijl3;
        m86933a(cijl4, 4);
        this.f100959d = cijl4;
    }

    /* renamed from: a */
    public static void m86933a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
