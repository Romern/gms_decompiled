package p000;

import android.hardware.biometrics.BiometricPrompt;
import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: avre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avre extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    public static final /* synthetic */ int f93815a = 0;

    /* renamed from: b */
    private final WeakReference f93816b;

    public avre(SystemUpdateChimeraActivity systemUpdateChimeraActivity) {
        this.f93816b = new WeakReference(systemUpdateChimeraActivity);
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93816b.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avrb(systemUpdateChimeraActivity));
        }
    }

    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93816b.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avrd(systemUpdateChimeraActivity));
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93816b.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avrc(systemUpdateChimeraActivity));
        }
    }
}
