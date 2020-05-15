package com.google.android.gms.ads.jams;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SystemEventIntentOperation extends IntentOperation {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class OnBootIntentOperation extends qlf {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo6344a(Intent intent, int i) {
            C0633h.m5664a("[JAMS] Boot completed");
            if (new C0731d(rpr.m34216b()).mo7028c()) {
                C0728a.m5913c();
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        C0731d dVar = new C0731d(rpr.m34216b());
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            C0633h.m5664a("[JAMS] Accounts changed");
            if (dVar.mo7028c()) {
                C0728a.m5913c();
            }
        } else if ("com.google.android.checkin.CHECKIN_COMPLETE".equals(intent.getAction())) {
            C0633h.m5664a("[JAMS] Gservices updated");
            boolean c = dVar.mo7028c();
            boolean f = cbvt.f178377a.mo6606a().mo75460f();
            boolean j = cbvt.f178377a.mo6606a().mo75464j();
            dVar.f9141a.edit().putBoolean("negotiation_enabled", f).apply();
            dVar.f9141a.edit().putBoolean("non_default_account_enabled", j).apply();
            if (c && !f) {
                C0633h.m5664a("[JAMS] Negotiation disabled");
                aeat.m51532a(rpr.m34216b()).mo33986a("jams-negotiation-task", "com.google.android.gms.ads.jams.NegotiationService");
            } else if (!c && f) {
                C0633h.m5664a("[JAMS] Negotiation enabled");
                C0728a.m5913c();
            }
        }
    }
}
