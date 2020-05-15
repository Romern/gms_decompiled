package p000;

import android.view.View;

/* renamed from: ahyj */
final /* synthetic */ class ahyj implements View.OnClickListener {

    /* renamed from: a */
    private final ahym f68350a;

    public ahyj(ahym ahym) {
        this.f68350a = ahym;
    }

    public void onClick(View view) {
        ahym ahym = this.f68350a;
        ahyw ahyw = ahym.f68357d;
        if (ahyw == null) {
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("DevicePairingFragment: No setup related information in half sheet");
            ahym.f68355b.setVisibility(4);
        } else if (ahym.mo37295a(ahvd.m56710a(ahyw.f68399h), ahym.f68357d.f68400i) != null) {
            ahym.startActivity(ahym.mo37295a(ahvd.m56710a(ahym.f68357d.f68399h), ahym.f68357d.f68400i));
        } else {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("DevicePairingFragment: No companion app info found");
        }
    }
}
