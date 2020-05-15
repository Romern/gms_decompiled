package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CorporaMaintenanceIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        adnt.m50868a("Starting mediastore corpora maintenance");
        adnq adnq = new adnq();
        adqo adqo = new adqo(6);
        adpd adpd = new adpd();
        adpo adpo = new adpo(getApplicationContext(), adnq, adqo);
        cazf.m127594a(adpo);
        adpd.f62373a = adpo;
        cazf.m127595a(adpd.f62373a, adpo.class);
        bqgg b = new adpe(adpd.f62373a).f62389a.mo75201b();
        bqga.m112781a(b, new adqp(b, adqo), adpo.f62460b);
        bqga.m112773a(b, ceqm.f183265a.mo6606a().mo79593F(), TimeUnit.SECONDS, adpo.f62459a);
        adnq.mo33687a(b, adpo.f62460b);
    }
}
