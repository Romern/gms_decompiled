package p000;

import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: bhyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhyg {

    /* renamed from: a */
    final /* synthetic */ bhyi f119885a;

    /* renamed from: b */
    private final PlacesParams f119886b;

    /* renamed from: c */
    private final bhyf f119887c;

    public bhyg(bhyi bhyi, PlacesParams placesParams, bhyf bhyf) {
        this.f119885a = bhyi;
        this.f119886b = placesParams;
        this.f119887c = bhyf;
    }

    /* renamed from: a */
    public final void mo64416a(Map map, Collection collection) {
        HashSet hashSet = new HashSet();
        for (List list : map.values()) {
            hashSet.addAll(list);
        }
        bhyi bhyi = this.f119885a;
        bhyv bhyv = bhyi.f119893a;
        PlacesParams placesParams = this.f119886b;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) entry.getValue();
            if (!list2.isEmpty()) {
                hashMap.put((bhyw) entry.getKey(), list2);
            }
        }
        bhyv.mo64428a(hashSet, new bhyh(bhyi, placesParams, hashMap, new HashSet(collection), this.f119887c));
    }
}
