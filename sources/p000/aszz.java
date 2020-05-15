package p000;

import android.view.View;
import com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoChimeraActivity;

/* renamed from: aszz */
public final /* synthetic */ class aszz implements View.OnClickListener {

    /* renamed from: a */
    private final KeyguardSecurityInfoChimeraActivity f89937a;

    public aszz(KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity) {
        this.f89937a = keyguardSecurityInfoChimeraActivity;
    }

    public void onClick(View view) {
        KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity = this.f89937a;
        keyguardSecurityInfoChimeraActivity.setResult(-1);
        keyguardSecurityInfoChimeraActivity.finish();
    }
}
