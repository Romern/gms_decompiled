package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;

/* renamed from: mty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mty {

    /* renamed from: a */
    public final lvn f34729a = new lvn("AppBackupStatsFetcher");

    /* renamed from: b */
    public final ltt f34730b;

    /* renamed from: c */
    public final PackageManager f34731c;

    public mty(Context context) {
        ltt ltt = new ltt(context);
        PackageManager packageManager = context.getPackageManager();
        this.f34730b = ltt;
        this.f34731c = packageManager;
    }

    /* renamed from: a */
    public final ApplicationBackupStats[] mo20242a() {
        return this.f34730b.mo19601a(new BackupStatsRequestConfig(false, true));
    }
}
