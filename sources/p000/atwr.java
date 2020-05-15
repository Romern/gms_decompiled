package p000;

import android.app.KeyguardManager;
import com.google.android.gms.tapandpay.p068ui.SecureDeviceChimeraActivity;

/* renamed from: atwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atwr extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ SecureDeviceChimeraActivity f91058a;

    public atwr(SecureDeviceChimeraActivity secureDeviceChimeraActivity) {
        this.f91058a = secureDeviceChimeraActivity;
    }

    public final void onDismissCancelled() {
        SecureDeviceChimeraActivity secureDeviceChimeraActivity = this.f91058a;
        int i = SecureDeviceChimeraActivity.f108954d;
        secureDeviceChimeraActivity.mo59497a(445, 3);
    }

    public final void onDismissError() {
        SecureDeviceChimeraActivity secureDeviceChimeraActivity = this.f91058a;
        int i = SecureDeviceChimeraActivity.f108954d;
        secureDeviceChimeraActivity.mo59498e();
    }

    public final void onDismissSucceeded() {
        rjx.m33696b(this.f91058a.getApplicationContext()).mo24771y();
        SecureDeviceChimeraActivity secureDeviceChimeraActivity = this.f91058a;
        int i = SecureDeviceChimeraActivity.f108954d;
        secureDeviceChimeraActivity.mo59497a(-1, 3);
    }
}
