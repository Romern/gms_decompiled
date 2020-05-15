package p000;

import android.accounts.Account;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.wallet.p088ui.verifypin.KeyPadView;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;

/* renamed from: axcu */
public final /* synthetic */ class axcu implements View.OnClickListener {

    /* renamed from: a */
    private final KeyPadView f95796a;

    public axcu(KeyPadView keyPadView) {
        this.f95796a = keyPadView;
    }

    public void onClick(View view) {
        axcw axcw = this.f95796a.f110594a;
        if (axcw != null) {
            int charAt = ((TextView) view).getText().charAt(0) - '0';
            axcz axcz = (axcz) axcw;
            if (axcz.f95803c.length() < 4) {
                axcz.f95804d.setVisibility(4);
                axcz.f95803c.append(charAt);
                axcz.f95809i.mo60137a(axcz.f95803c.length());
                if (axcz.f95803c.length() == 4) {
                    axcz.mo53028a(false);
                    axcz.f95809i.mo60138b(1);
                    String sb = axcz.f95803c.toString();
                    Account h = axcz.mo53029h();
                    int i = axcz.f95806f;
                    axcz.f95806f = i + 1;
                    ReauthProofTokenRequest reauthProofTokenRequest = new ReauthProofTokenRequest(h, sb, 2, i);
                    axcz.f95805e = bjst.m104515a(axcz.f94161b, 6);
                    axcz.mo53030i().f94357a.mo52424a(reauthProofTokenRequest);
                }
            }
        }
    }
}
