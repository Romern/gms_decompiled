package p000;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.IOException;

/* renamed from: juh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juh implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SourceChimeraActivity f23229a;

    public juh(SourceChimeraActivity sourceChimeraActivity) {
        this.f23229a = sourceChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        boolean z2;
        DevicePolicyManager devicePolicyManager;
        Intent createConfirmDeviceCredentialIntent;
        SourceChimeraActivity sourceChimeraActivity = this.f23229a;
        if (sourceChimeraActivity.f11270e) {
            synchronized (sourceChimeraActivity.f11274i) {
                if (sourceChimeraActivity.f11284s != null) {
                    bxvd da = jus.f23257h.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    jus.m17350a((jus) da.f164949b);
                    String string = sourceChimeraActivity.getString(C0126R.string.auth_d2d_target_unlock_progress_message);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    jus jus = (jus) da.f164949b;
                    string.getClass();
                    jus.f23259a |= 2;
                    jus.f23260b = string;
                    try {
                        sourceChimeraActivity.f11284s.mo14097a((jus) da.mo74062i());
                    } catch (IOException e) {
                        SourceChimeraActivity.f11265a.mo25410a((Throwable) e);
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                KeyguardManager keyguardManager = (KeyguardManager) sourceChimeraActivity.getSystemService("keyguard");
                z = true;
                if (keyguardManager == null || (createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(sourceChimeraActivity.getString(C0126R.string.auth_d2d_source_title), null)) == null) {
                    z2 = false;
                } else {
                    sourceChimeraActivity.f11275j = true;
                    sourceChimeraActivity.startActivityForResult(createConfirmDeviceCredentialIntent, 1);
                    z2 = true;
                }
                if (!z2 && (devicePolicyManager = (DevicePolicyManager) sourceChimeraActivity.getSystemService("device_policy")) != null) {
                    sourceChimeraActivity.f11282q = new asfb(sourceChimeraActivity, 805306394, "d2d", null, "com.google.android.gms");
                    try {
                        sourceChimeraActivity.f11275j = true;
                        devicePolicyManager.lockNow();
                    } catch (SecurityException e2) {
                        sourceChimeraActivity.f11275j = false;
                        sourceChimeraActivity.f11282q = null;
                    }
                }
                z = z2;
            }
            if (!z) {
                SourceChimeraActivity.f11265a.mo25414c("Unable to bring up the lockscreen", new Object[0]);
            } else {
                return;
            }
        }
        this.f23229a.mo7852a();
    }
}
