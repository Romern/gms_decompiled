package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: biei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biei extends bien {

    /* renamed from: b */
    private final LatLng f120383b;

    /* renamed from: c */
    private final aenr f120384c;

    public biei(LatLng latLng, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "GetPlaceByLocation", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(latLng);
        sdo.m34959a(aenr);
        this.f120383b = latLng;
        this.f120384c = aenr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        PlacesParams placesParams = this.f120388a;
        bpqk c = bhqq.m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        bprg a = bhqq.m101359a(9, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) a);
        bpqq bpqq = bpqq.f138778a;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bprg bprg2 = bprg.f138829s;
        bpqq.getClass();
        bprg.f138842l = bpqq;
        bprg.f138831a |= 4096;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprg bprg3 = (bprg) bxvd2.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprg3.getClass();
        bpqk.f138742i = bprg3;
        bpqk.f138734a |= 64;
        return (bpqk) bxvd.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String[] mo64565d() {
        return cgfl.f186724a.mo6606a().mo83603j().split(",");
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        super.mo6502a(context);
        try {
            List a = mo64567f().mo64494a(this.f120383b, (int) cgfl.f186724a.mo6606a().mo83602i(), false, this.f120388a, null);
            ArrayList arrayList = new ArrayList(a.size());
            int size = a.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((PlaceLikelihoodEntity) a.get(i)).f79558a);
            }
            bioc.m102648a(0, arrayList, this.f120384c);
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bioc.m102648a(status.f30115i, Collections.emptyList(), this.f120384c);
    }
}
