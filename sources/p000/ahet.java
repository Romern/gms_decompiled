package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapChimeraService;

/* renamed from: ahet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahet extends rzu {

    /* renamed from: a */
    final /* synthetic */ NearbyBootstrapChimeraService f67079a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahet(NearbyBootstrapChimeraService nearbyBootstrapChimeraService) {
        super(nearbyBootstrapChimeraService, 69, new int[0]);
        this.f67079a = nearbyBootstrapChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        try {
            NearbyBootstrapChimeraService nearbyBootstrapChimeraService = this.f67079a;
            bnsp bnsp = NearbyBootstrapChimeraService.f80439a;
            if (nearbyBootstrapChimeraService.f80440b == null) {
                nearbyBootstrapChimeraService.f80440b = new ahfe(nearbyBootstrapChimeraService, nearbyBootstrapChimeraService.f80441c);
                ahfe ahfe = this.f67079a.f80440b;
                skh a = skh.m35531a();
                Context context = ahfe.f67103c;
                a.mo25690a(context, buyd.m120746a(context), ahfe.f67105e, 1);
            }
            ahfe ahfe2 = this.f67079a.f80440b;
            ahfe2.asBinder();
            sbj.mo16678a(0, ahfe2, (Bundle) null);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) NearbyBootstrapChimeraService.f80439a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahet", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Client died while brokering nearbybootstrap service");
        }
    }
}
