package p000;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: jvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jvj {
    /* renamed from: a */
    public static String m17398a(Context context, boolean z, String str, rrq rrq, boolean z2) {
        new sts(context);
        if (!"cn.google".equals(str)) {
            if (rrq.f43554c) {
                return (String) gnv.f18745p.mo58455c();
            }
            if (!gkf.f18388a.mo11981b(context)) {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                if (uiModeManager == null || uiModeManager.getCurrentModeType() != 7) {
                    sre.m36087g(context);
                    if (sts.m36312b()) {
                        sre.m36087g(context);
                        return (String) gnv.f18722A.mo58455c();
                    } else if (!rrp.m34306a(rrq.f43552a)) {
                        if (z) {
                            return gnv.m13559d(false);
                        }
                        if (!z2 && ccbz.m129219b()) {
                            return gnv.m13559d(true);
                        }
                        return (String) gnv.f18753x.mo58455c();
                    } else if (z) {
                        return gnv.m13555b(false);
                    } else {
                        if (!z2 && ccbz.m129219b()) {
                            return gnv.m13555b(true);
                        }
                        return (String) gnv.f18752w.mo58455c();
                    }
                } else if (z) {
                    return gnv.m13556c(false);
                } else {
                    if (!z2 && ccbz.m129219b()) {
                        return gnv.m13556c(true);
                    }
                    return (String) gnv.f18741l.mo58455c();
                }
            } else if (z) {
                return gnv.m13518a(false);
            } else {
                if (!z2 && ccbz.m129219b()) {
                    return gnv.m13518a(true);
                }
                return (String) gnv.f18751v.mo58455c();
            }
        } else if (!z) {
            return (String) gnv.f18749t.mo58455c();
        } else {
            return (String) gnv.f18746q.mo58455c();
        }
    }
}
