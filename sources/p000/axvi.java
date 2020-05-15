package p000;

import android.util.Log;
import java.io.IOException;

/* renamed from: axvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axvi extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvr f96478a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvi(axvr axvr) {
        super(axvr, false);
        this.f96478a = axvr;
    }

    /* renamed from: a */
    public final void mo53610a() {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Running cleanup.");
        }
        mo53613b();
        try {
            this.f96478a.f96495b.close();
        } catch (IOException e) {
            Log.w("ChannelManager", "Failed to close selector", e);
        }
    }
}
