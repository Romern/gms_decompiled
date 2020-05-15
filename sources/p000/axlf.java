package p000;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.walletp2p.feature.widgets.keypadview.KeyPadView;

/* renamed from: axlf */
public final /* synthetic */ class axlf implements View.OnClickListener {

    /* renamed from: a */
    private final KeyPadView f96138a;

    public axlf(KeyPadView keyPadView) {
        this.f96138a = keyPadView;
    }

    public void onClick(View view) {
        axli axli = this.f96138a.f110752a;
        if (axli != null) {
            axli.mo53155a(((TextView) view).getText().charAt(0) - '0');
        }
    }
}
