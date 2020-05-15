package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bzsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzsa {

    /* renamed from: a */
    private final Map f171219a = new HashMap();

    /* renamed from: a */
    public final Set mo74558a() {
        return Collections.unmodifiableSet(this.f171219a.keySet());
    }

    /* renamed from: b */
    public final List mo74561b(String str) {
        List list = (List) this.f171219a.get(str.toLowerCase());
        return list == null ? bngx.m109376e() : list;
    }

    /* renamed from: c */
    public final String mo74563c(String str) {
        if (!this.f171219a.containsKey(str.toLowerCase())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : (List) this.f171219a.get(str.toLowerCase())) {
            if (str2 != null) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f171219a.entrySet());
        Collections.sort(arrayList, bzrz.f171218a);
        StringBuilder sb = new StringBuilder("{");
        bmxr.m108544a(", ").mo66879b("=").mo66872a(sb, arrayList);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo74559a(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        bmxy.m108588a(z);
        bmxy.m108581a(str2);
        String lowerCase = str.toLowerCase();
        this.f171219a.put(lowerCase, new ArrayList());
        ((List) this.f171219a.get(lowerCase)).add(str2);
    }

    /* renamed from: b */
    public final void mo74562b(String str, String str2) {
        bmxy.m108588a(!str.isEmpty());
        bmxy.m108581a(str2);
        String lowerCase = str.toLowerCase();
        if (!this.f171219a.containsKey(lowerCase)) {
            this.f171219a.put(lowerCase, new ArrayList());
        }
        ((List) this.f171219a.get(lowerCase)).add(str2);
    }

    /* renamed from: a */
    public final boolean mo74560a(String str) {
        return this.f171219a.containsKey(str.toLowerCase());
    }
}
