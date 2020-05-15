package p000;

import android.view.View;
import com.google.android.gms.wallet.p088ui.verifypin.KeyPadView;

/* renamed from: axcv */
public final /* synthetic */ class axcv implements View.OnClickListener {

    /* renamed from: a */
    private final KeyPadView f95797a;

    public axcv(KeyPadView keyPadView) {
        this.f95797a = keyPadView;
    }

    public void onClick(View view) {
        axcz axcz = (axcz) this.f95797a.f110594a;
        if (axcz.f95803c.length() > 0) {
            axcz.f95804d.setVisibility(4);
            StringBuilder sb = axcz.f95803c;
            sb.deleteCharAt(sb.length() - 1);
            axcz.f95809i.mo60137a(axcz.f95803c.length());
        }
    }
}
