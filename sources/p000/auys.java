package p000;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesSettingsChimeraActivity;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: auys */
public final /* synthetic */ class auys implements Callable {

    /* renamed from: a */
    private final TrustedPlacesSettingsChimeraActivity f92797a;

    public auys(TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity) {
        this.f92797a = trustedPlacesSettingsChimeraActivity;
    }

    public final Object call() {
        TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity = this.f92797a;
        rjy rjy = new rjy(trustedPlacesSettingsChimeraActivity);
        rjy.mo24780a(aema.f63501a, auxe.f92682b);
        rjy.mo24780a(aema.f63502b, auxe.f92682b);
        rkb b = rjy.mo24784b();
        b.mo24802f();
        aeli aeli = (aeli) aenc.m52185a(b, trustedPlacesSettingsChimeraActivity.f109312f).mo9456a(10, TimeUnit.SECONDS);
        LatLngBounds latLngBounds = null;
        if (aeli.f63490b.mo17710c() && aeli.mo24660a() > 0) {
            latLngBounds = aepo.m52351a(aeli.mo24661a(0).mo8010d(), (double) (TrustedPlacesSettingsChimeraActivity.f109310d / 2));
        }
        aeli.mo12460c();
        return latLngBounds;
    }
}
