package p000;

import android.accounts.Account;
import com.google.android.gms.locationsharing.api.LocationSharingChimeraService;

/* renamed from: aesl */
public final /* synthetic */ class aesl implements aie {

    /* renamed from: a */
    private final LocationSharingChimeraService f63734a;

    /* renamed from: b */
    private final Account f63735b;

    public aesl(LocationSharingChimeraService locationSharingChimeraService, Account account) {
        this.f63734a = locationSharingChimeraService;
        this.f63735b = account;
    }

    /* renamed from: a */
    public final Object mo753a(aic aic) {
        LocationSharingChimeraService locationSharingChimeraService = this.f63734a;
        Account account = this.f63735b;
        if (locationSharingChimeraService.f79626b == null) {
            locationSharingChimeraService.f79626b = aeqc.m52384a(locationSharingChimeraService.getBaseContext());
        }
        aucb c = locationSharingChimeraService.f79626b.mo24736c(account);
        c.mo50373a(new aesm(aic));
        c.mo50372a(new aesn(aic));
        return "LocationSharingChimeraService.getLocationReportingState";
    }
}
