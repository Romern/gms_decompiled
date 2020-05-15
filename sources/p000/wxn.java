package p000;

import android.view.View;

/* renamed from: wxn */
public final /* synthetic */ class wxn implements View.OnClickListener {

    /* renamed from: a */
    private final wxu f51545a;

    public wxn(wxu wxu) {
        this.f51545a = wxu;
    }

    public void onClick(View view) {
        wxu wxu = this.f51545a;
        if (wxu.getActivity() instanceof wws) {
            ((wws) wxu.getActivity()).mo18610h();
        }
    }
}
