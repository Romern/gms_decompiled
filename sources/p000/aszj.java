package p000;

import android.view.View;
import com.google.android.gms.tapandpay.issuer.RequestTokenizeChimeraActivity;

/* renamed from: aszj */
public final /* synthetic */ class aszj implements View.OnClickListener {

    /* renamed from: a */
    private final RequestTokenizeChimeraActivity f89917a;

    public aszj(RequestTokenizeChimeraActivity requestTokenizeChimeraActivity) {
        this.f89917a = requestTokenizeChimeraActivity;
    }

    public void onClick(View view) {
        RequestTokenizeChimeraActivity requestTokenizeChimeraActivity = this.f89917a;
        asjl.m74237b(requestTokenizeChimeraActivity, "Issuer Tokenize Cancel");
        requestTokenizeChimeraActivity.setResult(0);
        requestTokenizeChimeraActivity.finish();
    }
}
