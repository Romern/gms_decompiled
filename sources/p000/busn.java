package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* renamed from: busn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busn {
    /* renamed from: a */
    public static Intent m120389a(Context context, String str, byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        if (cfoj.f184966a.mo6606a().mo82131bB()) {
            Intent intent = new Intent("com.android.settings.BLUETOOTH_DEVICE_DETAIL_SETTINGS");
            Bundle bundle = new Bundle();
            bundle.putString("device_address", str);
            intent.putExtra(":settings:show_fragment_args", bundle);
            return intent;
        } else if (!cfoj.m141543X()) {
            return null;
        } else {
            Intent a = buso.m120390a(context);
            a.setAction("com.google.android.gms.nearby.fastpair.GMSCORE_DEVICE_DETAILS");
            a.putExtra("account_key", bArr);
            return a;
        }
    }
}
