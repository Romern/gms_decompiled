package p000;

import android.util.Log;

/* renamed from: axvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvl extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvm f96481a;

    /* renamed from: b */
    final /* synthetic */ axyi f96482b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvl(axvm axvm, axyi axyi) {
        super(axvm.f96484b);
        this.f96481a = axvm;
        this.f96482b = axyi;
    }

    /* renamed from: a */
    public final void mo53610a() {
        axvm axvm = this.f96481a;
        axvx axvx = (axvx) axvm.f96484b.f96497d.mo53628a(axvm.f96483a);
        if (axvx != null) {
            this.f96486g = axvx;
            try {
                axyi axyi = this.f96482b;
                if (axyi == axvx.f96531s) {
                    if (axvx.f96517e == 1) {
                        axvx.f96531s = null;
                        ayig ayig = axvx.f96533u;
                        if (ayig != null) {
                            ayig.mo54015a(15, null, axvx.f96520h);
                            axvx.f96533u = null;
                        } else {
                            Log.w("ChannelStateMachine", "Bad state: CONNECTION_STATE_OPEN_SENT but no callbacks to set");
                            throw new axvw();
                        }
                    } else {
                        Log.w("ChannelStateMachine", "Bad state: OPEN_SENT timed out, but not in CONNECTION_STATE_OPEN_SENT");
                        throw new axvw();
                    }
                } else if (axyi == axvx.f96532t) {
                    Log.w("ChannelStateMachine", "Sending data timed out. Closing channel");
                    axvx.f96532t = null;
                    axvx.mo53636a(1, 0);
                    axvx.mo53641b(1, 0);
                    axvx.mo53648f(0);
                    throw axvx.mo53642c(1, 0);
                }
                Log.w("ChannelStateMachine", "Received timeout event for request that we weren't expecting");
            } catch (axvv e) {
                mo53612a(e.f96511a);
            }
        }
    }
}
