package p000;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: fga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fga {
    /* renamed from: a */
    public static bnhe m11641a(Intent intent) {
        bnha h = bnhe.m109414h();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                if (str.startsWith("extra.screen.")) {
                    String substring = str.substring(13);
                    if (extras.getString(str) != null) {
                        h.mo67695b(substring, extras.getString(str));
                    }
                }
            }
        }
        return h.mo67618b();
    }

    /* renamed from: b */
    public static boolean m11642b(Intent intent) {
        return intent.getBooleanExtra("extra.ignoreAccount", false);
    }
}
