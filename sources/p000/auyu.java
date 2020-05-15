package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.trustlet.place.p076ui.TrustedPlacesSettingsChimeraActivity;

/* renamed from: auyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyu implements bqfp {

    /* renamed from: a */
    final /* synthetic */ aepn f92799a;

    /* renamed from: b */
    final /* synthetic */ TrustedPlacesSettingsChimeraActivity f92800b;

    public auyu(TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity, aepn aepn) {
        this.f92800b = trustedPlacesSettingsChimeraActivity;
        this.f92799a = aepn;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (latLngBounds != null) {
            aepn aepn = this.f92799a;
            sdo.m34959a(latLngBounds);
            sef.m35071a(latLngBounds, aepn.f63586a, "latlng_bounds");
        }
        this.f92799a.mo34439a(qkj.m32287a(this.f92800b, C0126R.C0127drawable.circle_overlay), TrustedPlacesSettingsChimeraActivity.f109310d, TrustedPlacesSettingsChimeraActivity.f109310d);
        try {
            TrustedPlacesSettingsChimeraActivity trustedPlacesSettingsChimeraActivity = this.f92800b;
            trustedPlacesSettingsChimeraActivity.startActivityForResult(this.f92799a.mo34414a(trustedPlacesSettingsChimeraActivity.getContainerActivity()), 1001);
        } catch (rfw e) {
            rfx.m33535a(e.f42890a, this.f92800b.getContainerActivity(), -1);
        } catch (rfv e2) {
            TrustedPlacesSettingsChimeraActivity.f109309c.mo50711a("GooglePlayServicesNotAvailableException in TrustedPlacesSettings", new Object[0]).mo50709d();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        TrustedPlacesSettingsChimeraActivity.f109309c.mo50710a("Failed to launch Place Picker.", th, new Object[0]).mo50706a();
    }
}
