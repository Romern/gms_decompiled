package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ahyl */
final /* synthetic */ class ahyl implements View.OnClickListener {

    /* renamed from: a */
    private final ahym f68353a;

    public ahyl(ahym ahym) {
        this.f68353a = ahym;
    }

    public void onClick(View view) {
        ahym ahym = this.f68353a;
        if (ahym.f68357d != null) {
            ahym.f68354a.setVisibility(4);
            ahym.f68356c.setText(ahym.getString(C0126R.string.common_connecting));
            ahym.getActivity().startService(ahys.m56884a(ahym.getActivity(), 0, ahym.f68357d));
            return;
        }
        ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("DevicePairingFragment: No pairing related information in half sheet");
    }
}
