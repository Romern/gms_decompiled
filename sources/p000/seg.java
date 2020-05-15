package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.service.CommonApiBoundService;

/* renamed from: seg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class seg extends rzu {

    /* renamed from: a */
    final /* synthetic */ CommonApiBoundService f44087a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public seg(CommonApiBoundService commonApiBoundService, Context context) {
        super(context, 39, new int[0]);
        this.f44087a = commonApiBoundService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        try {
            sbj.mo16678a(0, new sei(this.f44087a, getServiceRequest.f30230d), (Bundle) null);
        } catch (RemoteException e) {
            Log.w("CommonApiService", "Client died while binding service");
        }
    }
}
