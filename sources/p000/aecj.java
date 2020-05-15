package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: aecj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aecj {

    /* renamed from: a */
    private static final Uri f63137a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public static Intent m51628a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("serviceActionBundleKey", str);
        try {
            Bundle call = context.getContentResolver().call(f63137a, "serviceIntentCall", (String) null, bundle);
            if (call == null) {
                String valueOf = String.valueOf(str);
                Log.e("BoundServiceResolver", valueOf.length() == 0 ? new String("Bound service resolution failed: ") : "Bound service resolution failed: ".concat(valueOf));
                return null;
            }
            Intent intent = (Intent) call.getParcelable("serviceResponseIntentKey");
            if (intent != null) {
                return intent;
            }
            String valueOf2 = String.valueOf(str);
            Log.e("BoundServiceResolver", valueOf2.length() == 0 ? new String("Bound service not found for action: ") : "Bound service not found for action: ".concat(valueOf2));
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf3 = String.valueOf(str);
            Log.e("BoundServiceResolver", valueOf3.length() == 0 ? new String("Bound service resolution failed: ") : "Bound service resolution failed: ".concat(valueOf3), e);
            return null;
        }
    }
}
