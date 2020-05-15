package p000;

import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: vbz */
final /* synthetic */ class vbz implements Runnable {

    /* renamed from: a */
    private final vcg f48997a;

    /* renamed from: b */
    private final ServiceConnection f48998b;

    /* renamed from: c */
    private final String f48999c;

    public vbz(vcg vcg, ServiceConnection serviceConnection, String str) {
        this.f48997a = vcg;
        this.f48998b = serviceConnection;
        this.f48999c = str;
    }

    public final void run() {
        vcg vcg = this.f48997a;
        ServiceConnection serviceConnection = this.f48998b;
        String str = this.f48999c;
        try {
            tws.m37567a().mo26849b();
            skh.m35531a().mo25691a(vcg.f49016b, "SyncScheduler", new Intent().setClassName(vcg.f49016b, "com.google.android.gms.drive.metadata.sync.syncadapter.MetadataSyncService"), serviceConnection, 1);
        } catch (InterruptedException e) {
            vcg.mo28220a(str, 2, null);
        }
    }
}
