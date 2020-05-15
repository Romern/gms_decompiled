package p000;

import java.io.IOException;

/* renamed from: wrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wrb extends soa {

    /* renamed from: a */
    final /* synthetic */ aucf f51159a;

    /* renamed from: b */
    final /* synthetic */ wrd f51160b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wrb(wrd wrd, aucf aucf) {
        super(9);
        this.f51160b = wrd;
        this.f51159a = aucf;
    }

    public final void run() {
        try {
            this.f51159a.mo50391a(gik.m13218f(this.f51160b.getActivity(), this.f51160b.f51162b));
        } catch (gid | IOException e) {
            this.f51159a.mo50390a(e);
        }
    }
}
