package com.google.android.gms.common.config;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeCheckinChimeraService extends aeah {
    /* renamed from: a */
    private final void m22527a(Class cls, String str) {
        Intent startIntent = IntentOperation.getStartIntent(this, cls, str);
        if (startIntent == null) {
            Log.e("phenotype_checkin", String.format("Failed to get IntentOperation for '%s'", str));
            return;
        }
        startService(startIntent);
    }

    /* renamed from: aZ */
    public final void mo7135aZ() {
        aeat a = aeat.m51532a(this);
        aebl aebl = new aebl();
        aebl.f63070a = cdmk.f181238a.mo6606a().mo77896a();
        aebl.f63097i = getContainerService().getClass().getName();
        aebl.f63102n = true;
        aebl.mo34028b(0, 0);
        aebl.mo34024a(0, 0);
        aebl.mo34026a(false);
        aebl.mo34027b(1);
        aebl.mo34026a(true);
        aebl.f63099k = "phenotype_checkin";
        a.mo33984a(aebl.mo33974b());
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        m22527a(PhenotypeRegistrationOperation.class, "com.google.android.gms.phenotype.DAILY_CHECKIN");
        m22527a(PhenotypeUpdateOperation.class, "com.google.android.gms.phenotype.DAILY_CHECKIN");
        return 0;
    }
}
