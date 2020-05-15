package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: bieo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bieo extends bien {

    /* renamed from: b */
    private final LatLngBounds f120394b;

    /* renamed from: c */
    private final int f120395c;

    /* renamed from: d */
    private final String f120396d;

    /* renamed from: e */
    private final PlaceFilter f120397e;

    /* renamed from: f */
    private final aenr f120398f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bieo(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "SearchPlaces", placesParams, bidi, bidx, "", bhpt);
        int i2 = i;
        sdo.m34959a(latLngBounds);
        sdo.m34974b(i2 > 0);
        sdo.m34959a(aenr);
        this.f120394b = latLngBounds;
        this.f120395c = i2;
        this.f120396d = str;
        this.f120397e = placeFilter;
        this.f120398f = aenr;
    }

    /* renamed from: h */
    private final boolean m102134h() {
        int i = this.f120388a.f79576f;
        return i == -1 || i / 100000 < 73;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        String str = this.f120396d;
        PlaceFilter placeFilter = this.f120397e;
        PlacesParams placesParams = this.f120388a;
        bpqk c = bhqq.m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c);
        bprg a = bhqq.m101359a(2, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) a);
        bxvd da = bprl.f138862d.mo74144da();
        if (((double) bhqq.f119344a.nextFloat()) < cgfl.f186724a.mo6606a().mo83608o() && str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprl bprl = (bprl) da.f164949b;
            str.getClass();
            bprl.f138864a |= 8;
            bprl.f138865b = str;
        }
        bppt a2 = bhqq.m101348a(placeFilter.f79477e, placeFilter.f79474b);
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bprg bprg2 = bprg.f138829s;
        a2.getClass();
        bprg.f138835e = a2;
        bprg.f138831a |= 8;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bprl bprl2 = (bprl) da.f164949b;
        bprl2.f138866c = 2;
        bprl2.f138864a |= 16;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg3 = (bprg) bxvd2.f164949b;
        bprl bprl3 = (bprl) da.mo74062i();
        bprl3.getClass();
        bprg3.f138836f = bprl3;
        bprg3.f138831a |= 16;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprg bprg4 = (bprg) bxvd2.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprg4.getClass();
        bpqk.f138742i = bprg4;
        bpqk.f138734a |= 64;
        return (bpqk) bxvd.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        ArrayList arrayList;
        super.mo6502a(context);
        biam f = mo64567f();
        try {
            LatLngBounds latLngBounds = this.f120394b;
            int i = this.f120395c;
            String str = this.f120396d;
            PlaceFilter placeFilter = this.f120397e;
            PlacesParams placesParams = this.f120388a;
            bvpa bvpa = (bvpa) f.mo64492a(new bibo(f.f120057e, f.f120053a, f.f120055c, f.f120056d, latLngBounds, i, str, placeFilter.f79477e, placeFilter.f79474b, "search", placesParams), placesParams);
            Context context2 = f.f120053a;
            if (bvpa != null) {
                if (bvpa.f157255b.size() != 0) {
                    bvow bvow = bvpa.f157254a;
                    if (bvow == null) {
                        bvow = bvow.f157230c;
                    }
                    bian.m101877a(context2, bvow);
                    arrayList = new ArrayList(bvpa.f157255b.size());
                    for (int i2 = 0; i2 < bvpa.f157255b.size(); i2++) {
                        arrayList.add(bian.m101872a((bvmv) bvpa.f157255b.get(i2)));
                    }
                    if (!m102134h()) {
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList2.add(PlaceLikelihoodEntity.m66960a((PlaceEntity) arrayList.get(i3), 1.0f));
                        }
                        bioc.m102646a(0, arrayList2, 100, this.f120398f);
                        return;
                    }
                    bioc.m102648a(0, arrayList, this.f120398f);
                    return;
                }
            }
            arrayList = new ArrayList();
            if (!m102134h()) {
            }
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        if (m102134h()) {
            bioc.m102646a(status.f30115i, Collections.emptyList(), 100, this.f120398f);
        } else {
            bioc.m102648a(status.f30115i, Collections.emptyList(), this.f120398f);
        }
    }
}
