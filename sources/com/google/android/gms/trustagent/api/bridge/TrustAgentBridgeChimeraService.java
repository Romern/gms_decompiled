package com.google.android.gms.trustagent.api.bridge;

import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TrustAgentBridgeChimeraService extends sjh {

    /* renamed from: a */
    private static final aunx f109142a = new aunx("TrustAgent", "BridgeChimeraService");

    /* renamed from: i */
    private static final bnic f109143i = bnic.m109490a("android.permission-group.SENSORS", "android.permission-group.LOCATION");

    public TrustAgentBridgeChimeraService() {
        super(89, "com.google.android.gms.trustagent.BridgeApi.START", f109143i, 1, 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7277a(sjj sjj, GetServiceRequest getServiceRequest) {
        f109142a.mo50711a("onGetService", new Object[0]);
        sjj.mo25645a(new aulk(sjn.m35483a(this, this.f44565c, this.f44566d)));
    }
}
