package p000;

/* renamed from: bais */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bais {

    /* renamed from: a */
    public final cijl f101015a;

    /* renamed from: b */
    public final cijl f101016b;

    /* renamed from: c */
    public final cijl f101017c;

    public bais(cijl cijl, cijl cijl2, cijl cijl3) {
        m86941a(cijl, 1);
        this.f101015a = cijl;
        m86941a(cijl2, 2);
        this.f101016b = cijl2;
        m86941a(cijl3, 3);
        this.f101017c = cijl3;
    }

    /* renamed from: a */
    public static void m86941a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
