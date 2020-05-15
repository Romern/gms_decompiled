package p000;

import android.widget.CompoundButton;

/* renamed from: wxm */
public final /* synthetic */ class wxm implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final wxu f51544a;

    public wxm(wxu wxu) {
        this.f51544a = wxu;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        wxu wxu = this.f51544a;
        if (wxu.getActivity() instanceof wws) {
            ((wws) wxu.getActivity()).mo18614o();
        }
    }
}
