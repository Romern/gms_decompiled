package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfu {

    /* renamed from: a */
    public final Map f3130a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f3131b = new LinkedHashMap();

    /* renamed from: c */
    public String f3132c = null;

    /* renamed from: a */
    public final bia mo3090a(bhz bhz) {
        return (bia) this.f3131b.get(bhz);
    }

    /* renamed from: b */
    public final boolean mo3094b(String str) {
        return this.f3130a.containsKey(str);
    }

    /* renamed from: a */
    public final bia mo3091a(String str, String str2, boolean z) {
        bhz bhz;
        ArrayList arrayList = new ArrayList(this.f3131b.keySet());
        ArrayList arrayList2 = new ArrayList();
        bhz bhz2 = new bhz();
        bhz2.f3263a = str;
        bhz2.f3264b = str2;
        arrayList2.add(bhz2);
        arrayList.retainAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList);
        if (arrayList3.size() <= 0) {
            return null;
        }
        Collections.sort(arrayList3);
        if (z) {
            bhz = (bhz) arrayList3.get(0);
        } else {
            bhz = (bhz) arrayList3.get(arrayList3.size() - 1);
        }
        return (bia) this.f3131b.get(bhz);
    }

    /* renamed from: a */
    public final String mo3092a(String str) {
        return (String) this.f3130a.get(str);
    }

    /* renamed from: a */
    public final List mo3093a(String str, String str2) {
        ArrayList arrayList = new ArrayList(this.f3131b.keySet());
        ArrayList arrayList2 = new ArrayList();
        bhz bhz = new bhz();
        bhz.f3263a = str;
        bhz.f3264b = str2;
        arrayList2.add(bhz);
        arrayList.retainAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3);
        return arrayList3;
    }
}
