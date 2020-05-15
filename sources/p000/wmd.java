package p000;

import java.io.IOException;

/* renamed from: wmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wmd extends soa {

    /* renamed from: a */
    final /* synthetic */ aucf f50863a;

    /* renamed from: b */
    final /* synthetic */ wmf f50864b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wmd(wmf wmf, aucf aucf) {
        super(9);
        this.f50864b = wmf;
        this.f50863a = aucf;
    }

    public final void run() {
        try {
            this.f50863a.mo50391a(gik.m13218f(this.f50864b.getActivity(), this.f50864b.f50867c));
        } catch (gid | IOException e) {
            this.f50863a.mo50390a(e);
        }
    }
}
