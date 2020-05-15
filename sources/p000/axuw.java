package p000;

import android.util.Log;

/* renamed from: axuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axuw extends axvn {

    /* renamed from: a */
    final /* synthetic */ String f96433a;

    /* renamed from: b */
    final /* synthetic */ ayei f96434b;

    /* renamed from: c */
    final /* synthetic */ axvr f96435c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axuw(axvr axvr, String str, ayei ayei) {
        super(axvr);
        this.f96435c = axvr;
        this.f96433a = str;
        this.f96434b = ayei;
    }

    /* renamed from: a */
    public final void mo53610a() {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelClose(%s, request)", this.f96433a));
        }
        String str = this.f96433a;
        ayei ayei = this.f96434b;
        axue a = axue.m83239a(ayei.f97305e, ayei.f97306f);
        ayei ayei2 = this.f96434b;
        axvx axvx = (axvx) this.f96435c.f96497d.mo53632b(axvz.m83358a(str, a, ayei2.f97303c, true ^ ayei2.f97304d));
        if (axvx != null) {
            this.f96486g = axvx;
            ayei ayei3 = this.f96434b;
            ayig ayig = axvx.f96533u;
            if (ayig == null) {
                axvx.mo53636a(2, ayei3.f97308h);
                axvx.mo53641b(2, ayei3.f97308h);
                aygb aygb = axvx.f96530r;
                axvz axvz = axvx.f96513a;
                aygb.mo53998a(axvz.f96540b, axvz, axvx.f96520h, axvz.f96539a, 2, ayei3.f97308h);
            } else {
                ayig.mo54015a(16, null, axvx.f96520h);
                axvx.f96533u = null;
            }
            axvx.mo53650g();
        } else if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Received to close packet for channel which is not open.");
        }
    }
}
