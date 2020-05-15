package p000;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: uoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uoh {

    /* renamed from: a */
    public static final uog f48391a = m39060a("1");

    /* renamed from: b */
    public static final uog f48392b = m39060a("0");

    /* renamed from: a */
    public static uog m39060a(String str) {
        return new uog(str, bngx.m109376e());
    }

    /* renamed from: b */
    public static uog m39067b(String str) {
        return m39060a(String.valueOf(str).concat(" IS NULL"));
    }

    /* renamed from: c */
    public static uog m39073c(String str) {
        return m39060a(String.valueOf(str).concat(" IS NOT NULL"));
    }

    /* renamed from: d */
    public static uog m39076d(String str, long j) {
        return m39077d(str, Long.toString(j));
    }

    /* renamed from: e */
    public static uog m39078e(String str, long j) {
        return m39079e(str, Long.toString(j));
    }

    /* renamed from: f */
    public static uog m39080f(String str, long j) {
        return m39081f(str, Long.toString(j));
    }

    /* renamed from: g */
    public static uog m39082g(String str, String str2) {
        return new uog(String.valueOf(str).concat(" LIKE ?"), str2);
    }

    /* renamed from: h */
    public static uog m39083h(String str, String str2) {
        return new uog(String.valueOf(str).concat(" NOT LIKE ?"), str2);
    }

    /* renamed from: a */
    public static uog m39061a(String str, long j) {
        return m39062a(str, Long.toString(j));
    }

    /* renamed from: b */
    public static uog m39068b(String str, long j) {
        return m39069b(str, Long.toString(j));
    }

    /* renamed from: c */
    public static uog m39074c(String str, long j) {
        return m39075c(str, Long.toString(j));
    }

    /* renamed from: d */
    public static uog m39077d(String str, String str2) {
        return new uog(String.valueOf(str).concat("<=?"), str2);
    }

    /* renamed from: e */
    public static uog m39079e(String str, String str2) {
        return new uog(String.valueOf(str).concat(">?"), str2);
    }

    /* renamed from: f */
    public static uog m39081f(String str, String str2) {
        return new uog(String.valueOf(str).concat(">=?"), str2);
    }

    /* renamed from: a */
    public static uog m39062a(String str, String str2) {
        return new uog(String.valueOf(str).concat("=?"), str2);
    }

    /* renamed from: b */
    public static uog m39069b(String str, String str2) {
        return new uog(String.valueOf(str).concat("!=?"), str2);
    }

    /* renamed from: c */
    public static uog m39075c(String str, String str2) {
        return new uog(String.valueOf(str).concat("<?"), str2);
    }

    /* renamed from: a */
    public static uog m39063a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15 + str2.length());
        sb.append(str);
        sb.append(" LIKE ? ESCAPE ");
        sb.append(str2);
        return new uog(sb.toString(), str3);
    }

    /* renamed from: b */
    private static uog m39070b(String str, List list) {
        if (list.size() == 1) {
            return (uog) list.get(0);
        }
        bngs bngs = new bngs();
        bngs bngs2 = new bngs();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uog uog = (uog) it.next();
            bngs.mo67668c(uog.f48389a);
            bngs2.mo67666b((Iterable) uog.f48390b);
        }
        StringBuilder sb = new StringBuilder(str.length() + 4);
        sb.append(") ");
        sb.append(str);
        sb.append(" (");
        String join = TextUtils.join(sb.toString(), bngs.mo67664a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
        sb2.append('(');
        sb2.append(join);
        sb2.append(')');
        return new uog(sb2.toString(), bngs2.mo67664a());
    }

    /* renamed from: a */
    public static uog m39064a(String str, List list) {
        return new uog(str, bngx.m109368a((Collection) list));
    }

    /* renamed from: a */
    public static uog m39065a(List list) {
        return !list.isEmpty() ? m39070b("AND", list) : f48391a;
    }

    /* renamed from: a */
    public static uog m39066a(uog... uogArr) {
        return m39065a(bngx.m109370a((Object[]) uogArr));
    }

    /* renamed from: b */
    public static uog m39071b(List list) {
        return !list.isEmpty() ? m39070b("OR", list) : f48392b;
    }

    /* renamed from: b */
    public static uog m39072b(uog... uogArr) {
        return m39071b(bngx.m109370a((Object[]) uogArr));
    }
}
