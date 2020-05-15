package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.panorama.PanoramaChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: alap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alap extends rzu {

    /* renamed from: a */
    final /* synthetic */ PanoramaChimeraService f73229a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alap(PanoramaChimeraService panoramaChimeraService, Context context) {
        super(context, 3, new int[0]);
        this.f73229a = panoramaChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        try {
            sbj.mo16678a(0, new alaw(this.f73229a), (Bundle) null);
        } catch (RemoteException e) {
            Log.w("PanoramaChimeraService", "client died while brokering service");
        }
    }
}
