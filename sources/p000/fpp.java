package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.GoogleSettingsItem;

/* renamed from: fpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fpp extends qld {
    /* renamed from: b */
    public final GoogleSettingsItem mo7154b() {
        return null;
    }

    public final void onHandleIntent(Intent intent) {
        synchronized (fpq.f17099b) {
            if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction()) && !qld.m32334a(intent, "GoogleSettingsIndexGetter")) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (fpq.f17098a == foi.m12084a(extras)) {
                        fpq.f17099b.notify();
                    }
                } else {
                    throw new IllegalArgumentException("Bundle must not be null.");
                }
            }
        }
    }
}
