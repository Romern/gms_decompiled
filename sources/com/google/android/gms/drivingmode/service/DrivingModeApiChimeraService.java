package com.google.android.gms.drivingmode.service;

import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DrivingModeApiChimeraService extends zzx {

    /* renamed from: a */
    private aaag f31243a;

    public DrivingModeApiChimeraService() {
        super(184, "com.google.android.gms.drivingmode.START_DRIVING_MODE_SERVICE", Collections.emptySet(), 3, 10);
    }

    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (this.f31243a == null) {
            this.f31243a = aaag.m21014a(this, this.f56354e, this.f56355f);
        }
        if (ccra.m131312d() && ccra.f179780a.mo6606a().mo76669e()) {
            bmxy.m108581a(this.f31243a);
            aaac.mo16652a(new vvd(this, this.f31243a));
            new vrb(this).mo28758a(bpdi.DRIVING_MODE, bpdh.DRIVING_MODE_CLIENT_API_SERVICE_START);
        }
    }
}
