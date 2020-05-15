package com.google.android.gms.auth.folsom.operation;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.security.keystore.recovery.InternalRecoveryServiceException;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeySyncIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final sek f10912a = jdh.m16547a("KeySyncIntentOperation");

    public KeySyncIntentOperation() {
    }

    /* renamed from: a */
    public static int m6603a(Account account, int i) {
        jcm jcm = (jcm) jcm.f22159a.mo13145b();
        jcn jcn = new jcn();
        jcn.f22164a = account;
        jcn.f22165b = i == 18 ? jco.NEW_SNAPSHOT : jco.SYNC_PERIODIC;
        try {
            jcm.mo13582a(jcn.mo13585a());
            return 2;
        } catch (jck e) {
            f10912a.mo25417e("Failed to sync with FolsomSyncManager", e, new Object[0]);
            return 1;
        }
    }

    /* renamed from: b */
    public static boolean m6607b(Context context) {
        if (!ccfy.f178890a.mo6606a().mo75911z()) {
            return true;
        }
        try {
            return new BackupManager(context).isBackupEnabled() && Settings.Secure.getInt(context.getContentResolver(), "backup_encryption_opt_in_displayed", 0) == 1;
        } catch (SecurityException e) {
            f10912a.mo25417e("Error getting backup state", e, new Object[0]);
            return false;
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (!jde.f22216b) {
            f10912a.mo25414c("Build is lower than P. No need to handle action=[%s]", intent.getAction());
        } else if (!ccfv.m129485b()) {
            f10912a.mo25416d("auth_folsom_is_folsom_enabled is not enabled.", new Object[0]);
        } else {
            String action = intent.getAction();
            f10912a.mo25412b("onHandleIntent. action: %s", action);
            if ("android.security.action.RECOVERABLE_KEYSTORE_SNAPSHOT".equals(action)) {
                snp.m35704b(10).execute(new jav(this));
            }
        }
    }

    public KeySyncIntentOperation(Context context) {
        attachBaseContext(context);
    }

    /* renamed from: a */
    public static int m6604a(Context context, Account account, int i) {
        if (account == null) {
            f10912a.mo25418e("Cannot sync keys. No backup account set.", new Object[0]);
            return 2;
        } else if (ccfy.f178890a.mo6606a().mo75888c() && !sqc.m35963b(adyd.m51363a(context).mo33922b(), account)) {
            f10912a.mo25412b("Cannot sync keys for removed account", new Object[0]);
            return 2;
        } else if (ccgb.m129584c()) {
            return m6603a(account, i);
        } else {
            if (m6607b(context)) {
                try {
                    jcs a = jcs.m16520a(context, account);
                    try {
                        a.mo13590b();
                        jdg.m16543a(context, 3, i);
                        return m6605a(a, 3, i, context);
                    } catch (jck e) {
                        f10912a.mo25417e("Failed to sync key.", e, new Object[0]);
                        jdg.m16543a(context, e.f22158a, i);
                        if (!ccfy.m129502n()) {
                            m6605a(a, e.f22158a, i, context);
                        }
                        return 1;
                    } catch (eic e2) {
                        f10912a.mo25417e("Failed to sync key.", e2, new Object[0]);
                        jdg.m16543a(context, 8, i);
                        if (!ccfy.m129502n()) {
                            m6605a(a, 8, i, context);
                        }
                        return 1;
                    }
                } catch (InternalRecoveryServiceException e3) {
                    f10912a.mo25417e("Failed to get RecoveryController", e3, new Object[0]);
                    jdg.m16543a(context, 9, i);
                    return 1;
                }
            } else {
                f10912a.mo25418e("Cannot sync keys. Not opted in to encrypted backups.", new Object[0]);
                return 2;
            }
        }
    }

    /* renamed from: a */
    private static int m6605a(jcs jcs, int i, int i2, Context context) {
        int i3;
        int i4 = i - 1;
        if (i != 0) {
            if (i4 != 2) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            try {
                jcs.mo13587a(i3);
                return 2;
            } catch (InternalRecoveryServiceException e) {
                f10912a.mo25417e("Failed to update recovery status", e, new Object[0]);
                jdg.m16543a(context, i, i2);
                return 1;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public static Account m6606a(Context context) {
        return new lsp(context).mo19591a();
    }
}
