package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: aqla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqla {

    /* renamed from: a */
    private final Context f86322a;

    /* renamed from: b */
    private final aqkz f86323b;

    public aqla(Context context, aqkz aqkz) {
        this.f86322a = context;
        this.f86323b = aqkz;
    }

    @JavascriptInterface
    public void cancel() {
        ((aqky) this.f86323b).f86319b.mo69138b(bmvz.f131120a);
    }

    @JavascriptInterface
    public int getModuleVersion() {
        Context context = this.f86322a;
        if (aqph.f86500b != -1) {
            return aqph.f86500b;
        }
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.signin")) {
                    int i = moduleInfo.moduleVersion;
                    aqph.f86500b = i;
                    return i;
                }
            }
            return -1;
        } catch (Exception e) {
            aqph.f86499a.mo25417e("Failed to get the module version: %s", e, new Object[0]);
            return -1;
        }
    }

    @JavascriptInterface
    public void setConsentResult(String str) {
        ((aqky) this.f86323b).f86319b.mo69138b(bmxv.m108566b(str));
    }

    @JavascriptInterface
    public void showView() {
        aqkz aqkz = this.f86323b;
        Activity activity = ((Fragment) aqkz).getActivity();
        bmxy.m108581a(activity);
        activity.runOnUiThread(new aqku((aqky) aqkz));
    }
}
