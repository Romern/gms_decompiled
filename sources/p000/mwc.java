package p000;

import com.google.android.gms.backup.settings.p033ui.DeviceBackupDetailFragment;

/* renamed from: mwc */
final /* synthetic */ class mwc implements Runnable {

    /* renamed from: a */
    private final mwd f34833a;

    /* renamed from: b */
    private final Boolean f34834b;

    public mwc(mwd mwd, Boolean bool) {
        this.f34833a = mwd;
        this.f34834b = bool;
    }

    public final void run() {
        mwd mwd = this.f34833a;
        Boolean bool = this.f34834b;
        mwd.f34835a.f29121d = bool.booleanValue();
        DeviceBackupDetailFragment.f29120c.mo25414c("isunlockrequired: %b", Boolean.valueOf(mwd.f34835a.f29121d));
    }
}
