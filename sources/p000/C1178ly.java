package p000;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;

@Deprecated
/* renamed from: ly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1178ly {

    /* renamed from: a */
    public final Context f26668a;

    private C1178ly(Context context) {
        this.f26668a = context;
    }

    /* renamed from: a */
    public static C1178ly m19617a(Context context) {
        return new C1178ly(context);
    }

    /* renamed from: b */
    public static FingerprintManager m19618b(Context context) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo15434a() {
        int i = Build.VERSION.SDK_INT;
        FingerprintManager b = m19618b(this.f26668a);
        return b != null && b.hasEnrolledFingerprints();
    }

    /* renamed from: b */
    public final boolean mo15435b() {
        int i = Build.VERSION.SDK_INT;
        FingerprintManager b = m19618b(this.f26668a);
        return b != null && b.isHardwareDetected();
    }
}
