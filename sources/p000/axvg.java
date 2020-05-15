package p000;

import android.util.Log;

/* renamed from: axvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvg extends axvn {

    /* renamed from: a */
    final /* synthetic */ String f96471a;

    /* renamed from: b */
    final /* synthetic */ ayei f96472b;

    /* renamed from: c */
    final /* synthetic */ ayem f96473c;

    /* renamed from: d */
    final /* synthetic */ axvr f96474d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axvg(axvr axvr, String str, ayei ayei, ayem ayem) {
        super(axvr);
        this.f96474d = axvr;
        this.f96471a = str;
        this.f96472b = ayei;
        this.f96473c = ayem;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo53610a() {
        if (Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", String.format("Running onChannelOpenRequest(%s, request)", this.f96471a));
        }
        ayei ayei = this.f96472b;
        axvz a = axvz.m83358a(this.f96471a, axue.m83239a(ayei.f97305e, ayei.f97306f), this.f96472b.f97303c, false);
        axvx axvx = (axvx) this.f96474d.f96497d.mo53628a(a);
        if (axvx == null) {
            axvx = this.f96474d.mo53623a(this.f96473c, a, this.f96472b.f97309i);
            this.f96474d.f96497d.mo53631a(a, axvx);
        }
        this.f96486g = axvx;
        ayei ayei2 = this.f96472b;
        int i = axvx.f96517e;
        if (i == 0) {
            axvx.f96520h = ayei2.f97307g;
            axvx.mo53635a(2);
            axvx.mo53651h();
            aygb aygb = axvx.f96530r;
            axvz axvz = axvx.f96513a;
            axue axue = axvz.f96540b;
            String str = axvx.f96520h;
            String str2 = axvz.f96539a;
            if (Log.isLoggable("WearableService", 2)) {
                Log.v("WearableService", String.format("onChannelOpened(%s, %s, %s, %s)", axue, axvz, str, str2));
            }
            aygb.mo53999a(axue, axvz, str, str2, 0, 0, 1, "onChannelOpened");
        } else if (i == 1) {
            Log.w("ChannelStateMachine", "Received onChannelOpenRequest while in CONNECTION_STATE_OPEN_SENT");
            throw new axvw();
        } else if (i == 2) {
            sdo.m34971a(axvx.f96520h != null, (Object) "connection established but no path");
            if (axvx.f96520h.equals(ayei2.f97307g)) {
                axvx.mo53651h();
            } else {
                Log.w("ChannelStateMachine", String.format("Two onChannelOpenRequest with same token but different paths: <%s>, <%s>", axvx.f96520h, ayei2.f97307g));
                throw new axvw();
            }
        } else if (i != 3) {
            Log.w("ChannelStateMachine", "Received onChannelOpenRequest while in CONNECTION_STATE_CLOSED");
            throw new axvw();
        } else {
            Log.w("ChannelStateMachine", "Received onChannelOpenRequest while in CONNECTION_STATE_CLOSING");
            throw new axvw();
        }
    }
}
