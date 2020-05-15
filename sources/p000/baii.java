package p000;

/* renamed from: baii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baii {

    /* renamed from: a */
    public final cijl f100982a;

    /* renamed from: b */
    public final cijl f100983b;

    /* renamed from: c */
    public final cijl f100984c;

    /* renamed from: d */
    public final cijl f100985d;

    public baii(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        m86936a(cijl, 1);
        this.f100982a = cijl;
        m86936a(cijl2, 2);
        this.f100983b = cijl2;
        m86936a(cijl3, 3);
        this.f100984c = cijl3;
        m86936a(cijl4, 4);
        this.f100985d = cijl4;
    }

    /* renamed from: a */
    public static void m86936a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
