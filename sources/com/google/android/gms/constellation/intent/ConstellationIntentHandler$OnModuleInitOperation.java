package com.google.android.gms.constellation.intent;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import java.util.UUID;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConstellationIntentHandler$OnModuleInitOperation extends qlf {
    /* renamed from: a */
    private final void m22791a() {
        szo a;
        try {
            a = szo.m36665a(getBaseContext());
            if (a.getWritableDatabase().getVersion() != 3) {
                syr.f45460a.mo25418e("Failed to update database", new Object[0]);
            }
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (SQLiteException e) {
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6536b(Intent intent, boolean z) {
        m22791a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        syr.f45460a.mo25414c("Received onBootCompleted intent", new Object[0]);
        syp syp = new syp(getBaseContext());
        syp.f45455a.mo25414c("Reboot checker check status.", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        if (!cdfw.f180710a.mo6606a().mo77454i()) {
            syp.f45455a.mo25414c("reboot checker is disabled.", new Object[0]);
        } else if (syo.m36599a(szq.m36667a(syp.f45457b))) {
            syp.f45458c = tds.m36774a(syp.f45457b);
            syp.f45455a.mo25414c("Running reboot sync", new Object[0]);
            UUID randomUUID = UUID.randomUUID();
            sns sns = new sns(10);
            tdi.m36751a(syp.f45457b);
            if (!tdi.m36752b(syp.f45457b)) {
                tds.m36774a(syp.f45457b).mo26404a(randomUUID, syp.f45456d, new tdw(54, false));
            }
            syp.f45458c.mo26401a(randomUUID, syp.f45456d);
            sxt.m36563a();
            sxt.m36566a(syp.f45457b.getApplicationContext(), randomUUID, 8, new syn(syp.f45458c, syp.f45455a, randomUUID, bqjr.m112930a(syp.f45456d), new snr(sns), false));
        } else {
            syp.f45455a.mo25414c("Reboot Sync didn't run.", new Object[0]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.constellation.intent.ConstellationIntentHandler$OnModuleInitOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        sek sek = syr.f45460a;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("on init with intent ");
        sb.append(valueOf);
        sek.mo25414c(sb.toString(), new Object[0]);
        spn.m35856a((Context) this, "com.google.android.gms.constellation.checker.RefreshGcmTaskService", true);
        spn.m35856a((Context) this, "com.google.android.gms.constellation.ui.ConstellationSettingsActivity", true);
        spn.m35856a((Context) this, "com.google.android.gms.constellation.ui.ConstellationWebSettingsActivity", true);
        spn.m35856a((Context) this, "com.google.android.gms.constellation.ui.ConstellationDebugActivity", true);
        spn.m35856a((Context) this, "com.google.android.gms.constellation.ui.ConstellationChatFeaturesActivity", true);
        spn.m35856a((Context) this, "com.google.android.gms.constellation.GcmBroadcastReceiver", true);
        spn.m35856a((Context) this, "com.google.android.gms.constellation.ui.ApiConsentActivity", true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        m22791a();
    }
}
