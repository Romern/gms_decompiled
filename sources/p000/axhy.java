package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: axhy */
final /* synthetic */ class axhy implements axls {

    /* renamed from: a */
    private final axhz f95966a;

    public axhy(axhz axhz) {
        this.f95966a = axhz;
    }

    /* renamed from: a */
    public final void mo53097a(Object obj) {
        axhz axhz = this.f95966a;
        axlt axlt = (axlt) obj;
        axhz.f95967a.f95970a = new StringBuilder();
        axic axic = axhz.f95967a;
        axic.f95971b.mo60215a(axic.f95970a.length());
        if (axlt.f96158b != null) {
            axhz.f95967a.mo53157a(MfiClientException.TYPE_MFICLIENT_STARTED);
            axhz.f95967a.f95972c.setText(axlt.f96158b.f171555b);
            axhz.f95967a.f95972c.setVisibility(0);
            TextView textView = axhz.f95967a.f95972c;
            textView.announceForAccessibility(textView.getText());
            axhz.f95967a.f95973d.showNext();
            return;
        }
        axhz.f95967a.mo53157a(MfiClientException.TYPE_MFICLIENT_NOT_STARTED);
        if (axlt.f96157a == 7) {
            axhz.f95967a.f95972c.setText((int) C0126R.string.common_no_network);
        } else {
            axhz.f95967a.f95972c.setText((int) C0126R.string.common_something_went_wrong);
        }
        axhz.f95967a.f95972c.setVisibility(0);
        axhz.f95967a.f95973d.showNext();
    }
}
