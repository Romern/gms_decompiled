package p000;

import android.util.Log;

/* renamed from: axvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvh extends axvn {

    /* renamed from: a */
    final /* synthetic */ String f96475a;

    /* renamed from: b */
    final /* synthetic */ ayei f96476b;

    /* renamed from: c */
    final /* synthetic */ axvr f96477c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvh(axvr axvr, String str, ayei ayei) {
        super(axvr);
        this.f96477c = axvr;
        this.f96475a = str;
        this.f96476b = ayei;
    }

    /* renamed from: a */
    public final void mo53610a() {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelOpenAck(%s, request)", this.f96475a));
        }
        ayei ayei = this.f96476b;
        axvx axvx = (axvx) this.f96477c.f96497d.mo53629a(this.f96475a, ayei.f97303c, !ayei.f97304d);
        if (axvx != null) {
            this.f96486g = axvx;
            axvz axvz = axvx.f96513a;
            if (this.f96475a.equals(axvz.f96539a)) {
                int i = axvx.f96517e;
                if (i != 0) {
                    if (i != 1) {
                        if (!(i == 3 || i == 4)) {
                            return;
                        }
                    } else if (axvx.f96533u != null) {
                        axyi axyi = axvx.f96531s;
                        if (axyi == null) {
                            Log.w("ChannelStateMachine", "Bad state: CONNECTION_STATE_OPEN_SENT but no entry in retransmission queue");
                            throw new axvw();
                        } else if (!axyi.mo53764a()) {
                            Log.i("ChannelStateMachine", "Received OPEN_ACK but request already timed out.");
                            return;
                        } else {
                            axvx.f96531s = null;
                            axvx.f96533u.mo54015a(0, axvx.f96513a, axvx.f96520h);
                            axvx.f96533u = null;
                            axvx.mo53635a(2);
                            return;
                        }
                    } else {
                        Log.w("ChannelStateMachine", "Bad state: CONNECTION_STATE_OPEN_SENT but no callbacks to set");
                        throw new axvw();
                    }
                }
                throw new axvw();
            }
            Log.w("ChannelManager", String.format("Got OPEN_ACK from wrong node for channel %s. Expected %s got %s", Long.valueOf(this.f96476b.f97303c), axvz.f96539a, this.f96475a));
        } else if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "onChannelOpenAck: no such channel");
        }
    }
}
