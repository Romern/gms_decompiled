package com.google.android.gms.googlehelp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeFlagChangeListener extends IntentOperation {

    /* renamed from: a */
    static final String f78794a = ssv.m36267a("com.google.android.gms.googlehelp");

    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || f78794a.equals(action)) {
                if (intent.getExtras() != null) {
                    str = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && TextUtils.equals("com.google.android.gms.googlehelp", str)) {
                    if (cefk.m136719b()) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("prefetch_offline_content_retries_left_key", (int) ceeg.m136416u());
                        ReportBatchedMetricsChimeraGcmTaskService.m66600a(this, bundle, 3);
                        return;
                    }
                    aeat.m51532a(this).mo33986a("action_prefetch_offline_help_content", "com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsGcmTaskService");
                }
            }
        }
    }
}
