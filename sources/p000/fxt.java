package p000;

import android.view.View;

/* renamed from: fxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fxt implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ fxu f17545a;

    public fxt(fxu fxu) {
        this.f17545a = fxu;
    }

    public void onClick(View view) {
        fwo fwo = (fwo) this.f17545a.f17546e;
        fwo.mo11432a(true);
        fyt fyt = fwo.f17480s;
        fyt.f17658a.scrollToPosition(fwo.f17481t.mo11478g());
    }
}
