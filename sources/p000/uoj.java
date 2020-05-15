package p000;

/* renamed from: uoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uoj implements uom {

    /* renamed from: a */
    public String f48399a = null;

    /* renamed from: b */
    public String f48400b = null;

    /* renamed from: c */
    private final uoi f48401c;

    /* renamed from: d */
    private final String f48402d;

    private uoj(uoi uoi, String str) {
        this.f48401c = uoi;
        sdo.m34959a((Object) str);
        this.f48402d = str;
    }

    /* renamed from: a */
    public static uoj m39084a(String str) {
        return new uoj(uoi.LEFT_OUTER, str);
    }

    /* renamed from: b */
    public static uoj m39085b(String str) {
        return new uoj(uoi.INNER, str);
    }

    public final String toString() {
        return mo27759a();
    }

    /* renamed from: a */
    public final String mo27759a() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f48401c.f48398e);
        sb.append("JOIN ");
        sb.append(this.f48402d);
        if (this.f48400b != null) {
            sb.append(" AS ");
            sb.append(this.f48400b);
        }
        if (this.f48399a != null) {
            sb.append(" ON ");
            sb.append(this.f48399a);
        }
        return sb.toString();
    }
}
