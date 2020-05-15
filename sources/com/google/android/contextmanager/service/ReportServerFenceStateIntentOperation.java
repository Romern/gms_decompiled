package com.google.android.contextmanager.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReportServerFenceStateIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() == 0) {
            new String("Action: ");
        } else {
            "Action: ".concat(valueOf);
        }
        if ("com.google.android.contextmanager.REPORT_SERVER_FENCE_STATE".equals(action)) {
            dtl E = dwq.m9648E();
            if (!intent.hasExtra("client_info_package_name") || !intent.hasExtra("client_info_account_name") || !intent.hasExtra("client_info_module_id") || !intent.hasExtra("context_fence_key")) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dtl", "a", 617, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[FenceManager] Server fence state reporting intent is not valid.");
                return;
            }
            String a = duu.m9452a(intent.getStringExtra("client_info_package_name"), intent.getStringExtra("client_info_account_name"), intent.getStringExtra("client_info_module_id"), intent.getStringExtra("context_fence_key"));
            drk a2 = E.f13991b.mo9568a(a);
            if (a2 != null) {
                doh g = a2.mo9470g();
                if (g != null) {
                    duu b = E.f13991b.mo9575b(a);
                    if (b != null) {
                        new efs(g, b).mo9446a();
                    } else {
                        new Object[1][0] = a;
                    }
                } else {
                    new Object[1][0] = a;
                }
            } else {
                new Object[1][0] = a;
            }
        } else {
            new Object[1][0] = action;
        }
    }
}
