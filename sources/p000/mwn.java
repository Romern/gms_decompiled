package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwn */
final /* synthetic */ class mwn implements Runnable {

    /* renamed from: a */
    private final rtj f34852a;

    /* renamed from: b */
    private final boolean f34853b;

    /* renamed from: c */
    private final Context f34854c;

    public mwn(rtj rtj, boolean z, Context context) {
        this.f34852a = rtj;
        this.f34853b = z;
        this.f34854c = context;
    }

    public final void run() {
        rtj rtj = this.f34852a;
        boolean z = this.f34853b;
        Context context = this.f34854c;
        lvn lvn = DriveBackupSettingsFragment.f29137f;
        SharedPreferences.Editor edit = rtj.edit();
        edit.putBoolean("use_mobile_data", z);
        edit.apply();
        context.sendBroadcast(new Intent("com.google.android.gms.backup.ACTION_BACKUP_NETWORK_SETTINGS_CHANGED").setPackage("com.google.android.gms"));
    }
}
