package p000;

import android.view.View;

/* renamed from: amso */
final /* synthetic */ class amso implements View.OnClickListener {

    /* renamed from: a */
    private final amsq f75861a;

    public amso(amsq amsq) {
        this.f75861a = amsq;
    }

    public void onClick(View view) {
        amsq amsq = this.f75861a;
        amug amug = new amug();
        amug.setTargetFragment(amsq, 0);
        amug.show(amsq.getFragmentManager(), "globalSync");
    }
}
