package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.locationsharing.api.LocationSharingChimeraService;

/* renamed from: aesn */
final /* synthetic */ class aesn implements aubt {

    /* renamed from: a */
    private final aic f63737a;

    public aesn(aic aic) {
        this.f63737a = aic;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        aic aic = this.f63737a;
        bnsl bnsl = (bnsl) LocationSharingChimeraService.f79625a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("com.google.android.gms.locationsharing.api.LocationSharingChimeraService", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failure getting location reporting state");
        aic.mo749a(bmvz.f131120a);
    }
}
