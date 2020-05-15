package p000;

import com.google.android.gms.backup.transport.mms.MmsRestoreChimeraService;

/* renamed from: ndg */
final /* synthetic */ class ndg implements Runnable {

    /* renamed from: a */
    private final MmsRestoreChimeraService f35334a;

    public ndg(MmsRestoreChimeraService mmsRestoreChimeraService) {
        this.f35334a = mmsRestoreChimeraService;
    }

    public final void run() {
        this.f35334a.stopForeground(true);
    }
}
