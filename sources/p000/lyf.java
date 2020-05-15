package p000;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: lyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lyf {
    /* renamed from: a */
    public static bxvd m24647a(Context context) {
        bxvd da = bzoa.f170784c.mo74144da();
        bxvd da2 = bzod.f170795c.mo74144da();
        String valueOf = String.valueOf(ModuleManager.get(context).getCurrentModule().moduleVersion);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzod bzod = (bzod) da2.f164949b;
        valueOf.getClass();
        bzod.f170797a = valueOf;
        bzod.f170798b = 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzod bzod2 = (bzod) da2.mo74062i();
        bzod2.getClass();
        ((bzoa) da.f164949b).f170786a = bzod2;
        return da;
    }
}
