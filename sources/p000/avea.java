package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: avea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avea extends avdk {

    /* renamed from: a */
    final /* synthetic */ aveb f93005a;

    public avea(aveb aveb) {
        this.f93005a = aveb;
    }

    /* renamed from: d */
    public final void mo51164d(Status status, byte[] bArr) {
        if (status.mo17710c()) {
            bxvd da = bxsv.f164751e.mo74144da();
            try {
                da.mo73635b(bArr, bxus.m123744c());
                this.f93005a.mo17716a((rkk) new aveg(status, (bxsv) da.mo74062i()));
            } catch (bxwf e) {
                aveb aveb = this.f93005a;
                aveb.mo17716a((rkk) aveb.mo11187b(Status.f30109c));
            }
        } else {
            aveb aveb2 = this.f93005a;
            aveb2.mo17716a((rkk) aveb2.mo11187b(status));
        }
    }
}
