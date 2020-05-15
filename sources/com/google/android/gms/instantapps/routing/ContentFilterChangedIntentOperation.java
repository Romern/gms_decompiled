package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContentFilterChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private adje f79216a;

    static {
        new adfs("ContentFilterChangedIntentOperation");
    }

    public final void onCreate() {
        this.f79216a = adfv.m50332a(this).f61582g;
    }

    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        if (intent != null && "com.google.android.finsky.action.CONTENT_FILTERS_CHANGED".equals(intent.getAction())) {
            this.f79216a.mo33558a(camh.ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE);
        }
    }
}
