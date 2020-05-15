package p000;

import android.view.View;

/* renamed from: wqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wqz implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ wrd f51157a;

    public wqz(wrd wrd) {
        this.f51157a = wrd;
    }

    public void onClick(View view) {
        wrd wrd = this.f51157a;
        aucf aucf = new aucf();
        new wrb(wrd, aucf).start();
        aucf.f91388a.mo50364a((auca) new wqy(this));
        this.f51157a.f51163c.mo18457n();
    }
}
