package p000;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: sda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sda implements sbg {

    /* renamed from: a */
    private final Context f44051a;

    public sda(Context context) {
        this.f44051a = context;
    }

    /* renamed from: a */
    public final ConnectionResult mo25330a(GetServiceRequest getServiceRequest, ConnectionInfo connectionInfo) {
        svr.m36484b(this.f44051a);
        String str = getServiceRequest.f30230d;
        int i = getServiceRequest.f30228b;
        return ConnectionResult.f30063a;
    }
}
