package p000;

import android.util.Log;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bhqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqf implements aubq {

    /* renamed from: a */
    final /* synthetic */ bhyb f119304a;

    public bhqf(bhyb bhyb) {
        this.f119304a = bhyb;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            aelj aelj = (aelj) aucb.mo50386d();
            int a = aelj.mo24660a();
            ArrayList arrayList = new ArrayList(a);
            for (int i = 0; i < a; i++) {
                arrayList.add(((aeoj) aelj.mo24661a(i)).mo7556bF());
            }
            aelj.mo12460c();
            bhyb bhyb = this.f119304a;
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                PlaceEntity placeEntity = (PlaceEntity) arrayList.get(i2);
                String str = placeEntity.f79535a;
                LatLng latLng = placeEntity.f79536b;
                arrayList2.add(new bhzs(str, latLng.f79894a, latLng.f79895b, 80.0f));
            }
            bhyb.f119862a.mo64408a(0, arrayList2);
            return;
        }
        if (Log.isLoggable("Places", 5)) {
            bioi.m102661b("Places", "Failed to retrieve places from GeoDataApi", aucb.mo50387e());
        }
        this.f119304a.f119862a.mo64408a(13, Collections.emptyList());
    }
}
