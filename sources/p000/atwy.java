package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tapandpay.p068ui.TokenizationSuccessChimeraActivity;

/* renamed from: atwy */
public final /* synthetic */ class atwy implements View.OnClickListener {

    /* renamed from: a */
    private final TokenizationSuccessChimeraActivity f91066a;

    /* renamed from: b */
    private final Intent f91067b;

    public atwy(TokenizationSuccessChimeraActivity tokenizationSuccessChimeraActivity, Intent intent) {
        this.f91066a = tokenizationSuccessChimeraActivity;
        this.f91067b = intent;
    }

    public void onClick(View view) {
        TokenizationSuccessChimeraActivity tokenizationSuccessChimeraActivity = this.f91066a;
        tokenizationSuccessChimeraActivity.startActivity(this.f91067b);
        tokenizationSuccessChimeraActivity.finish();
    }
}
