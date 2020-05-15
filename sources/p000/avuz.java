package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: avuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avuz extends avtw {

    /* renamed from: a */
    final /* synthetic */ rod f93948a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avuz(rkb rkb, rod rod) {
        super(rkb);
        this.f93948a = rod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        avur avur;
        avvi avvi = (avvi) rjd;
        rod rod = this.f93948a;
        if (rod != null) {
            avur = new avur(rod);
        } else {
            avur = null;
        }
        avvg avvg = new avvg((avuv) avvi.mo25289B(), this, avvi.f93971a, avur);
        avur avur2 = (avur) avvi.f93971a.get();
        if (avur2 != null) {
            ((avuv) avvi.mo25289B()).mo51633b(avur2, avvg);
        } else if (avur != null) {
            avvi.f93971a.set(avur);
            ((avuv) avvi.mo25289B()).mo51629a(avur, avvg);
        } else {
            mo9482a((Object) Status.f30107a);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }
}
