package p000;

import com.google.android.wallet.biometric.DeviceCredentialHandlerActivity;

/* renamed from: bjss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjss {
    /* renamed from: a */
    static void m104507a(dnx dnx) {
        if ((dnx instanceof DeviceCredentialHandlerActivity) && !dnx.isFinishing()) {
            dnx.finish();
        }
    }

    /* renamed from: a */
    static boolean m104508a() {
        bjsk bjsk = bjsk.f123233a;
        return bjsk != null && bjsk.f123236d;
    }

    /* renamed from: a */
    public static boolean m104509a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return false;
            case 6:
            default:
                return true;
        }
    }
}
