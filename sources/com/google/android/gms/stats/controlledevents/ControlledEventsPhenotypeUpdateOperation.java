package com.google.android.gms.stats.controlledevents;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ControlledEventsPhenotypeUpdateOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (cgsi.m146848b() && "com.google.android.gms.phenotype.com.google.android.metrics.COMMITTED".equals(intent.getAction()) && "com.google.android.metrics".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            bdxy.m91564a(bdyj.m91581a("com.google.android.metrics"));
            asfk.m73956a();
        }
    }
}
