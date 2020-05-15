package p000;

import android.widget.CompoundButton;

/* renamed from: wxl */
public final /* synthetic */ class wxl implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final wxu f51543a;

    public wxl(wxu wxu) {
        this.f51543a = wxu;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        wxu wxu = this.f51543a;
        if (wxu.getActivity() instanceof wws) {
            ((wws) wxu.getActivity()).mo18614o();
        }
    }
}
