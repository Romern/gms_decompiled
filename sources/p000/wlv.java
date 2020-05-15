package p000;

import java.io.IOException;

/* renamed from: wlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wlv extends soa {

    /* renamed from: a */
    final /* synthetic */ aucf f50850a;

    /* renamed from: b */
    final /* synthetic */ wlx f50851b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wlv(wlx wlx, aucf aucf) {
        super(9);
        this.f50851b = wlx;
        this.f50850a = aucf;
    }

    public final void run() {
        try {
            this.f50850a.mo50391a(gik.m13218f(this.f50851b.getActivity(), this.f50851b.f50854c));
        } catch (gid | IOException e) {
            this.f50850a.mo50390a(e);
        }
    }
}
