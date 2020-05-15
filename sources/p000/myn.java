package p000;

import com.google.android.gms.backup.transport.BackupTransportChimeraService;

/* renamed from: myn */
public final /* synthetic */ class myn implements Runnable {

    /* renamed from: a */
    private final BackupTransportChimeraService f34947a;

    public myn(BackupTransportChimeraService backupTransportChimeraService) {
        this.f34947a = backupTransportChimeraService;
    }

    public final void run() {
        BackupTransportChimeraService backupTransportChimeraService = this.f34947a;
        backupTransportChimeraService.mo17280a().mo19641a(BackupTransportChimeraService.m21997e(), nab.m25823a(backupTransportChimeraService, backupTransportChimeraService.f29201b));
    }
}
