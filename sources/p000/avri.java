package p000;

import android.hardware.biometrics.BiometricPrompt;
import com.google.android.gms.update.phone.SystemUpdateChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: avri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avri extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    public static final /* synthetic */ int f93820a = 0;

    /* renamed from: b */
    private final WeakReference f93821b;

    public avri(SystemUpdateChimeraActivity systemUpdateChimeraActivity) {
        this.f93821b = new WeakReference(systemUpdateChimeraActivity);
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93821b.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avrf(systemUpdateChimeraActivity));
        }
    }

    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93821b.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avrh(systemUpdateChimeraActivity));
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        SystemUpdateChimeraActivity systemUpdateChimeraActivity = (SystemUpdateChimeraActivity) this.f93821b.get();
        if (systemUpdateChimeraActivity != null) {
            systemUpdateChimeraActivity.runOnUiThread(new avrg(systemUpdateChimeraActivity));
        }
    }
}
