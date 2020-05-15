package p000;

import java.util.Locale;

/* renamed from: yyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yyf {
    /* renamed from: a */
    public abstract caad mo30845a();

    /* renamed from: b */
    public abstract caah mo30846b();

    /* renamed from: c */
    public abstract String mo30847c();

    /* renamed from: d */
    public abstract String mo30848d();

    /* renamed from: e */
    public abstract String mo30849e();

    /* renamed from: f */
    public abstract String mo30851f();

    /* renamed from: g */
    public abstract String mo30852g();

    public final String toString() {
        String lowerCase = mo30845a().name().toLowerCase(Locale.ROOT);
        int length = lowerCase.length() + 1 + mo30846b().f172336b.length();
        if (mo30847c() != null) {
            length += mo30847c().length() + 1;
        }
        if (mo30848d() != null) {
            length += mo30848d().length() + 1;
        }
        if (mo30849e() != null) {
            length += mo30849e().length() + 1;
        }
        if (mo30851f() != null) {
            length += mo30851f().length() + 1;
        }
        if (mo30852g() != null) {
            length += mo30852g().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(lowerCase);
        sb.append(':');
        sb.append(mo30846b().f172336b);
        if (mo30847c() != null) {
            sb.append(':');
            sb.append(mo30847c());
        }
        if (mo30848d() != null) {
            sb.append(':');
            sb.append(mo30848d());
        }
        if (mo30849e() != null) {
            sb.append(':');
            sb.append(mo30849e());
        }
        if (mo30851f() != null) {
            sb.append(':');
            sb.append(mo30851f());
        }
        if (mo30852g() != null) {
            sb.append(':');
            sb.append(mo30852g());
        }
        return sb.toString();
    }
}
