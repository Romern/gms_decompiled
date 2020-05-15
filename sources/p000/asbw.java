package p000;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.Context;
import android.os.Build;

/* renamed from: asbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbw {

    /* renamed from: a */
    private static final Logger f88682a = ascp.m73787a("Utils", "BackupUtils");

    /* renamed from: a */
    public static String m73763a(Context context) {
        Account account;
        int i = Build.VERSION.SDK_INT;
        boolean isBackupEnabled = new BackupManager(context).isBackupEnabled();
        Logger Logger = f88682a;
        StringBuilder sb = new StringBuilder(21);
        sb.append("Backup enabled: ");
        sb.append(isBackupEnabled);
        Logger.mo25414c(sb.toString(), new Object[0]);
        if (isBackupEnabled) {
            account = new lsp(context).mo19591a();
        } else {
            account = null;
        }
        if (account != null) {
            return account.name;
        }
        return null;
    }
}
