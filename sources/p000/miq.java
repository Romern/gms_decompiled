package p000;

import android.os.Bundle;
import com.google.android.gms.backup.d2d.migrate.service.protocol.p2p.PlayP2pRestoreServiceResultReceiver;

/* renamed from: miq */
public final /* synthetic */ class miq implements Runnable {

    /* renamed from: a */
    private final PlayP2pRestoreServiceResultReceiver f33792a;

    /* renamed from: b */
    private final Bundle f33793b;

    public miq(PlayP2pRestoreServiceResultReceiver playP2pRestoreServiceResultReceiver, Bundle bundle) {
        this.f33792a = playP2pRestoreServiceResultReceiver;
        this.f33793b = bundle;
    }

    public final void run() {
        PlayP2pRestoreServiceResultReceiver playP2pRestoreServiceResultReceiver = this.f33792a;
        Bundle bundle = this.f33793b;
        mhx mhx = playP2pRestoreServiceResultReceiver.f29040a;
        if (bundle.getBoolean("p2pdisconnectservice")) {
            mhx.f33751b.f33758i.mo20075a();
        }
        mhx.f33751b.mo20032a(mhx.f33750a);
    }
}
