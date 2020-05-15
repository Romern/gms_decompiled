package com.google.android.gms.smartdevice.postsetup;

import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PostSetupApiService extends zzx {

    /* renamed from: a */
    private arsp f108103a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        ascd ascd = new ascd(this);
        if (this.f108103a == null) {
            this.f108103a = new arsp(this.f56354e, this, str, ascd.mo49037b(str));
        }
        aaac.mo16652a(this.f108103a);
    }

    public PostSetupApiService() {
        super(190, "com.google.android.gms.smartdevice.postsetup.PostSetupService.START", bnon.f131923a, 3, 10);
    }
}
