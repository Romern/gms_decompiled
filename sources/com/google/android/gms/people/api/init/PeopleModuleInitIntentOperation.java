package com.google.android.gms.people.api.init;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.phenotype.RegisterPhenotypeOperation;
import com.google.android.gms.people.service.BackupAndSyncOptInValidationChimeraService;
import com.google.android.gms.people.service.DeletedNullContactsCleanupChimeraService;
import com.google.android.gms.people.sync.focus.ContactsSyncIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final String[] f81700a = {"com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity"};

    /* renamed from: a */
    private final void m67790a() {
        int i;
        if (cgbo.m144213k()) {
            if (cgbo.m144204b()) {
                if ((System.currentTimeMillis() - alsj.m61651a(this).f74200a.getLong("deleted_null_contacts_cleanup_last_run_timestamp", 0)) / 1000 >= cgbo.f186290a.mo6606a().mo83234g()) {
                    aebi aebi = new aebi();
                    aebi.f63097i = "com.google.android.gms.people.service.DeletedNullContactsCleanupService";
                    aebi.f63099k = "DeletedNullContactsCleanupOneoffTask";
                    int i2 = 2;
                    aebi.mo34023a(2);
                    aebi.mo34027b(1);
                    aebi.f63102n = false;
                    aebi.mo34004a(0, cgbo.f186290a.mo6606a().mo83230c());
                    boolean c = cgbo.m144205c();
                    if (cdny.m134338c() || cgbo.m144205c()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    aebi.mo34024a(c ? 1 : 0, i);
                    aebi.mo34026a(cgbo.f186290a.mo6606a().mo83233f());
                    try {
                        aeat.m51532a(this).mo33984a(aebi.mo33974b());
                    } catch (IllegalArgumentException e) {
                        Log.e("DeletedNullContactsCleanup", "Error when scheduling the oneoff task.", e);
                        i2 = 8;
                    }
                    almk a = almk.m61263a();
                    bxvd da = amkz.f75139f.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    amkz amkz = (amkz) da.f164949b;
                    amkz.f75142b = i2 - 1;
                    int i3 = amkz.f75141a | 1;
                    amkz.f75141a = i3;
                    amkz.f75145e = 4;
                    amkz.f75141a = i3 | 32;
                    a.mo40517a((amkz) da.mo74062i());
                }
            }
            if (cgbo.m144208f()) {
                DeletedNullContactsCleanupChimeraService.m68179a(this);
            } else {
                DeletedNullContactsCleanupChimeraService.m68183c(this);
            }
        }
        if (!cfvo.m143210i()) {
            return;
        }
        if (cfvo.m143205d()) {
            BackupAndSyncOptInValidationChimeraService.m68174a(this);
        } else {
            BackupAndSyncOptInValidationChimeraService.m68176c(this);
        }
    }

    /* renamed from: a */
    private final void m67791a(String str) {
        Intent startIntent = IntentOperation.getStartIntent(this, RegisterPhenotypeOperation.class, "com.google.android.gms.people.phenotype.PHENOTYPE_REGISTER_ACTION");
        if (startIntent != null) {
            startIntent.putExtra("mendel_package_name", str);
            startService(startIntent);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.people.api.init.PeopleModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        boolean z;
        int i2 = i & 4;
        int i3 = i & 8;
        if ((i & 2) != 0) {
            alsj.m61651a(this).mo40697c(false);
            Intent startIntent = IntentOperation.getStartIntent(this, ContactsSyncIntentOperation.class, "com.google.android.gms.people.sync.focus.contacts_sync_action");
            if (startIntent != null) {
                startService(startIntent);
            } else {
                Log.e("PeopleInitIntentOp", "Intent was not found: ContactsSyncIntentOperation");
            }
        }
        if (!(i3 == 0 && i2 == 0)) {
            spn.m35881e(this);
            amea.m62724a(this).mo41140a(true);
            altq.m61806a(this);
            if (cfvk.m143176b()) {
                amwo.m63557a(this);
            }
            if (!cfwj.m143299b()) {
                m67790a();
            }
        }
        if (cfwj.m143299b()) {
            m67790a();
        }
        if (i2 != 0) {
            for (String str : f81700a) {
                spn.m35856a((Context) this, str, true);
            }
        }
        m67791a("com.google.android.gms.people");
        m67791a("com.google.android.gms.people.ui");
        amig.m62939a();
        if (((Boolean) amhn.f74916a.mo41191a()).booleanValue()) {
            amig.m62939a();
            z = ((Boolean) amhm.f74915a.mo41191a()).booleanValue();
        } else {
            z = soz.m35800c(getApplicationContext());
        }
        if (z) {
            amig.m62939a();
            ((Boolean) amhn.f74916a.mo41191a()).booleanValue();
            if (Boolean.valueOf(cfvh.m143165b()).booleanValue()) {
                aluc a = alue.m61882a();
                a.f74287a = "Android People Data Layer";
                a.f74288b = getString(C0126R.string.people_settings_feedback_confirmation);
                a.f74289c = "com.google.social.graph.testing.uploader";
                a.mo40788a(cfvh.m143165b());
                a.mo40787a(getApplicationContext());
            }
            if (Boolean.valueOf(cfvk.m143180f()).booleanValue()) {
                aluc a2 = alue.m61882a();
                a2.f74287a = "Focus Sync Adapter 2";
                a2.f74288b = getString(C0126R.string.people_settings_feedback_confirmation);
                a2.f74289c = "com.google.social.graph.testing.uploader";
                a2.mo40788a(cfvk.m143180f());
                a2.mo40786a(new aluq("com.google.android.gms.people"));
                a2.mo40786a(altz.f74281a);
                a2.mo40786a(altz.f74282b);
                a2.mo40786a(altz.f74283c);
                a2.mo40786a(altz.f74284d);
                a2.mo40786a(new alug());
                a2.mo40787a(getApplicationContext());
            }
            if (Boolean.valueOf(cgbe.m144176e()).booleanValue()) {
                aluc a3 = alue.m61882a();
                a3.f74287a = "Menagerie";
                a3.f74288b = getString(C0126R.string.people_settings_feedback_confirmation);
                a3.f74289c = "com.google.social.graph.testing.uploader";
                a3.mo40788a(cgbe.m144176e());
                a3.mo40786a(new alur("pluscontacts.db", "menagerie_db_compact", bngx.m109360a("owners", "ac_people", "ac_container", "ac_item", "ac_index")));
                a3.mo40787a(getApplicationContext());
                return;
            }
            return;
        }
        Log.i("PeopleInitIntentOp", "Not initializing debuggability");
    }
}
