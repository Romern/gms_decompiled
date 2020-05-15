package com.google.android.gms.herrevad.services;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.herrevad.NetworkQualityReport;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersistentCaptivePortalUpdateIntentOperation extends IntentOperation {

    /* renamed from: a */
    private abmc f79061a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43389a(Bundle bundle) {
        NetworkQualityReport networkQualityReport = new NetworkQualityReport();
        boolean z = bundle.getBoolean("extra_response_received");
        networkQualityReport.mo43386a("response_received", Boolean.toString(z));
        if (z) {
            long j = bundle.getLong("extra_request_timestamp_ms");
            long j2 = bundle.getLong("extra_response_timestamp_ms");
            long micros = TimeUnit.MILLISECONDS.toMicros(j2 - j);
            if (j2 != 0 && j != 0 && micros >= 0 && micros <= 2147483647L) {
                networkQualityReport.f79049a = (int) micros;
            } else {
                eoa.m10828c("Herrevad", "Unexpected longLatencyMicros: %d", Long.valueOf(micros));
            }
        }
        if (bundle.getBoolean("extra_is_captive_portal") != ceke.f182834a.mo6606a().mo79219c()) {
            networkQualityReport.f79057i = true;
        }
        if (this.f79061a == null) {
            this.f79061a = ablz.m47892a(getApplicationContext());
        }
        aucb a = this.f79061a.mo32210a(networkQualityReport);
        long b = celh.f182898a.mo6606a().mo79271b();
        if (b > 0) {
            try {
                aucu.m76783a(a, b, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                eoa.m10828c("Herrevad", "Task await failure", new Object[0]);
                abnd.m47943a("CAPTIVE_PORTAL_REPORT_FAILED");
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        boolean z;
        boolean z2;
        if (!abme.m47898a()) {
            int i = eoa.f15378a;
            abnd.m47943a("DISABLED_CAPTIVE_PORTAL_SKIPPED");
        } else if (!aboe.m47991a(getApplicationContext())) {
            int i2 = eoa.f15378a;
        } else if (intent != null && "android.net.conn.NETWORK_CONDITIONS_MEASURED".equals(intent.getAction()) && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            if (extras.getInt("extra_connectivity_type", -1) == 1) {
                String d = abob.m47982d(extras.getString("extra_ssid"));
                String string = extras.getString("extra_bssid");
                if (d == null || string == null || abob.m47980c(d)) {
                    if (d == null || string == null) {
                        Object[] objArr = new Object[2];
                        objArr[0] = Boolean.valueOf(d == null);
                        if (string == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objArr[1] = Boolean.valueOf(z);
                        eoa.m10828c("Herrevad", "wifi connection type error: ssid null = %b, bssid null = %b", objArr);
                    }
                    abmm.m47914a(false);
                    abmm.m47910a("");
                    abmm.m47917b(false);
                    return;
                }
                String c = abmm.m47920c();
                String a = abob.m47974a(d, string);
                if (!TextUtils.equals(c, a)) {
                    abmm.m47914a(true);
                    abmm.m47910a(a);
                    if (extras.getBoolean("extra_is_captive_portal") != ceke.f182834a.mo6606a().mo79220d()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    abmm.m47917b(z2);
                    new Object[1][0] = intent;
                    int i3 = eoa.f15378a;
                    mo43389a(intent.getExtras());
                }
            }
        }
    }
}
