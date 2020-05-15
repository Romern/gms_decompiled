package com.google.android.contextmanager.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContextManagerChimeraService extends zzx {
    public ContextManagerChimeraService() {
        super(new int[]{47}, new String[]{"com.google.android.contextmanager.service.ContextManagerService.START"}, bnon.f131923a, 3, dwq.m9667k().f13906c.f44809d, null);
    }

    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        ContextManagerClientInfo contextManagerClientInfo;
        Bundle bundle = getServiceRequest.f30233g;
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray("com.google.android.contextmanager.service.args");
            contextManagerClientInfo = byteArray != null ? (ContextManagerClientInfo) sef.m35069a(byteArray, ContextManagerClientInfo.CREATOR) : null;
        } else {
            contextManagerClientInfo = null;
        }
        Context f = dwq.m9662f();
        String str = getServiceRequest.f30230d;
        int i = 0;
        if (contextManagerClientInfo == null || contextManagerClientInfo.mo18069d() || contextManagerClientInfo.mo18068c()) {
            if (!spn.m35869b()) {
                if (contextManagerClientInfo != null && !TextUtils.equals(contextManagerClientInfo.f30678b, str)) {
                    throw new SecurityException("Package name does not match.");
                }
                rfz.m33557a(f).mo24605a(str);
            }
        } else if (!contextManagerClientInfo.mo18070e()) {
            throw new SecurityException("Unknown package connection.");
        } else if (!cdgp.f180782a.mo6606a().mo77591k()) {
            long a = dwq.m9665i().mo20505a();
            long j = dwq.m9666j().f14362a.getLong(str, 0);
            int i2 = j != 0 ? cdgp.f180782a.mo6606a().mo77551aP() > a - j ? 1 : 0 : 2;
            Object[] objArr = {Integer.valueOf(i2), str};
            if (i2 == 0) {
                ecy ecy = new ecy(contextManagerClientInfo, str);
                ecy.f14709a.mo9438b();
                ecy.f14709a.mo9435a(ecy, dqy.m9124a("validate3P", dwq.m9662f(), ecy.f14710b));
            } else if (i2 != 1) {
                i = eda.m10144a(contextManagerClientInfo, str);
            }
        }
        if (i == 0) {
            aaac.mo16652a(new edb(contextManagerClientInfo));
        } else {
            aaac.mo16650a(i, (Bundle) null);
        }
    }

    public final void onCreate() {
        dwq.m9654a(new aaag(this, this.f56354e, this.f56355f));
        dwq.m9670n();
        dwq.m9655a(getBaseContext());
        dwq.m9650G().mo9373a(3);
    }
}
