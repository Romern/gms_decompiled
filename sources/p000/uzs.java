package p000;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: uzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzs {

    /* renamed from: a */
    public static final uzs f48778a = new uzs("");

    /* renamed from: b */
    public final String f48779b;

    public uzs(String str) {
        sdo.m34959a((Object) str);
        this.f48779b = str;
    }

    /* renamed from: a */
    public static uzs m39846a() {
        return m39854c(vae.f48817l.f48803a, "true");
    }

    /* renamed from: b */
    public static uzs m39853b(String str, String str2) {
        return m39849a(str, str2, "contains");
    }

    /* renamed from: c */
    public static uzs m39854c(String str, String str2) {
        return m39849a(str, str2, "=");
    }

    /* renamed from: d */
    public static uzs m39855d(String str, String str2) {
        return m39849a(str, str2, "<");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f48779b.equals(((uzs) obj).f48779b);
    }

    public final int hashCode() {
        return this.f48779b.hashCode();
    }

    /* renamed from: a */
    public static uzs m39847a(String str) {
        return m39853b(vae.f48807b.f48803a, vpw.m41037b(str));
    }

    /* renamed from: a */
    public static uzs m39848a(String str, String str2) {
        return m39849a(str2, str, "in");
    }

    /* renamed from: a */
    public static uzs m39849a(String str, String str2, String str3) {
        return new uzs(String.format(Locale.US, "%s %s %s", str, str3, str2));
    }

    /* renamed from: a */
    public static uzs m39850a(String str, List list) {
        if (list.size() == 0) {
            sdo.m34970a(!str.equals("or"));
            return f48778a;
        }
        String str2 = f48778a.f48779b;
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = true;
        while (it.hasNext()) {
            uzs uzs = (uzs) it.next();
            if (f48778a.equals(uzs)) {
                if (str.equals("or")) {
                    return f48778a;
                }
            } else if (!z2) {
                str2 = String.format(Locale.US, "%s %s %s", str2, str, uzs.f48779b);
                z = true;
            } else {
                str2 = uzs.f48779b;
                z2 = false;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2);
            sb.append("(");
            sb.append(str2);
            sb.append(")");
            str2 = sb.toString();
        }
        return new uzs(str2);
    }

    /* renamed from: a */
    public static uzs m39851a(Date date) {
        sdo.m34959a(date);
        if (date.getTime() == Long.MAX_VALUE) {
            return f48778a;
        }
        sdo.m34974b(date.getTime() <= 9223372036847575807L);
        long time = date.getTime();
        vpx vpx = new vpx("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        vpx.mo28732a(TimeZone.getTimeZone("UTC"));
        String a = vpx.mo28731a(new Date(time + 7200000));
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2);
        sb.append("'");
        sb.append(a);
        sb.append("'");
        return m39855d(vae.f48811f.f48803a, sb.toString());
    }

    /* renamed from: a */
    public static uzs m39852a(List list) {
        return m39850a("and", list);
    }
}
