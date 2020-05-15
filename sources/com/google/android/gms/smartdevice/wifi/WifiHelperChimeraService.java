package com.google.android.gms.smartdevice.wifi;

import android.os.Bundle;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiHelperChimeraService extends zzx {
    /* JADX WARNING: Illegal instructions before constructor call */
    public WifiHelperChimeraService() {
        super((int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, "com.google.android.gms.smartdevice.wifi.START_WIFI_HELPER_SERVICE", r4, 0, 10);
        bnon bnon;
        if (cgpa.f187426a.mo6606a().mo84216j()) {
            bnon = bnon.f131923a;
        } else {
            bnon = sft.m35178d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (!"com.google.android.gms".equals(getServiceRequest.f30230d)) {
            aaac.mo16650a(16, (Bundle) null);
        } else {
            aaac.mo16652a(new asdj(this, aaag.m21013a()));
        }
    }
}
