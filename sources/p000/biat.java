package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: biat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biat implements Callable {

    /* renamed from: a */
    private final biam f120071a;

    /* renamed from: b */
    private final PlacesParams f120072b;

    /* renamed from: c */
    private final List f120073c;

    public biat(biam biam, List list, PlacesParams placesParams) {
        this.f120071a = biam;
        this.f120073c = list;
        this.f120072b = placesParams;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        biam biam = this.f120071a;
        List list = this.f120073c;
        PlacesParams placesParams = this.f120072b;
        bvmu bvmu = (bvmu) biam.mo64492a(new bibg(biam.f120057e, biam.f120053a, biam.f120055c, biam.f120056d, list, "getNearbyAlertDataById", placesParams), placesParams);
        Context context = biam.f120053a;
        if (bvmu == null || bvmu.f156796b.size() == 0) {
            return new ArrayList();
        }
        bvow bvow = bvmu.f156795a;
        if (bvow == null) {
            bvow = bvow.f157230c;
        }
        bian.m101877a(context, bvow);
        return bvmu.f156796b;
    }
}
