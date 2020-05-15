package p000;

import android.view.View;
import com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoChimeraActivity;

/* renamed from: atac */
public final /* synthetic */ class atac implements View.OnClickListener {

    /* renamed from: a */
    private final KeyguardSecurityInfoChimeraActivity f89940a;

    public atac(KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity) {
        this.f89940a = keyguardSecurityInfoChimeraActivity;
    }

    public void onClick(View view) {
        KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity = this.f89940a;
        keyguardSecurityInfoChimeraActivity.setResult(-1);
        keyguardSecurityInfoChimeraActivity.finish();
    }
}
