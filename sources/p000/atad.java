package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: atad */
public final /* synthetic */ class atad implements View.OnClickListener {

    /* renamed from: a */
    private final KeyguardSecurityInfoChimeraActivity f89941a;

    public atad(KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity) {
        this.f89941a = keyguardSecurityInfoChimeraActivity;
    }

    public void onClick(View view) {
        KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity = this.f89941a;
        atam atam = keyguardSecurityInfoChimeraActivity.f108609b;
        atam.mo49741a(atam.mo49734a(43));
        Intent intent = new Intent("android.app.action.SET_NEW_PASSWORD");
        intent.putExtra("minimum_quality", (int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        keyguardSecurityInfoChimeraActivity.startActivityForResult(intent, 1);
    }
}
