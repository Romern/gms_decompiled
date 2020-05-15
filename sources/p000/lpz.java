package p000;

/* renamed from: lpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lpz extends lql {

    /* renamed from: a */
    private final bmxv f26571a;

    /* renamed from: b */
    private final bmxv f26572b;

    /* renamed from: c */
    private final bmxv f26573c;

    /* renamed from: d */
    private final bmxv f26574d;

    /* renamed from: e */
    private final bmxv f26575e;

    public lpz(bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, bmxv bmxv5) {
        this.f26571a = bmxv;
        this.f26572b = bmxv2;
        this.f26573c = bmxv3;
        this.f26574d = bmxv4;
        this.f26575e = bmxv5;
    }

    /* renamed from: a */
    public final bmxv mo15360a() {
        return this.f26571a;
    }

    /* renamed from: b */
    public final bmxv mo15361b() {
        return this.f26572b;
    }

    /* renamed from: c */
    public final bmxv mo15362c() {
        return this.f26573c;
    }

    /* renamed from: d */
    public final bmxv mo15363d() {
        return this.f26574d;
    }

    /* renamed from: e */
    public final bmxv mo15364e() {
        return this.f26575e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lql) {
            lql lql = (lql) obj;
            return this.f26571a.equals(lql.mo15360a()) && this.f26572b.equals(lql.mo15361b()) && this.f26573c.equals(lql.mo15362c()) && this.f26574d.equals(lql.mo15363d()) && this.f26575e.equals(lql.mo15364e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f26571a.hashCode() ^ 1000003) * 1000003) ^ this.f26572b.hashCode()) * 1000003) ^ this.f26573c.hashCode()) * 1000003) ^ this.f26574d.hashCode()) * 1000003) ^ this.f26575e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26571a);
        String valueOf2 = String.valueOf(this.f26572b);
        String valueOf3 = String.valueOf(this.f26573c);
        String valueOf4 = String.valueOf(this.f26574d);
        String valueOf5 = String.valueOf(this.f26575e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 75 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ListItem{title=");
        sb.append(valueOf);
        sb.append(", subtitle=");
        sb.append(valueOf2);
        sb.append(", onClickAction=");
        sb.append(valueOf3);
        sb.append(", startAccessory=");
        sb.append(valueOf4);
        sb.append(", endAccessory=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
