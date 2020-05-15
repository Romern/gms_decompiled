package p000;

import android.view.View;

/* renamed from: obq */
public final /* synthetic */ class obq implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    private final obr f37138a;

    public obq(obr obr) {
        this.f37138a = obr;
    }

    public final void onSystemUiVisibilityChange(int i) {
        obr obr = this.f37138a;
        if ((i & 2) == 0) {
            obr.removeCallbacks(obr.f37139a);
            obr.postDelayed(obr.f37139a, 2000);
        }
    }
}
