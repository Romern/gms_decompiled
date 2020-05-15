package p000;

import android.view.View;

/* renamed from: awzq */
final /* synthetic */ class awzq implements View.OnClickListener {

    /* renamed from: a */
    private final awzr f95433a;

    /* renamed from: b */
    private final int f95434b;

    public awzq(awzr awzr, int i) {
        this.f95433a = awzr;
        this.f95434b = i;
    }

    public void onClick(View view) {
        awzr awzr = this.f95433a;
        int i = this.f95434b;
        awzr.dismiss();
        bkcg bkcg = awzr.f123992d;
        if (bkcg != null) {
            bkcg.mo52062c(i);
        }
    }
}
