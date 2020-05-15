package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: uot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uot extends uor {

    /* renamed from: d */
    public final vdy f48430d;

    public uot(vdy vdy, uje uje) {
        super(vdy, uje);
        this.f48430d = vdy;
    }

    /* renamed from: a */
    public static String m39107a(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    public final String mo27784d() {
        return this.f48430d.f49103c;
    }

    /* renamed from: e */
    public final String mo27785e() {
        return ((uje) mo27777a()).f47760d;
    }

    /* renamed from: f */
    public final String mo27786f() {
        return this.f48430d.f49104d;
    }

    /* renamed from: g */
    public final ula mo27787g() {
        return ((uje) mo27777a()).f47761e;
    }

    /* renamed from: h */
    public final boolean mo27788h() {
        return mo27786f() == null;
    }

    /* renamed from: a */
    public static Map m39108a(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uot uot = (uot) it.next();
            hashMap.put(m39107a(uot.mo27784d(), uot.mo27786f()), uot);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo27783a(String str, Long l) {
        ula g = mo27787g();
        if (l != null) {
            if (g.mo27683a()) {
                g.mo27680a(l.longValue());
            } else {
                g.mo27682a(mo27785e(), l.longValue());
            }
            ((uje) mo27777a()).mo27516a(str);
        } else if (g.mo27683a()) {
            g.mo27681a(str);
        } else {
            ((uje) mo27777a()).mo27516a(str);
        }
    }
}
