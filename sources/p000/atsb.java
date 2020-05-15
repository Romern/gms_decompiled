package p000;

import android.view.View;

/* renamed from: atsb */
final /* synthetic */ class atsb implements View.OnClickListener {

    /* renamed from: a */
    private final atsc f90751a;

    public atsb(atsc atsc) {
        this.f90751a = atsc;
    }

    public void onClick(View view) {
        atsc atsc = this.f90751a;
        atsc.getActivity().setResult(-1);
        atsc.getActivity().finish();
    }
}
