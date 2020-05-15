package p000;

import android.app.Activity;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.graphics.Rect;
import android.view.WindowManager;

/* renamed from: avgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avgq {

    /* renamed from: a */
    public static final srn f93152a = srn.m36124a();

    /* renamed from: a */
    public static void m78480a(Activity activity) {
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            bnsl bnsl = (bnsl) f93152a.mo68388c();
            bnsl.mo68432a("avgq", "a", 42, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Root view bounds: %s", rect.flattenToString());
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.width = rect.width();
            attributes.height = rect.height();
            attributes.gravity = 48;
            activity.getWindow().setAttributes(attributes);
        } catch (Exception e) {
            bnsl bnsl2 = (bnsl) f93152a.mo68387b();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("avgq", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Couldn't hide caption bar");
        }
    }

    /* renamed from: a */
    public static boolean m78481a(Context context) {
        try {
            FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo.name != null && featureInfo.name.equals("org.chromium.arc")) {
                    return true;
                }
            }
        } catch (Exception e) {
            bnsl bnsl = (bnsl) f93152a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("avgq", "a", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Couldn't determine whether running on chromeOS");
        }
        return false;
    }
}
