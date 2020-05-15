package p000;

import android.app.backup.BackupManager;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: aqjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqjg extends soa {

    /* renamed from: a */
    final /* synthetic */ boolean f86198a;

    /* renamed from: b */
    final /* synthetic */ aqjh f86199b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqjg(aqjh aqjh, boolean z) {
        super(10);
        this.f86199b = aqjh;
        this.f86198a = z;
    }

    public final void run() {
        aqjh aqjh = this.f86199b;
        boolean z = this.f86198a;
        int i = Build.VERSION.SDK_INT;
        if (cgkz.f187239a.mo6606a().mo84055a()) {
            try {
                new BackupManager(aqjh.f86226g).setBackupEnabled(z);
            } catch (SecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("BackupOptIn", valueOf.length() == 0 ? new String("Could not enable backup ") : "Could not enable backup ".concat(valueOf));
            }
        } else {
            aqjh.mo47916b(z);
        }
        if (this.f86198a) {
            aqjh aqjh2 = this.f86199b;
            new lsp(aqjh2.f86226g).mo19592a(aqjh2.f86203d);
        }
        if (this.f86199b.mo47915a()) {
            aqjh aqjh3 = this.f86199b;
            aqjh3.f86226g.startService(new Intent("com.google.android.gms.backup.CONNECT_TO_PHOTOS_API").setClassName(aqjh3.f86226g, "com.google.android.gms.chimera.GmsIntentOperationService").putExtra("account", aqjh3.f86203d.name).putExtra("is_enable_photos_backup", this.f86198a));
        }
    }
}
