package p000;

import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: aemy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aemy extends aemc {

    /* renamed from: a */
    final /* synthetic */ LatLngBounds f63528a;

    /* renamed from: b */
    final /* synthetic */ String f63529b;

    /* renamed from: c */
    final /* synthetic */ int f63530c;

    /* renamed from: m */
    final /* synthetic */ PlaceFilter f63531m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aemy(rjo rjo, rkb rkb, LatLngBounds latLngBounds, String str, int i, PlaceFilter placeFilter) {
        super(rjo, rkb);
        this.f63528a = latLngBounds;
        this.f63529b = str;
        this.f63530c = i;
        this.f63531m = placeFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        String str;
        PlaceFilter placeFilter;
        aene aene = (aene) rjd;
        aemf aemf = new aemf(this);
        LatLngBounds latLngBounds = this.f63528a;
        String str2 = this.f63529b;
        int i = this.f63530c;
        PlaceFilter placeFilter2 = this.f63531m;
        sdo.checkIfNull(aemf, "callback == null");
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        if (placeFilter2 == null) {
            placeFilter = PlaceFilter.m66913e();
        } else {
            placeFilter = placeFilter2;
        }
        ((aenl) aene.mo25289B()).mo34367a(latLngBounds, i, str, placeFilter, aene.f63536a, aemf);
    }
}
