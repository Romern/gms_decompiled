package com.google.android.gms.ipa.base;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IpaInitIntentOperation extends qlf {

    /* renamed from: a */
    public static final /* synthetic */ int f79257a = 0;

    /* renamed from: b */
    private static final String[] f79258b = {"com.google.android.gms.ipa.base.IpaGcmTaskService"};

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        adta.m51154c(getBaseContext());
        IpaGcmTaskChimeraService.m66799a(getBaseContext());
        if (!ceqm.m137876g()) {
            Context applicationContext = getApplicationContext();
            Intent startIntent = BoundService.getStartIntent(applicationContext, "com.google.android.gms.ipa.mediastoreindexer.PERSISTENT_START");
            if (startIntent == null) {
                adnt.m50874c("Service intent not available.");
            } else {
                skh.m35531a().mo25690a(applicationContext, startIntent, new adpn("ipa", applicationContext), 1);
            }
        }
        if (!ceqm.m137876g()) {
            Context applicationContext2 = getApplicationContext();
            Intent startIntent2 = BoundService.getStartIntent(applicationContext2, "com.google.android.gms.ipa.smsindexer.PERSISTENT_START");
            if (startIntent2 == null) {
                adnt.m50874c("Service intent not available.");
                return;
            }
            skh.m35531a().mo25690a(applicationContext2, startIntent2, new adsv("ipa", applicationContext2), 1);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.ipa.base.IpaInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        adnd a;
        adta.m51154c(getBaseContext());
        if (ceqm.m137878i()) {
            new adqr(getApplicationContext().getSharedPreferences("MediastoreIndexerSharedPrefs", 0)).mo33723d();
        }
        if (ceqm.m137873d() && ceqm.f183265a.mo6606a().mo79621f() && (a = adnd.m50837a(getApplicationContext())) != null) {
            adnv.m50879a().mo33695a(new adnn(a));
        }
        String[] strArr = f79258b;
        for (String str : strArr) {
            try {
                spn.m35856a((Context) this, str, true);
            } catch (IllegalArgumentException e) {
                adnt.m50875c("Component %s invalid: %s", str, e.getMessage());
                adns.m50862a().mo33690a(6);
            }
        }
    }
}
