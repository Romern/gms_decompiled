package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UsageReportingIntentChimeraService extends TracingIntentService {
    public UsageReportingIntentChimeraService() {
        super("UsageReportingIntentService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo59691a(int i) {
        try {
            aucu.m76783a(avtz.m79338b(this).mo24690a(new UsageReportingOptInOptions(i)), chdk.f188488a.mo6606a().mo85140a(), TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.usagereporting.OPTIN_UR".equals(action)) {
            mo59691a(1);
        } else if ("com.google.android.gms.usagereporting.OPTOUT_UR".equals(action)) {
            mo59691a(2);
        }
    }
}
