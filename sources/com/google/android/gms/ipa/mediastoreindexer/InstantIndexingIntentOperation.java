package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstantIndexingIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        adnt.m50868a("Starting mediastore instant index");
        adnq adnq = new adnq();
        adqo adqo = new adqo(3);
        adpf adpf = new adpf();
        adpo adpo = new adpo(getApplicationContext(), adnq, adqo);
        cazf.m127594a(adpo);
        adpf.f62415a = adpo;
        cazf.m127595a(adpf.f62415a, adpo.class);
        bqgg b = new adpg(adpf.f62415a).f62418a.mo75201b();
        bqga.m112781a(b, new adqp(b, adqo), adpo.f62460b);
        bqga.m112773a(b, ceqm.f183265a.mo6606a().mo79597J(), TimeUnit.SECONDS, adpo.f62459a);
        adnq.mo33687a(b, adpo.f62460b);
    }
}
