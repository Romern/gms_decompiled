package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoChimeraActivity;

/* renamed from: ataa */
public final /* synthetic */ class ataa implements View.OnClickListener {

    /* renamed from: a */
    private final KeyguardSecurityInfoChimeraActivity f89938a;

    public ataa(KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity) {
        this.f89938a = keyguardSecurityInfoChimeraActivity;
    }

    public void onClick(View view) {
        KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity = this.f89938a;
        keyguardSecurityInfoChimeraActivity.f108609b.mo49736a();
        keyguardSecurityInfoChimeraActivity.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
    }
}
