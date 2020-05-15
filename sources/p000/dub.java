package p000;

import com.google.android.gms.location.places.personalized.AliasedPlace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: dub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dub {

    /* renamed from: a */
    private Map f14024a = null;

    /* renamed from: b */
    private final rkj f14025b;

    public dub(rkj rkj) {
        this.f14025b = rkj;
    }

    /* renamed from: a */
    public final String mo9606a(String str) {
        if (str == null) {
            return null;
        }
        Map map = this.f14024a;
        if (map != null && map.containsKey(str)) {
            return (String) this.f14024a.get(str);
        }
        if (this.f14024a == null) {
            this.f14024a = new HashMap();
        }
        for (AliasedPlace aliasedPlace : this.f14025b.mo24811e()) {
            Iterator it = aliasedPlace.f79579b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = aliasedPlace.f79578a;
                        this.f14024a.put(str, str2);
                        return str2;
                    }
                }
            }
        }
        this.f14024a.put(str, null);
        return null;
    }
}
