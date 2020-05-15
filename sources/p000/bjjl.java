package p000;

import android.view.View;

/* renamed from: bjjl */
final /* synthetic */ class bjjl implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final bjjm f122828a;

    public bjjl(bjjm bjjm) {
        this.f122828a = bjjm;
    }

    public final void onFocusChange(View view, boolean z) {
        bjjm bjjm = this.f122828a;
        if (bjjm.mo65173g() && !z) {
            bjjm.mo65305d(bjjm.f122830n.mo65127m());
        }
    }
}
