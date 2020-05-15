package p000;

import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: ajbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajbj implements aiyq {

    /* renamed from: a */
    final /* synthetic */ ajbn f70323a;

    public ajbj(ajbn ajbn) {
        this.f70323a = ajbn;
    }

    /* renamed from: a */
    public final void mo38286a(aiyo aiyo) {
        if (cfop.m141879i()) {
            for (byzr byzr : this.f70323a.f70330d.mo38453a(this.f70323a.f70331e.mo38292a(aiyo)).mo38457a()) {
                ajbn ajbn = this.f70323a;
                ajdv ajdv = new ajdv();
                ajdv.f70402b = this.f70323a.mo38443a(byzr);
                ajdv.mo38532c();
                ajbn.mo38451a(ajdv.mo38525a(), aiyo);
            }
        }
        if (cfop.m141874d()) {
            for (ajag ajag : this.f70323a.f70332f.mo38385a()) {
                NearbyDevice a = ajbn.m58446a(ajag);
                ajbn ajbn2 = this.f70323a;
                ajdv ajdv2 = new ajdv();
                ajdv2.mo38532c();
                ajdv2.mo38527a(a);
                ajbn2.mo38448a(ajdv2, a, ajag.mo38371b(), ajag.mo38372c(), ajag.mo38374d(), aiyo);
            }
        }
    }

    /* renamed from: b */
    public final void mo38287b() {
        this.f70323a.f70330d.mo38454a().retainAll(this.f70323a.f70331e.mo38301c());
    }
}
