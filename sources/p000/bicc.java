package p000;

import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bicc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicc implements Callable {

    /* renamed from: a */
    private final bibq f120187a;

    /* renamed from: b */
    private final LatLngBounds f120188b;

    /* renamed from: c */
    private final int f120189c;

    /* renamed from: d */
    private final List f120190d;

    /* renamed from: e */
    private final PlacesParams f120191e;

    public bicc(bibq bibq, PlacesParams placesParams, LatLngBounds latLngBounds, int i, List list) {
        this.f120187a = bibq;
        this.f120191e = placesParams;
        this.f120188b = latLngBounds;
        this.f120189c = i;
        this.f120190d = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bnhe bnhe;
        bibq bibq = this.f120187a;
        LatLngBounds latLngBounds = this.f120188b;
        int i = this.f120189c;
        List list = this.f120190d;
        PlacesParams placesParams = this.f120191e;
        bvtp bvtp = (bvtp) bibq.mo64508a(new bicj(bibq.f120155b, bibq.f120156c, bibq.f120157d, latLngBounds, i, list, placesParams), placesParams);
        if (bvtp == null || (bvtp.f157598a & 1) == 0 || bvtp.f157599b.size() == 0) {
            bnhe = bnoj.f131912b;
        } else {
            HashMap a = bnmt.m109795a(bvtp.f157599b.size() + 1);
            ArrayList arrayList = new ArrayList(bvtp.f157599b.size());
            bxwc bxwc = bvtp.f157599b;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(bibr.m101919a((bvul) bxwc.get(i2)));
            }
            a.put(bvtp.f157600c, arrayList);
            bxwc bxwc2 = bvtp.f157601d;
            int size2 = bxwc2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                bvto bvto = (bvto) bxwc2.get(i3);
                ArrayList arrayList2 = new ArrayList(bvto.f157593a.size());
                bxwc bxwc3 = bvto.f157593a;
                int size3 = bxwc3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    arrayList2.add(bibr.m101919a((bvul) bxwc3.get(i4)));
                }
                a.put(bvto.f157594b, arrayList2);
            }
            bnhe = bnhe.m109413a(a);
        }
        return new bicd(bnhe);
    }
}
