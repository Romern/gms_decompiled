package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* renamed from: stj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stj {
    @Deprecated
    /* renamed from: a */
    public static void m36296a(Context context, SharedPreferences.Editor editor, String str) {
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.setExecutable(true, false);
        }
        file.setExecutable(true, false);
        editor.commit();
        new File(file, str.concat(".xml")).setReadable(true, false);
    }
}
