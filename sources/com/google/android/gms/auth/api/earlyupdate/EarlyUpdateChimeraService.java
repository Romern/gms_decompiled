package com.google.android.gms.auth.api.earlyupdate;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EarlyUpdateChimeraService extends zzx {

    /* renamed from: a */
    public static final sbw f10198a = new sbw("AuthEarlyUpdate", "[EUChimeraService]");

    static {
        Collections.synchronizedMap(new HashMap());
    }

    public EarlyUpdateChimeraService() {
        super((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, "com.google.android.gms.auth.api.earlyupdate.service.START", Collections.emptySet(), 3, 9);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (p000.ccdp.m129335b() == false) goto L_0x0058;
     */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        if ("com.google.android.setupwizard".equals(str) || "com.google.android.gms.auth.testapp.earlyupdate".equals(str) || "com.google.android.gms.apitest.earlyupdate".equals(str)) {
            if (!rfz.m33557a(this).mo24610b(str)) {
                f10198a.mo25372b("AuthEarlyUpdate", String.valueOf(str).concat(" is not whitelisted."));
            }
            f10198a.mo25371b("Verified call by SetupWizard or testapp. Returning service.");
            aaac.mo16652a(new hub(this, aaag.m21013a()));
            return;
        }
        sbw sbw = f10198a;
        String valueOf = String.valueOf(str);
        sbw.mo25377c("AuthEarlyUpdate", valueOf.length() == 0 ? new String("Invalid call by alien app. Access denied to package: ") : "Invalid call by alien app. Access denied to package: ".concat(valueOf));
        sbw sbw2 = f10198a;
        String valueOf2 = String.valueOf(str);
        sbw2.mo25377c("AuthEarlyUpdate", valueOf2.length() == 0 ? new String("Package access denied: ") : "Package access denied: ".concat(valueOf2));
        aaac.mo16650a(16, (Bundle) null);
    }
}
