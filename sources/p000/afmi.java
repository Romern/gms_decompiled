package p000;

import com.google.android.gms.mdh.SyncStatus;

/* renamed from: afmi */
final /* synthetic */ class afmi implements Runnable {

    /* renamed from: a */
    private final SyncStatus f64376a;

    /* renamed from: b */
    private final afmt f64377b;

    public afmi(afmt afmt, SyncStatus syncStatus) {
        this.f64377b = afmt;
        this.f64376a = syncStatus;
    }

    public final void run() {
        afmt afmt = this.f64377b;
        SyncStatus syncStatus = this.f64376a;
        if (afmt.f64402a) {
            basc basc = afmt.f64403b.f101684b;
            basj.m87490a(syncStatus);
            basc.mo29378c();
        }
    }
}
