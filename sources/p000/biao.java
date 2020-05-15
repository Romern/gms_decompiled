package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: biao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biao implements bial {

    /* renamed from: a */
    private final aenr f120059a;

    /* renamed from: b */
    private final int f120060b;

    public biao(aenr aenr, int i) {
        this.f120059a = aenr;
        this.f120060b = i;
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        int i;
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("onFailure: ");
            sb.append(valueOf);
            bioi.m102662c("Places", sb.toString());
        }
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            sil.m35353a(volleyError, "Places");
            i = biam.m101858a(volleyError);
        } else {
            i = 13;
        }
        bioc.m102646a(i, Collections.emptyList(), 106, this.f120059a);
    }

    /* renamed from: a */
    public final void mo64172a(List list) {
        float q = (float) cggm.f186849a.mo6606a().mo83738q();
        int min = Math.min(list.size(), this.f120060b);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            float f = ((PlaceLikelihoodEntity) list.get(i)).f79559b;
            PlaceEntity placeEntity = ((PlaceLikelihoodEntity) list.get(i)).f79558a;
            if (q > 0.0f) {
                f -= f % q;
            }
            arrayList.add(PlaceLikelihoodEntity.m66960a(placeEntity, f));
        }
        bioc.m102646a(0, arrayList, 106, this.f120059a);
    }
}
