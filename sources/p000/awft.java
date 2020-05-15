package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: awft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awft {
    /* renamed from: a */
    public static int m79871a(Context context) {
        ModuleManager.ModuleInfo currentModule = ModuleManager.get(context).getCurrentModule();
        if (currentModule != null) {
            return currentModule.moduleVersion;
        }
        return 0;
    }
}
