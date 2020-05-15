package p000;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: qki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class qki extends deu {
    /* renamed from: a */
    public final boolean mo8627a(Intent intent) {
        Intent intent2;
        ComponentName resolveActivity;
        if (!cdlk.m133968c() || (intent2 = getIntent()) == null || !intent2.getBooleanExtra("calledFromGoogleSettings", false) || (resolveActivity = intent.resolveActivity(getPackageManager())) == null || !new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsLink").equals(resolveActivity)) {
            return super.mo8627a(intent);
        }
        return false;
    }
}
