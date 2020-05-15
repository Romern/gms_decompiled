package p000;

import android.util.Log;

/* renamed from: axvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axvb extends axvn {

    /* renamed from: a */
    final /* synthetic */ axvz f96450a;

    /* renamed from: b */
    final /* synthetic */ int f96451b;

    /* renamed from: c */
    final /* synthetic */ axvr f96452c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvb(axvr axvr, axvz axvz, int i) {
        super(axvr);
        this.f96452c = axvr;
        this.f96450a = axvz;
        this.f96451b = i;
    }

    /* renamed from: a */
    public final void mo53610a() {
        if (!Log.isLoggable("ChannelManager", 2)) {
            axvx axvx = (axvx) this.f96452c.f96497d.mo53628a(this.f96450a);
            if (axvx != null) {
                this.f96486g = axvx;
                try {
                    axvx.mo53646e(this.f96451b);
                } catch (axvv e) {
                    mo53612a(e.f96511a);
                }
            } else if (Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", "Tried to close channel which is not open.");
            }
        } else {
            Object[] objArr = new Object[3];
            objArr[0] = this.f96450a;
            objArr[1] = Integer.valueOf(this.f96451b);
            throw null;
        }
    }
}
