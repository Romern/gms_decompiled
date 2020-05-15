package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arkx implements rlf {

    /* renamed from: a */
    private final aucf f87833a;

    public arkx(aucf aucf) {
        this.f87833a = aucf;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        this.f87833a.mo50390a((Exception) new rjp(status));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        aqyw aqyw = (aqyw) obj;
        if (aqyw.f87129a.mo17710c()) {
            this.f87833a.mo50391a(aqyw.f87130b);
        } else {
            this.f87833a.mo50390a((Exception) new rjp(aqyw.f87129a));
        }
    }
}
