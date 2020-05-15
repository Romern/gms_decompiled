package p000;

/* renamed from: abkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abkk {

    /* renamed from: a */
    public final cijl f57621a;

    /* renamed from: b */
    public final cijl f57622b;

    /* renamed from: c */
    public final cijl f57623c;

    public abkk(cijl cijl, cijl cijl2, cijl cijl3) {
        m47815a(cijl, 1);
        this.f57621a = cijl;
        m47815a(cijl2, 2);
        this.f57622b = cijl2;
        m47815a(cijl3, 3);
        this.f57623c = cijl3;
    }

    /* renamed from: a */
    public static void m47815a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
