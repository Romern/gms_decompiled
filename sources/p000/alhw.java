package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: alhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alhw {

    /* renamed from: a */
    public static final alhx[] f73522a = {new alhz(), new alib(), new alia()};

    /* renamed from: b */
    public final Context f73523b;

    /* renamed from: c */
    public final aljq f73524c;

    /* renamed from: d */
    private final ModuleManager f73525d;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public alhw(Context context) {
        ModuleManager moduleManager = ModuleManager.get(context);
        aljq aljq = new aljq(context);
        this.f73523b = context.getApplicationContext();
        this.f73525d = moduleManager;
        this.f73524c = aljq;
    }

    /* renamed from: a */
    public final void mo40355a() {
        if (mo40358a(true) && mo40357a(this.f73523b, f73522a)) {
            mo40359b();
        }
    }

    /* renamed from: b */
    public final boolean mo40359b() {
        ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
        featureRequest.requestFeatureAtLatestVersion(aldg.f73481a.f30068a);
        featureRequest.setUrgent();
        return this.f73525d.requestFeatures(featureRequest);
    }

    /* renamed from: a */
    public final boolean mo40356a(int i) {
        if (!mo40358a(true)) {
            return false;
        }
        this.f73524c.mo40450a(i);
        return mo40359b();
    }

    /* renamed from: a */
    public final boolean mo40357a(Context context, alhx[] alhxArr) {
        int length = alhxArr.length;
        int i = 0;
        while (i < 3) {
            alhy a = alhxArr[i].mo40360a(context);
            if (!a.f73526a) {
                i++;
            } else {
                this.f73524c.mo40450a(a.f73527b);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo40358a(boolean z) {
        bdxy a;
        int i = Build.VERSION.SDK_INT;
        if (cfuf.f185724a.mo6606a().mo82736b() && (a = bdxy.m91563a(this.f73523b.getContentResolver(), anef.m64088a("com.google.android.gms.pay"))) != null) {
            a.mo58435b();
        }
        if (cfuc.m143051c()) {
            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
            featureRequest.unrequestFeature(aldg.f73481a.f30068a);
            this.f73525d.requestFeatures(featureRequest);
            return false;
        } else if (!z) {
            return true;
        } else {
            String b = cfuc.m143050b();
            if (TextUtils.isEmpty(b) || b.equals("INELIGIBLE")) {
                return cfuc.f185713a.mo6606a().mo82730f();
            }
            return true;
        }
    }
}
