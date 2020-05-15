package p000;

import com.google.android.gms.backup.transport.BackupTransportChimeraService;

/* renamed from: myp */
public final /* synthetic */ class myp implements Runnable {

    /* renamed from: a */
    private final BackupTransportChimeraService f34949a;

    public myp(BackupTransportChimeraService backupTransportChimeraService) {
        this.f34949a = backupTransportChimeraService;
    }

    public final void run() {
        BackupTransportChimeraService backupTransportChimeraService = this.f34949a;
        backupTransportChimeraService.mo17281a(true);
        if (backupTransportChimeraService.mo17283c()) {
            backupTransportChimeraService.mo17282b();
        }
    }
}
