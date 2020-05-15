package p000;

import android.view.View;

/* renamed from: bjgr */
final /* synthetic */ class bjgr implements View.OnClickListener {

    /* renamed from: a */
    private final bjgt f122672a;

    /* renamed from: b */
    private final View f122673b;

    public bjgr(bjgt bjgt, View view) {
        this.f122672a = bjgt;
        this.f122673b = view;
    }

    public void onClick(View view) {
        bjgt bjgt = this.f122672a;
        View view2 = this.f122673b;
        if (bjgt.f122684i == null) {
            bjgt.f122684i = bjie.f122757a.mo65278b();
        }
        ayws ayws = bjgt.f122684i;
        aywr aywr = new aywr((aywt) new aywq(bqbo.TAP).f98641a.mo74062i());
        ayws.f98643a.mo54457a(new ayxu(ayww.m85000a(view2), aywr));
    }
}
