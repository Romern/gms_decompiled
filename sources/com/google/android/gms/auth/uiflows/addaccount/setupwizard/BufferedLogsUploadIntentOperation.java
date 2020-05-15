package com.google.android.gms.auth.uiflows.addaccount.setupwizard;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BufferedLogsUploadIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final sek f11458a = ght.m13171a("BufferedLogsUploadIntentOperation");

    /* renamed from: b */
    public bjbq f11459b;

    /* renamed from: c */
    public bjbp f11460c;

    /* renamed from: d */
    public ilg f11461d;

    public final void onCreate() {
        bjbp a = bjbp.m103161a(getApplicationContext());
        bjbq bjbq = new bjbq(getApplicationContext(), "ANDROID_AUTH");
        ilg b = ilv.m15681b(getApplicationContext());
        this.f11460c = a;
        this.f11459b = bjbq;
        this.f11461d = b;
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            f11458a.mo25416d("null intent", new Object[0]);
        } else if (!"com.google.android.gms.auth.uiflows.addaccount.setupwizard.auth_action_suw_finished".equals(intent.getAction())) {
            f11458a.mo25416d("Unknown action", new Object[0]);
        } else {
            if (this.f11459b == null) {
                this.f11459b = new bjbq(getApplicationContext(), "ANDROID_AUTH");
            }
            snp.m35704b(9).execute(new jwr(this, jyj.m17509a(getApplicationContext())));
        }
    }
}
