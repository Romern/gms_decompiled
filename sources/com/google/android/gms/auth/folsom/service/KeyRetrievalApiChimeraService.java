package com.google.android.gms.auth.folsom.service;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyRetrievalApiChimeraService extends zzx {

    /* renamed from: a */
    private static final sek f10926a = jdh.m16547a("KeyRetrievalApi");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        if (ccgb.m129584c()) {
            String string = getServiceRequest.f30233g.getString("SECURITY_DOMAIN");
            if (string == null) {
                f10926a.mo25412b("Security domain is not set", new Object[0]);
                aaac.mo16650a(10, new Bundle());
                return;
            }
            aaac.mo16652a(new jbn(aaag.m21014a(this, this.f56354e, this.f56355f), string));
            return;
        }
        f10926a.mo25412b("KeyRetrievalApi is disabled by a flag.", new Object[0]);
        aaac.mo16650a(16, new Bundle());
    }

    public KeyRetrievalApiChimeraService() {
        super(172, "com.google.android.gms.auth.key.retrieval.service.START", bnon.f131923a, 1, 10);
    }
}
