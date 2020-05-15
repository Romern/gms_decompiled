package p000;

import android.view.View;

/* renamed from: axhm */
final /* synthetic */ class axhm implements View.OnClickListener {

    /* renamed from: a */
    private final axhs f95948a;

    public axhm(axhs axhs) {
        this.f95948a = axhs;
    }

    public void onClick(View view) {
        int i;
        axhs axhs = this.f95948a;
        axmp.m82728a(axhs.getActivity()).edit().putBoolean("marketing_impression", true).apply();
        if (axhs.f95957b.getVisibility() == 0) {
            boolean isChecked = axhs.f95957b.isChecked();
            if (!isChecked) {
                i = 169;
            } else {
                i = 168;
            }
            axhs.mo53238P(i);
            axif b = axhs.mo53243b();
            b.f95983b.execute(new axii(b.f95982a, b.f95984c, axhs.mo53242a(), isChecked, new axhp(axhs), new axhq(axhs)));
        }
        axhs.mo53244c();
    }
}
