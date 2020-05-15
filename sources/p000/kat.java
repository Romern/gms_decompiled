package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.auth.uncertifieddevice.UncertifiedDeviceServiceResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: kat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kat extends aaab {

    /* renamed from: a */
    private final kaq f23662a;

    public kat(kaq kaq) {
        super(MfiClientException.TYPE_MFICLIENT_NOT_FOUND, "IsDeviceCertified");
        this.f23662a = kaq;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        UncertifiedDeviceServiceResponse uncertifiedDeviceServiceResponse = new UncertifiedDeviceServiceResponse(1, true, null);
        if (!cdpf.m134588b()) {
            uncertifiedDeviceServiceResponse.f11603b = true;
            uncertifiedDeviceServiceResponse.f11604c = null;
            this.f23662a.mo14338a(Status.f30107a, uncertifiedDeviceServiceResponse);
            return;
        }
        int ai = gnv.m13536ai();
        if (ai != 3 && (ai != 2 || gnv.m13537aj() >= System.currentTimeMillis())) {
            uncertifiedDeviceServiceResponse.f11603b = true;
            uncertifiedDeviceServiceResponse.f11604c = null;
        } else {
            uncertifiedDeviceServiceResponse.f11603b = false;
            Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity");
            className.addFlags(268435456);
            uncertifiedDeviceServiceResponse.f11604c = PendingIntent.getActivity(context, 0, className, 134217728);
        }
        this.f23662a.mo14338a(Status.f30107a, uncertifiedDeviceServiceResponse);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23662a.mo14338a(status, (UncertifiedDeviceServiceResponse) null);
    }
}
