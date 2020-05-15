package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: dgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dgf {
    /* renamed from: a */
    public static Intent m8387a(Context context, byte[] bArr, djk djk, String str) {
        Intent intent = new Intent("com.google.android.chimera.container.REQUESTED_FEATURES_CHANGED");
        intent.setPackage(context.getPackageName());
        dkz.m8774a(intent, "progressListener", djk);
        if (bArr != null) {
            intent.putExtra("chimera.URGENTLY_REQUESTED_FEATURES", bArr);
        }
        if (str != null) {
            intent.putExtra("chimera.CLIENT_SESSION_ID", str);
        }
        return intent;
    }
}
