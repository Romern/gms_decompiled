package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: naa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class naa implements lvs {

    /* renamed from: a */
    private final Context f35073a;

    /* renamed from: b */
    private final mzf f35074b;

    public naa(Context context, mzf mzf) {
        this.f35073a = context;
        this.f35074b = mzf;
    }

    /* renamed from: a */
    public final String mo19663a() {
        return "com.google.android.gms/.backup.BackupTransportService";
    }

    /* renamed from: b */
    public final Intent mo19664b() {
        return new Intent().setClassName(this.f35073a, "com.google.android.gms.backup.SetBackupAccountActivity");
    }

    /* renamed from: c */
    public final String mo19665c() {
        Account a = this.f35074b.mo19624a();
        nab.f35075a.mo25409a("currentDestinationString: %s", a);
        if (a == null) {
            return this.f35073a.getResources().getString(C0126R.string.notification_content_text_set_backup_account);
        }
        return this.f35073a.getResources().getString(C0126R.string.settings_backup_account_description, a.name);
    }

    /* renamed from: d */
    public final Intent mo19666d() {
        if (((long) Build.VERSION.SDK_INT) >= ccli.f179330a.mo6606a().mo76292y()) {
            return mcc.m24851a();
        }
        return null;
    }

    /* renamed from: e */
    public final String mo19667e() {
        return this.f35073a.getResources().getString(C0126R.string.manage_data_label);
    }
}
