package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fjr extends fix {

    /* renamed from: a */
    public final List f16747a = new ArrayList();

    /* renamed from: b */
    public final List f16748b = new ArrayList();

    /* renamed from: c */
    public final Map f16749c = new HashMap();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10877a(fix fix) {
        String str;
        fjr fjr = (fjr) fix;
        fjr.f16747a.addAll(this.f16747a);
        fjr.f16748b.addAll(this.f16748b);
        for (Map.Entry entry : this.f16749c.entrySet()) {
            String str2 = (String) entry.getKey();
            for (fjy fjy : (List) entry.getValue()) {
                if (fjy != null) {
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    if (!fjr.f16749c.containsKey(str)) {
                        fjr.f16749c.put(str, new ArrayList());
                    }
                    ((List) fjr.f16749c.get(str)).add(fjy);
                }
            }
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.f16747a.isEmpty()) {
            hashMap.put("products", this.f16747a);
        }
        if (!this.f16748b.isEmpty()) {
            hashMap.put("promotions", this.f16748b);
        }
        if (!this.f16749c.isEmpty()) {
            hashMap.put("impressions", this.f16749c);
        }
        hashMap.put("productAction", null);
        return fix.m11795a(hashMap);
    }
}
