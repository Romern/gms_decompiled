package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: afzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzo extends rzt {
    public afzo(Context context) {
        super(context, 37, new int[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        try {
            sbj.mo16678a(0, new afza(getServiceRequest.f30229c), (Bundle) null);
        } catch (RemoteException e) {
            agac.m53793c("Client died while brokering service.", new Object[0]);
        }
    }
}
