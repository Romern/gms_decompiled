package com.google.android.gms.people.service;

import android.content.Context;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupAndSyncOptInValidationChimeraService extends aeah {

    /* renamed from: a */
    private amvj f82039a;

    /* renamed from: b */
    public static void m68175b(Context context) {
        if (cfvo.m143205d()) {
            alsj a = alsj.m61651a(context);
            long b = cfvo.m143203b();
            boolean f = cfvo.m143207f();
            boolean g = cfvo.m143208g();
            boolean e = cfvo.m143206e();
            boolean h = cfvo.m143209h();
            long c = cfvo.m143204c();
            if (!a.f74200a.getBoolean("backup_and_sync_opt_in_validator_enabled", false) || a.f74200a.getLong("backup_and_sync_opt_in_validator_periodic_interval_seconds", 0) != b || a.f74200a.getBoolean("backup_and_sync_opt_in_validator_requires_charging", false) != f || a.f74200a.getBoolean("backup_and_sync_opt_in_validator_requires_device_idle", false) != g || a.f74200a.getBoolean("backup_and_sync_opt_in_validator_persisted", false) != e || a.f74200a.getBoolean("backup_and_sync_opt_in_validator_use_flex", false) != h || (h && a.f74200a.getLong("backup_and_sync_opt_in_validator_flex_seconds", 0) != c)) {
                Log.i("BackupAndSyncValidation", "Flags changed. Will re-scheduling the service.");
                m68174a(context);
                return;
            }
            return;
        }
        m68176c(context);
    }

    public final void onCreate() {
        super.onCreate();
        amvj a = amvj.m63368a(this);
        if (this.f82039a == null) {
            this.f82039a = a;
        }
    }

    /* renamed from: a */
    public static void m68174a(Context context) {
        int i;
        Log.i("BackupAndSyncValidation", "Scheduling the service.");
        aebl aebl = new aebl();
        aebl.f63097i = "com.google.android.gms.people.service.BackupAndSyncOptInValidationService";
        aebl.f63099k = "BackupAndSyncOptInValidationPeriodicTask";
        aebl.mo34023a(2);
        boolean f = cfvo.m143207f();
        if (cdny.m134338c() || cfvo.m143207f()) {
            i = 1;
        } else {
            i = 0;
        }
        aebl.mo34024a(f ? 1 : 0, i);
        aebl.mo34026a(cfvo.m143208g());
        aebl.mo34027b(1);
        aebl.f63102n = cfvo.m143206e();
        long b = cfvo.m143203b();
        if (cdny.m134350o()) {
            aebl.mo34009a(aebh.m51568a(b));
        } else {
            aebl.f63070a = b;
            if (cfvo.m143209h()) {
                aebl.f63071b = cfvo.m143204c();
            }
        }
        alsj.m61651a(context).mo40692b(cfvo.m143205d(), cfvo.m143203b(), cfvo.m143207f(), cfvo.m143208g(), cfvo.m143206e(), cfvo.m143209h(), cfvo.m143204c());
        try {
            aeat.m51532a(context).mo33984a(aebl.mo33974b());
        } catch (IllegalArgumentException e) {
            Log.e("BackupAndSyncValidation", "Error when scheduling the service.", e);
        }
    }

    /* renamed from: c */
    public static void m68176c(Context context) {
        Log.i("BackupAndSyncValidation", "Canceling the service.");
        alsj.m61651a(context).mo40692b(cfvo.m143205d(), cfvo.m143203b(), cfvo.m143207f(), cfvo.m143208g(), cfvo.m143206e(), cfvo.m143209h(), cfvo.m143204c());
        try {
            aeat.m51532a(context).mo33985a("com.google.android.gms.people.service.BackupAndSyncOptInValidationService");
        } catch (IllegalArgumentException e) {
            Log.e("BackupAndSyncValidation", "Error when canceling the service.", e);
        }
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        int i = 2;
        if (cfvo.m143205d()) {
            if ("BackupAndSyncOptInValidationPeriodicTask".equals(aecc.f63128a)) {
                this.f82039a.mo41382e();
                i = 0;
            } else {
                Log.e("BackupAndSyncValidation", "Unknown tag received. Will not run");
            }
        }
        m68175b(this);
        return i;
    }
}
