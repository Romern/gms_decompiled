package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.transport.BackupAccountChangedIntentOperation;

/* renamed from: myi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class myi implements lvs {

    /* renamed from: a */
    private final Context f34932a;

    /* renamed from: b */
    private final lsp f34933b;

    public myi(Context context, lsp lsp) {
        sdo.m34959a(context);
        this.f34932a = context;
        sdo.m34959a(lsp);
        this.f34933b = lsp;
    }

    /* renamed from: a */
    public final String mo19663a() {
        return "com.google.android.gms/.backup.BackupTransportService";
    }

    /* renamed from: b */
    public final Intent mo19664b() {
        return new Intent().setClassName(this.f34932a, "com.google.android.gms.backup.SetBackupAccountActivity");
    }

    /* renamed from: c */
    public final String mo19665c() {
        Account a = this.f34933b.mo19591a();
        lvn lvn = BackupAccountChangedIntentOperation.f29195a;
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("currentDestinationString: ");
        sb.append(valueOf);
        lvn.mo25409a(sb.toString(), new Object[0]);
        if (a == null) {
            return this.f34932a.getResources().getString(C0126R.string.notification_content_text_set_backup_account);
        }
        return this.f34932a.getResources().getString(C0126R.string.settings_backup_account_description, a.name);
    }

    /* renamed from: d */
    public final Intent mo19666d() {
        int i = Build.VERSION.SDK_INT;
        return mcc.m24851a();
    }

    /* renamed from: e */
    public final String mo19667e() {
        return this.f34932a.getResources().getString(C0126R.string.manage_data_label);
    }
}
