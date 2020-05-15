package com.google.android.gms.common.devicedoctor.fixerframework;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeCommittedOperation extends IntentOperation {

    /* renamed from: a */
    private rvq f30171a = new rvq();

    public final void onHandleIntent(Intent intent) {
        if (intent != null && cdkp.f181122a.mo6606a().mo77825l()) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            String valueOf = String.valueOf(stringExtra);
            Log.i("PTCommittedOperation", valueOf.length() == 0 ? new String("Receive new configuration for ") : "Receive new configuration for ".concat(valueOf));
            if (bngx.m109368a((Collection) bmyx.m108640a(',').mo66920b().mo66917a().mo66925c((CharSequence) cdkp.f181122a.mo6606a().mo77824k())).contains(stringExtra)) {
                String valueOf2 = String.valueOf(stringExtra);
                Log.i("PTCommittedOperation", valueOf2.length() == 0 ? new String("Running Fixer Framework for ") : "Running Fixer Framework for ".concat(valueOf2));
                if (!cdkp.m133841h()) {
                    rvb.m34509a();
                }
                rvk c = rvl.m34524c();
                c.f43750b = this;
                c.f43749a = bpun.PHENOTYPE_UPDATE;
                this.f30171a.mo25209a(c.mo25198a());
            }
        }
    }
}
