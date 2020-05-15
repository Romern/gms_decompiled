package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: aemb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aemb extends aemc {

    /* renamed from: a */
    final /* synthetic */ String f63506a;

    /* renamed from: b */
    final /* synthetic */ LatLngBounds f63507b;

    /* renamed from: c */
    final /* synthetic */ AutocompleteFilter f63508c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aemb(rjo rjo, rkb rkb, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        super(rjo, rkb);
        this.f63506a = str;
        this.f63507b = latLngBounds;
        this.f63508c = autocompleteFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        String str;
        AutocompleteFilter autocompleteFilter;
        aene aene = (aene) rjd;
        aemf aemf = new aemf(this);
        String str2 = this.f63506a;
        LatLngBounds latLngBounds = this.f63507b;
        AutocompleteFilter autocompleteFilter2 = this.f63508c;
        sdo.checkIfNull(aemf, "callback == null");
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        if (autocompleteFilter2 == null) {
            autocompleteFilter = new aeku().mo34275a();
        } else {
            autocompleteFilter = autocompleteFilter2;
        }
        ((aenl) aene.mo25289B()).mo34371a(str, latLngBounds, 1, autocompleteFilter, aene.f63536a, aemf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new aekx(DataHolder.m22539b(status.f30115i));
    }
}
