package com.google.android.gms.trustagent.common.framework;

import android.content.Intent;
import com.google.android.gms.trustagent.GoogleTrustAgentTrustStatusMonitorChimeraSetting;
import com.google.android.gms.trustagent.common.p070ui.ConfirmUserCredentialAndStartChimeraActivity;
import com.google.android.gms.trustagent.common.service.PreferenceChimeraService;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    public static final aunx f109144a = new aunx("TrustAgent", "ModuleInializer");

    /* renamed from: b */
    private final Collection f109145b = Arrays.asList(ConfirmUserCredentialAndStartChimeraActivity.f109159a, GoogleTrustAgentTrustStatusMonitorChimeraSetting.f109123b, PreferenceChimeraService.f109153a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        for (aumh aumh : this.f109145b) {
            String a = aumh.mo50622a();
            if (aumh.mo50624c()) {
                bqga.m112781a(aumh.mo50623b(), new aumi(this, a), bqfb.INSTANCE);
            }
        }
    }
}
