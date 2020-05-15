package p000;

import android.util.Log;

/* renamed from: axva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axva extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvz f96448a;

    /* renamed from: b */
    final /* synthetic */ axvr f96449b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axva(axvr axvr, axvz axvz) {
        super(axvr);
        this.f96449b = axvr;
        this.f96448a = axvz;
    }

    /* renamed from: a */
    public final void mo53610a() {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running closeChannel(%s)", this.f96448a));
        }
        axvx axvx = (axvx) this.f96449b.f96497d.mo53628a(this.f96448a);
        if (axvx != null) {
            this.f96486g = axvx;
            try {
                axvx.mo53646e(0);
            } catch (axvv e) {
                mo53612a(e.f96511a);
            }
        } else if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Tried to close channel which is not open.");
        }
    }
}
