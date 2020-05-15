package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: mhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mhl {

    /* renamed from: a */
    public static final lvn f33730a = new lvn("PathMapper");

    /* renamed from: b */
    public final List f33731b = new ArrayList();

    /* renamed from: c */
    public Pattern f33732c;

    /* renamed from: d */
    public final Map f33733d = new HashMap();

    /* renamed from: e */
    public final Map f33734e = new HashMap();

    /* renamed from: f */
    public final Set f33735f = new HashSet();

    /* renamed from: g */
    private final String[] f33736g;

    /* renamed from: h */
    private final Map f33737h = new HashMap();

    public mhl(String[] strArr) {
        this.f33736g = strArr;
        StringBuilder sb = new StringBuilder();
        sb.append("/(");
        sb.append(this.f33736g[0]);
        for (int i = 1; i < this.f33736g.length; i++) {
            sb.append("|");
            sb.append(this.f33736g[i]);
        }
        sb.append(")/");
        this.f33732c = Pattern.compile(sb.toString());
    }

    /* renamed from: a */
    public static String m25116a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        if (strArr.length == 0) {
            return "";
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() != 0) {
                if (sb.length() == 0) {
                    sb.append(m25117c(strArr[i]));
                } else {
                    sb.append("/");
                    sb.append(m25117c(strArr[i]).replaceAll("^/+", ""));
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static String m25117c(String str) {
        return str.replaceAll("/+$", "");
    }

    /* renamed from: b */
    public final List mo20020b(String str) {
        List list = (List) this.f33737h.get(str);
        return list == null ? new ArrayList() : list;
    }

    /* renamed from: a */
    public final void mo20016a(String str) {
        mo20017a(str, "image");
    }

    /* renamed from: a */
    public final void mo20017a(String str, String str2) {
        this.f33731b.add(new mhi(str, str2));
    }

    /* renamed from: a */
    public final void mo20018a(String str, mhh mhh) {
        if (!this.f33737h.containsKey(str)) {
            this.f33737h.put(str, new ArrayList());
        }
        ((List) this.f33737h.get(str)).add(mhh);
    }

    /* renamed from: a */
    public final void mo20019a(mhk mhk) {
        if (!this.f33733d.containsKey(mhk.f33728a.f33726b)) {
            this.f33733d.put(mhk.f33728a.f33726b, new ArrayList());
        }
        ((List) this.f33733d.get(mhk.f33728a.f33726b)).add(mhk);
    }
}
