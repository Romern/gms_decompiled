package com.google.android.gms.common.config;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.Collection;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeUpdateOperation extends IntentOperation {

    /* renamed from: a */
    private rte f30153a;

    /* renamed from: a */
    private final void m22531a(String str) {
        Intent intent = new Intent("com.google.android.gms.phenotype.COMMITTED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
        sendBroadcast(intent);
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Committed new configuration for ");
        } else {
            "Committed new configuration for ".concat(valueOf);
        }
    }

    public final void onCreate() {
        this.f30153a = new rte(this, anef.m64089a(this));
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null || (!"com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) && !"com.google.android.gms.phenotype.DAILY_CHECKIN".equals(intent.getAction()))) {
            Log.e("PhenotypeUpdateOp", "Invalid intent");
        } else if (cdmk.f181238a.mo6606a().mo77899d()) {
            bnic a = bnic.m109495a((Collection) cdmk.f181238a.mo6606a().mo77897b().f165797a);
            if ("com.google.android.gms.phenotype.DAILY_CHECKIN".equals(intent.getAction())) {
                for (zzu zzu : this.f30153a.mo25083a()) {
                    int a2 = zzt.m46765a(zzu.f56345i);
                    if (a2 == 0 || a2 != 3) {
                        m22532a(zzu, a);
                    }
                }
                return;
            }
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if (stringExtra == null) {
                Log.e("PhenotypeUpdateOp", "Invalid Intent: missing EXTRA_PACKAGE_NAME.");
            } else if (this.f30153a.mo25084a(stringExtra)) {
                zzu b = this.f30153a.mo25085b(stringExtra);
                if (b == null) {
                    Log.e("PhenotypeUpdateOp", String.format("No RegistrationInfo found for package '%s'", stringExtra));
                    return;
                }
                m22532a(b, a);
            }
        } else if ("com.google.android.gms.phenotype.DAILY_CHECKIN".equals(intent.getAction())) {
            for (zzu zzu2 : this.f30153a.mo25083a()) {
                m22531a(zzu2.f56338b);
            }
        } else {
            String stringExtra2 = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if (stringExtra2 == null) {
                Log.e("PhenotypeUpdateOp", "Invalid Intent: missing package_name extra.");
                return;
            }
            if (stringExtra2.length() == 0) {
                new String("Receive new configuration for ");
            } else {
                "Receive new configuration for ".concat(stringExtra2);
            }
            if (this.f30153a.mo25084a(stringExtra2)) {
                m22531a(stringExtra2);
            }
        }
    }

    /* renamed from: a */
    private final void m22532a(zzu zzu, Set set) {
        int a = zzt.m46765a(zzu.f56345i);
        if (a == 0 || a != 3) {
            int a2 = zzt.m46765a(zzu.f56345i);
            if (a2 == 0 || a2 == 1 || set.contains(zzu.f56338b)) {
                m22531a(zzu.f56338b);
                return;
            }
            Intent intent = new Intent(ssv.m36267a(zzu.f56338b));
            intent.setComponent(new ComponentName(this, "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver"));
            intent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", zzu.f56338b);
            sendBroadcast(intent);
        }
    }
}
