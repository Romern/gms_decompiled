package com.google.android.gms.ipa.base;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeCommittedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f79259a = ssv.m36267a("com.google.android.gms.ipa");

    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || f79259a.equals(intent.getAction())) && "com.google.android.gms.ipa".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            bdxy a = bdxy.m91563a(getBaseContext().getContentResolver(), anef.m64088a("com.google.android.gms.ipa"));
            if (a != null) {
                a.mo58435b();
            }
            IpaGcmTaskChimeraService.m66799a(getBaseContext());
            adta.m51154c(getBaseContext());
            adnd.m50837a(getBaseContext());
            if (!adqn.m51003a(getBaseContext()) || ceqm.m137876g()) {
                adpm.m50943c(getBaseContext());
            } else {
                adpm.m50942b(getBaseContext());
            }
            adqr adqr = new adqr(getSharedPreferences("MediastoreIndexerSharedPrefs", 0));
            boolean e = ceqm.m137874e();
            if (adqr.f62516a.getBoolean("audio_media_files_indexing_enabled", false) ^ e) {
                if (e) {
                    adqr.mo33723d();
                }
                adqr.f62516a.edit().putBoolean("audio_media_files_indexing_enabled", e).commit();
            }
            boolean h = ceqm.m137877h();
            if (adqr.f62516a.getBoolean("id_based_mediastore_indexing_enabled", false) ^ h) {
                adqr.mo33723d();
                adqr.f62516a.edit().putBoolean("id_based_mediastore_indexing_enabled", h).commit();
            }
        }
    }
}
