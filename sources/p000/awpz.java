package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.wallet.service.address.AddressChimeraService;

/* renamed from: awpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awpz extends rzu {

    /* renamed from: a */
    final /* synthetic */ AddressChimeraService f94837a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awpz(AddressChimeraService addressChimeraService, Context context) {
        super(context, 12, new int[0]);
        this.f94837a = addressChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        if (getServiceRequest.f30229c > 0) {
            String str = getServiceRequest.f30230d;
            AddressChimeraService addressChimeraService = this.f94837a;
            sbj.mo16678a(0, new adcy(addressChimeraService, addressChimeraService.f110338a, str), (Bundle) null);
            return;
        }
        throw new IllegalArgumentException("clientVersion too old");
    }
}
