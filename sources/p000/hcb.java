package p000;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: hcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hcb {

    /* renamed from: a */
    private final Context f19459a;

    /* renamed from: b */
    private final hca f19460b;

    public hcb(Context context, hca hca) {
        this.f19459a = context;
        this.f19460b = hca;
    }

    @JavascriptInterface
    public void cancel() {
        hbz hbz = (hbz) this.f19460b;
        hbz.f19455d = true;
        hbz.f19454c.mo12407a(bmvz.f131120a);
    }

    @JavascriptInterface
    public int getModuleVersion() {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(this.f19459a).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.auth.api")) {
                    return moduleInfo.moduleVersion;
                }
            }
            return 1;
        } catch (Exception e) {
            Log.e("TAG", "Failed to get the module version: %s", e);
            return 1;
        }
    }

    @JavascriptInterface
    public void setConsentResult(String str) {
        hbz hbz = (hbz) this.f19460b;
        if (!hbz.f19455d) {
            hbz.f19454c.mo12407a(bmxv.m108567c(str));
        }
    }

    @JavascriptInterface
    public void showView() {
        ((hbz) this.f19460b).f19454c.f19530i.mo2453l(bmxv.m108566b(true));
    }
}
