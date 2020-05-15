package p000;

import android.util.Log;
import java.util.Collection;

/* renamed from: axvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvk implements axxc {

    /* renamed from: a */
    final /* synthetic */ axvr f96480a;

    public axvk(axvr axvr) {
        this.f96480a = axvr;
    }

    /* renamed from: a */
    public final void mo53600a(axzf axzf) {
    }

    /* renamed from: a */
    public final void mo53601a(axzf axzf, int i, boolean z) {
    }

    /* renamed from: a */
    public final void mo53602a(Collection collection) {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Received onConnectedNodes");
        }
        sdo.m34959a(collection);
        this.f96480a.mo53625a(new axvj(this));
    }
}
