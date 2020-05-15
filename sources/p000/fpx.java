package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: fpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fpx extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        return null;
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction())) {
            fpy fpy = fpy.f17114f;
            if (!qld.m32334a(intent, "GoogleSettingsActivity") && fpy != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (fpy.f17117d == foi.m12084a(extras)) {
                        fpy.runOnUiThread(new fpw(fpy));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Bundle passed from GoogleSettingsActivity must not be null.");
            }
        }
    }
}
