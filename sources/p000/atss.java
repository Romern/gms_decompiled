package p000;

import android.view.View;

/* renamed from: atss */
final /* synthetic */ class atss implements View.OnClickListener {

    /* renamed from: a */
    private final atsx f90793a;

    public atss(atsx atsx) {
        this.f90793a = atsx;
    }

    public void onClick(View view) {
        atsx atsx = this.f90793a;
        atsx.getActivity().setResult(-1);
        atsx.getActivity().finish();
    }
}
