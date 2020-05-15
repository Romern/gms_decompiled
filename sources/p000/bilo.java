package p000;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: bilo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bilo implements afcs {

    /* renamed from: a */
    final /* synthetic */ LatLng f120845a;

    public bilo(LatLng latLng) {
        this.f120845a = latLng;
    }

    /* renamed from: a */
    public final void mo34763a(afcn afcn) {
        afcn.mo34749a(afci.m52839a(this.f120845a));
        afcn.mo34755b();
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.mo43878a(this.f120845a);
        afcn.mo34747a(markerOptions);
    }
}
