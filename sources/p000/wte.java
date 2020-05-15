package p000;

import android.view.View;

/* renamed from: wte */
final /* synthetic */ class wte implements View.OnClickListener {

    /* renamed from: a */
    private final wts f51291a;

    public wte(wts wts) {
        this.f51291a = wts;
    }

    public void onClick(View view) {
        this.f51291a.getActivity().onBackPressed();
    }
}
