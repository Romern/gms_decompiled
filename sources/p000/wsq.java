package p000;

import android.view.View;

/* renamed from: wsq */
final /* synthetic */ class wsq implements View.OnClickListener {

    /* renamed from: a */
    private final wtd f51260a;

    public wsq(wtd wtd) {
        this.f51260a = wtd;
    }

    public void onClick(View view) {
        this.f51260a.getActivity().onBackPressed();
    }
}
