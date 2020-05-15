package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arlb implements rlf {

    /* renamed from: a */
    private final aucf f87839a;

    public arlb(aucf aucf) {
        this.f87839a = aucf;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        this.f87839a.mo50390a((Exception) new rjp(status));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        Status status = (Status) obj;
        if (status.mo17710c()) {
            this.f87839a.mo50391a((Object) null);
        } else {
            this.f87839a.mo50390a((Exception) new rjp(status));
        }
    }
}
