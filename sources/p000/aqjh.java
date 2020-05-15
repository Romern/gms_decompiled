package p000;

import android.accounts.Account;
import android.app.backup.BackupManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

/* renamed from: aqjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqjh extends aqjp {

    /* renamed from: a */
    public final aqkf f86200a;

    /* renamed from: b */
    public final boolean f86201b;

    /* renamed from: c */
    public final boolean f86202c;

    /* renamed from: d */
    public final Account f86203d;

    /* renamed from: e */
    public final boolean f86204e;

    /* renamed from: f */
    public final BackupManager f86205f;

    public aqjh(Context context, aqkf aqkf, boolean z, boolean z2, Account account, boolean z3, BackupManager backupManager) {
        super(context, true);
        this.f86200a = aqkf;
        this.f86201b = z;
        this.f86202c = z2;
        this.f86203d = account;
        this.f86204e = z3;
        this.f86205f = backupManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo47913a(boolean z) {
        if (this.f86203d != null) {
            new aqjg(this, z).start();
        }
    }

    /* renamed from: b */
    public final void mo47916b(boolean z) {
        Intent intent = new Intent("com.google.android.backup.BackupEnabler");
        intent.putExtra("BACKUP_ENABLE", z);
        intent.setPackage("com.google.android.backuptransport");
        try {
            this.f86226g.startService(intent);
        } catch (ActivityNotFoundException | SecurityException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Could not enable backup ");
            sb.append(valueOf);
            Log.w("BackupOptIn", sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo47919d() {
        super.mo47919d();
        mo47920e();
        Settings.Secure.putInt(this.f86226g.getContentResolver(), "backup_encryption_opt_in_displayed", 1);
        if (mo47917b()) {
            Settings.Secure.putInt(this.f86226g.getContentResolver(), "backup_enabled:com.android.providers.telephony", 1);
        }
        int i = Build.VERSION.SDK_INT;
        Settings.Secure.putInt(this.f86226g.getContentResolver(), "user_full_data_backup_aware", 1);
        if (mo47918c()) {
            Settings.Secure.putInt(this.f86226g.getContentResolver(), "backup_enabled:com.android.calllogbackup", 1);
        }
    }

    /* renamed from: e */
    public final void mo47920e() {
        sre.m36089i(this.f86226g);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: c */
    public final boolean mo47918c() {
        int i = Build.VERSION.SDK_INT;
        return this.f86200a != aqkf.SIDEWINDER;
    }

    /* renamed from: a */
    public final boolean mo47915a() {
        if (this.f86200a == aqkf.SIDEWINDER) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        long a = cgli.f187248a.mo6606a().mo84061a();
        if (a == 1 || (a == 0 && this.f86226g.getPackageManager().hasSystemFeature("com.google.android.apps.photos.NEXUS_PRELOAD"))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo47917b() {
        int i = Build.VERSION.SDK_INT;
        return this.f86200a != aqkf.SIDEWINDER;
    }
}
