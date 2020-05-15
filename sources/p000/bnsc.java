package p000;

/* renamed from: bnsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnsc {

    /* renamed from: a */
    public static final bnsc f132067a = new bnsa();

    /* renamed from: a */
    public abstract String mo68449a();

    /* renamed from: b */
    public abstract String mo68450b();

    /* renamed from: c */
    public abstract int mo68451c();

    /* renamed from: d */
    public abstract String mo68452d();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogSite{ class=");
        sb.append(mo68449a());
        sb.append(", method=");
        sb.append(mo68450b());
        sb.append(", line=");
        sb.append(mo68451c());
        if (mo68452d() != null) {
            sb.append(", file=");
            sb.append(mo68452d());
        }
        sb.append(" }");
        return sb.toString();
    }
}
