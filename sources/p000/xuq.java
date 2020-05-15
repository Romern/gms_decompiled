package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.api.Status;

/* renamed from: xuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xuq extends aaab {

    /* renamed from: a */
    private final xoh f53182a;

    public xuq(int i, xoh xoh) {
        super(i, "IsUserVerifyingPlatformAuthenticatorAvailable");
        this.f53182a = xoh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i = Build.VERSION.SDK_INT;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        xoh xoh = this.f53182a;
        boolean z = false;
        if (keyguardManager != null && keyguardManager.isDeviceSecure()) {
            z = true;
        }
        xoh.mo29966a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53182a.mo29965a(status);
    }
}
