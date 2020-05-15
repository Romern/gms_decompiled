package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoChimeraActivity;

/* renamed from: atab */
public final /* synthetic */ class atab implements View.OnClickListener {

    /* renamed from: a */
    private final KeyguardSecurityInfoChimeraActivity f89939a;

    public atab(KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity) {
        this.f89939a = keyguardSecurityInfoChimeraActivity;
    }

    public void onClick(View view) {
        KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity = this.f89939a;
        keyguardSecurityInfoChimeraActivity.f108609b.mo49736a();
        keyguardSecurityInfoChimeraActivity.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
    }
}
