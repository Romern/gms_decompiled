package p000;

import com.google.android.gms.location.places.PlaceFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Deprecated
/* renamed from: aeln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeln {

    /* renamed from: a */
    public Collection f63494a = null;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.location.places.PlaceFilter.<init>(java.util.List, boolean, java.util.List, java.util.List):void
     arg types: [java.util.ArrayList, int, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY]]
     candidates:
      com.google.android.gms.location.places.PlaceFilter.<init>(java.util.Collection, boolean, java.util.Collection, java.util.Collection):void
      com.google.android.gms.location.places.PlaceFilter.<init>(java.util.List, boolean, java.util.List, java.util.List):void */
    /* renamed from: a */
    public final PlaceFilter mo34303a() {
        ArrayList arrayList;
        Collection collection = this.f63494a;
        if (collection != null) {
            arrayList = new ArrayList(collection);
        } else {
            arrayList = null;
        }
        return new PlaceFilter((List) arrayList, false, (List) null, (List) null);
    }
}
