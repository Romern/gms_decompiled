package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.service.GeoDataChimeraService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* renamed from: bief */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bief extends bien {

    /* renamed from: b */
    private final List f120375b;

    /* renamed from: c */
    private final aenr f120376c;

    /* renamed from: d */
    private final GeoDataChimeraService f120377d;

    public bief(List list, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, GeoDataChimeraService geoDataChimeraService, bhpt bhpt) {
        super(65, "GetPlaceById", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(list);
        sdo.m34959a(aenr);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sdo.m34977c((String) it.next());
        }
        this.f120375b = list;
        this.f120376c = aenr;
        this.f120377d = geoDataChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        return bhqq.m101349a(this.f120375b.size(), 4, this.f120388a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba A[LOOP:2: B:28:0x00b8->B:29:0x00ba, LOOP_END] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        ArrayList arrayList;
        int size;
        int i;
        super.mo6502a(context);
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(this.f120375b.size());
        for (String str : this.f120375b) {
            PlaceEntity a = this.f120377d.mo71304b().mo64151a(str, System.currentTimeMillis());
            if (a == null) {
                arrayList2.add(str);
            } else {
                hashMap.put(a.f79535a, a);
            }
        }
        if (!arrayList2.isEmpty()) {
            biam f = mo64567f();
            try {
                PlacesParams placesParams = this.f120388a;
                bvmz bvmz = (bvmz) f.mo64492a(new bibi(f.f120057e, f.f120053a, f.f120055c, f.f120056d, arrayList2, "getPlaceById", placesParams), placesParams);
                Context context2 = f.f120053a;
                if (bvmz != null) {
                    if (bvmz.f156834b.size() != 0) {
                        bvow bvow = bvmz.f156833a;
                        if (bvow == null) {
                            bvow = bvow.f157230c;
                        }
                        bian.m101877a(context2, bvow);
                        arrayList = new ArrayList(bvmz.f156834b.size());
                        for (bvmv bvmv : bvmz.f156834b) {
                            PlaceEntity a2 = bian.m101872a(bvmv);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        this.f120377d.mo71304b().mo64154a(arrayList, System.currentTimeMillis());
                        size = arrayList.size();
                        for (i = 0; i < size; i++) {
                            PlaceEntity placeEntity = (PlaceEntity) arrayList.get(i);
                            hashMap.put(placeEntity.f79535a, placeEntity);
                        }
                    }
                }
                arrayList = new ArrayList();
                this.f120377d.mo71304b().mo64154a(arrayList, System.currentTimeMillis());
                size = arrayList.size();
                while (i < size) {
                }
            } catch (VolleyError | gid | TimeoutException e) {
                throw bien.m102124a(e);
            }
        }
        ArrayList arrayList3 = new ArrayList(this.f120375b.size());
        for (String str2 : this.f120375b) {
            PlaceEntity placeEntity2 = (PlaceEntity) hashMap.get(str2);
            if (placeEntity2 != null) {
                arrayList3.add(placeEntity2);
            }
        }
        bioc.m102648a(0, arrayList3, this.f120376c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bioc.m102648a(status.f30115i, Collections.emptyList(), this.f120376c);
    }
}
