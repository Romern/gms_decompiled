package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BatchIndexingIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        adnt.m50868a("Starting mediastore batch index");
        adnq adnq = new adnq();
        adqo adqo = new adqo(5);
        adpb adpb = new adpb();
        adpo adpo = new adpo(getApplicationContext(), adnq, adqo);
        cazf.m127594a(adpo);
        adpb.f62324a = adpo;
        cazf.m127595a(adpb.f62324a, adpo.class);
        bqgg b = new adpc(adpb.f62324a).f62347a.mo75201b();
        bqga.m112781a(b, new adqp(b, adqo), adpo.f62460b);
        bqga.m112773a(b, ceqm.f183265a.mo6606a().mo79590C(), TimeUnit.SECONDS, adpo.f62459a);
        adnq.mo33687a(b, adpo.f62460b);
    }
}
