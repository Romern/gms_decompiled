package p000;

import android.os.Build;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: rrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rrn {

    /* renamed from: a */
    private static final bjbc f43551a;

    static {
        bjbb bjbb = new bjbb(bjbc.m103136a());
        bjbb.f122457a = 0;
        bjbb.f122458b = false;
        f43551a = bjbb.mo64964a();
    }

    /* renamed from: a */
    public static void m34299a(ViewGroup viewGroup) {
        int i = Build.VERSION.SDK_INT;
        viewGroup.requestApplyInsets();
        viewGroup.addOnLayoutChangeListener(new rrm());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: a */
    public static void m34300a(Activity activity, String str, boolean z) {
        char c;
        int i = 0;
        if (str != null) {
            int a = f43551a.mo64966a(str);
            if (a == 0) {
                int hashCode = str.hashCode();
                if (hashCode != -180885253) {
                    if (hashCode == 1862631875 && str.equals("minutemaid")) {
                        c = 0;
                        if (c == 0) {
                            i = C0126R.style.auth_minutemaid_theme_material;
                        } else if (c == 1) {
                            int i2 = Build.VERSION.SDK_INT;
                            i = C0126R.style.DialogNoTitleTheme;
                        }
                    }
                } else if (str.equals("clamshell")) {
                    c = 1;
                    if (c == 0) {
                    }
                }
                c = 65535;
                if (c == 0) {
                }
            } else {
                i = a;
            }
        }
        if (i != 0) {
            activity.setTheme(i);
        }
        if (z) {
            bizb.m103017a(activity.getWindow());
        }
    }

    /* renamed from: a */
    public static boolean m34301a(String str) {
        return "glif".equals(str) || "glif_light".equals(str) || "glif_v2".equals(str) || "glif_v2_light".equals(str) || "glif_v3".equals(str) || "glif_v3_light".equals(str);
    }
}
