package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: avdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avdx extends avdk {

    /* renamed from: a */
    final /* synthetic */ avdy f93002a;

    protected avdx(avdy avdy) {
        this.f93002a = avdy;
    }

    /* renamed from: c */
    public final void mo51163c(Status status, byte[] bArr) {
        if (status.mo17710c()) {
            bxvd da = bxru.f164610n.mo74144da();
            try {
                da.mo73635b(bArr, bxus.m123744c());
                this.f93002a.mo17716a((rkk) new avee(status, (bxru) da.mo74062i()));
            } catch (bxwf e) {
                avdy avdy = this.f93002a;
                avdy.mo17716a((rkk) avdy.mo11187b(Status.f30109c));
            }
        } else {
            avdy avdy2 = this.f93002a;
            avdy2.mo17716a((rkk) avdy2.mo11187b(status));
        }
    }
}
